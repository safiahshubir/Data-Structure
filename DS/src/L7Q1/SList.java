/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l7q1;

/**
 *
 * @author user
 */
public class SList<E> {
    private SNode<E> head;
    private SNode<E> tail;
    private int size;
    
    public SList(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    
    public void appendEnd(E e){
        if(head == null){
            head = new SNode<E>(e);
            tail = head;
        }
        else{
            tail.next = new SNode<E>(e);
            tail.next.previous = tail;
            tail = tail.next;
        }
        size++;
    }
            
    public E removeInitial(){
        E remove = head.element;
        head = head.next;
        size--;
        return remove;
    }
    
    public boolean contains(E e){
        SNode<E> counter = head;
        for(int i = 0; i < size; i++){
            if(counter.element == e){
                return true;
            }else{
                counter = counter.next;
            }
        }
        return false;
    }
    
    public void clear(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    
    public void display() {
        SNode<E> counter = head;
        for(int i = 0; i < size; i++){
            System.out.println(counter.element);
            counter = counter.next;
        }
    }
}
