/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l9;

/**
 *
 * @author user
 */
public class MyStack<E> {
    private java.util.ArrayList<E> arr = new java.util.ArrayList<>();
    
    public void push(E o){
        arr.add(o); }
    
    public E pop(){
        E o = arr.get(getSize()-1);
        arr.remove(getSize()-1);
        return o;
    }
    
    public E peek(){
        return arr.get(getSize()-1);
    }
    public int getSize(){
        return arr.size();
    }
    public boolean isEmpty(){
        return arr.isEmpty();
    }
    public String toString(){
        return "stack: "+ arr.toString();
    }
    public boolean search(E o){
        if(arr.contains(o))
            return true;
        return false;
    }
}
