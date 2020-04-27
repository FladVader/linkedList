/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singlelinkedlist;

/**
 *
 * @author Anton
 */
public class Node
{
  private Object item;
  private Node next;

  public Node(Object newItem)
  {
    item = newItem;
    next = null;
  } // end constructor

  public Node(Object newItem, Node nextNode)
  {
    item = newItem;
    next = nextNode;
  } // end constructor

  public void setItem(Object newItem)
  {
    item = newItem;
  } // end setItem

  public Object getItem()
  {
    return item;
  } // end getItem

  public void setNext(Node nextNode)
  {
    next = nextNode;
  } // end setNext

  public Node getNext()
  {
    return next;
  } // end getNext

} // end class Node