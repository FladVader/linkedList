/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singlelinkedlist;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Anton
 */
public class ListReferenceBased implements ListInterface {

    private Node head;
    private int itemCounter;

    //Skapar en tom lista
    public ListReferenceBased() {

        //Sätter head till null när listan skapas upp
        head = null;
        itemCounter = 0;

    }

    public Node find(int index) {

        //"Bläddrar" igenom listan för att hitta objektet
        Node curr = head;
        for (int skip = 0; skip < index; skip++) {

            curr = curr.getNext();
        }
        return curr;
    }

    public void add(int index, Object item) throws ListIndexOutOfBoundsException {
        if (index >= 0 && index <= itemCounter) {

            //Om index är 0, lägger till objektet i början av listan
            if (index == 0) {

                Node newNode = new Node(item, head);
                head = newNode;
            } else {

                //Letar upp föregående nod
                Node prev = find(index - 1);

                //Skapar en ny nod som refererar till noden framför
                Node newNode = new Node(item, prev.getNext());

                //referar föregående nod till den nya noden
                prev.setNext(newNode);
            } // end if
            itemCounter++;

        } else {
            throw new ListIndexOutOfBoundsException("List index out of bounds on add");
        } // end if
    }  // end add

    public Object get(int index)
            throws ListIndexOutOfBoundsException {
        if (index >= 0 && index < itemCounter) {
            Node curr = find(index);
            Object dataItem = curr.getItem();
            return dataItem;
        } else {
            throw new ListIndexOutOfBoundsException("List index out of bounds on get");

        } // end if
    } // end get

    public boolean isEmpty() {

        return (itemCounter == 0);
    }

    public void remove(int index) {

        if (itemCounter != 0) {

            if (index == 0) {

                head = head.getNext();
                itemCounter--;
            } else {
                Node previousNode = find(index - 1);
                Node currentNode = previousNode.getNext();

                Node nextNode = currentNode.getNext();

                previousNode.setNext(nextNode);

                itemCounter--;

            }
        }
    }

    public void removeAll() {

        head = null;
        itemCounter = 0;
    }

    public int size() {
        return itemCounter;
    }  // end size

    @Override
    public String toString() {
        String str = new String();
        for (int i = 0; i < size(); i++) {
            try {

                Object tempObject = get(i);

                str += (tempObject.toString() + " ");
            } catch (ListIndexOutOfBoundsException ex) {
                Logger.getLogger(ListReferenceBased.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        return str;
    }

    public void printList() {

        for (int i = 0; i < size(); i++) {
            try {

                Object tempObject = get(i);
                System.out.println("Index " + i + "-> " + tempObject.toString());

            } catch (ListIndexOutOfBoundsException ex) {
                Logger.getLogger(ListReferenceBased.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        System.out.println("");

    }

    public void printSize() {

        System.out.println("Listan innehåller nu: " + size() + " noder!");
    }
}
