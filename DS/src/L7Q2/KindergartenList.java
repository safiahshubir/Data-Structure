/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L7Q2;

/**
 *
 * @author user
 */
public class KindergartenList<E> {
    private SNode<E> head;
    private SNode<E> tail;
    private int size;
    
    public KindergartenList(){
        head = null;
        tail = null;
        size = 0;
    }
    
    public void add(E e){
        if(head == null){
            head = new SNode<E>(e);
            tail = head;
        }else{
            tail.next = new SNode<E>(e);
            tail = tail.next;
        }
        size++;
    }
    
    public void removeElement(E e) {
        SNode<E> current = head;
        SNode<E> bcurrent = null;
        for(int i = 0; i < size; i++){
            if(current.element.equals(e)){
                bcurrent.next = current.next;
                size--;
                break;
            }else{
                bcurrent = current;
                current = current.next;
            }
        }
    }
    
    public void printList() {
        SNode<E> counter = head; 
        for(int i = 0; i < size; i++){
            System.out.print(counter.element);
            if(i < size - 1)
                System.out.print(", ");
            else
                System.out.print(".");
            counter = counter.next;
        }
        System.out.print("\n");
    }
    
    public int getSize() {
        return size;
    }
    
    public boolean contains(E e) {
        SNode<E> counter = head;
        for(int i = 0; i < size; i++){
            if(counter.element.equals(e))
                return true;
            else
                counter = counter.next;
        }
        return false;
    }
    
    public void replace(E e, E newE) {
        SNode<E> current = head;
        for(int i = 0; i < size; i++){
            if(current.element.equals(e)){
                current.element = newE;
                System.out.println(current.element);
                break;
            }else{
                current = current.next;
            }
        }
    }
}
