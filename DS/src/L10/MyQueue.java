/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l10;

/**
 *
 * @author user
 */
public class MyQueue <E> {
  
    private java.util.LinkedList<E> list = new java.util.LinkedList<>();
    
    public MyQueue(E [] e){
         for(int i=0; i<e.length ; i++){
         list.add(e[i]);
         }
    }
    
    public MyQueue(){  
    }
        
    
    public void enqueue(E e){
        list.addLast(e);
    }
    
    public E dequeue(){
        return list.removeFirst();
    }
    
    public E getElement(int i){
        return list.element();
    }
    
    public E peek(){
        return list.peek();
    }
    
    public int getSize(){
        return list.size();
    }
    
    public boolean contains (E e){
        return list.contains(e);
    }
    
    public boolean isEmpty(){
        return list.isEmpty();
    }
    
    public String toString(){
        return "Queue : " + list.toString();
    }
}
