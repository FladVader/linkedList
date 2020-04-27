/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testpackage;

import singlelinkedlist.ListIndexOutOfBoundsException;
import singlelinkedlist.ListReferenceBased;

/**
 *
 * @author Anton
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ListIndexOutOfBoundsException {
        // TODO code application logic here

        
        ListReferenceBased list = new ListReferenceBased();
//        Person person1 = new Person("Michael Scott", "Regional Manager");
//        Person person2 = new Person("Dwight Schrute", "Assistant to the regional manager");
//        Person person3 = new Person("Jim Halpert", "Head of Sales");
//        Person person4 = new Person("Stanley Hudson", "Sales");

        
        Person person1 = new Person("Michael Scott", "Regional Manager");
        Person person2 = new Person("Dwight Schrute", "Assistant to the regional manager");
        Person person3 = new Person("Jim Halpert", "Head of Sales");
        Person person4 = new Person("Stanley Hudson", "Sales");

        list.printSize();

        list.add(0, person1);
        list.add(1, person2);
        list.add(2, person3);
        list.add(3, person4);

        list.printList();

        System.out.println("isEmpty? - " + list.isEmpty());

        list.printSize();

        System.out.println("\nLägger till en Person!");
        Person person5 = new Person("Pamela Beasley", "Receptionist");
        list.add(1, person5);

        list.printList();

        System.out.println("Tar bort en person!");

        list.remove(0);
        list.printList();
        
        System.out.println("Person på index 2 är: " + list.get(2).toString());
        
        list.removeAll();
        
        System.out.println("\nListan har tömts - Kontrollerar: isEmpty - " + list.isEmpty());
        list.printSize();
        System.out.println("\nProvar att söka ut person på Index 10:");
                  
         try {
                    list.get(10);

        } catch (ListIndexOutOfBoundsException e) {
             System.out.println(e);
        }
        
                
    }

}
