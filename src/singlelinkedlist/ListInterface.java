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
public interface ListInterface {
    
    public void add (int index, Object object) throws ListIndexOutOfBoundsException;
    
    public Object get (int index)throws ListIndexOutOfBoundsException;
    
    public boolean isEmpty();
    
    public void remove(int index) throws ListIndexOutOfBoundsException;
    
    public void removeAll();
    
    public int size();
        
        
    
    
}
