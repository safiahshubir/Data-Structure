/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L7Q3;

/**
 *
 * @author user
 */
public class DoublyLinkedList<E> {
    private SNode<E> head;
    private SNode<E> tail;
    private int size;
    
    public DoublyLinkedList(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    
    public void addFirst(E e){
        if(size == 0){
            head = new SNode(e);
            tail = head;
        }else{
            head.prev = new SNode(e, null, head);
            head = head.prev;
        }
        size++;
    }
    
    public void addLast(E e){
        if(size == 0){
            head = new SNode(e);
            tail = head;
        }else{
            tail.next = new SNode(e, tail, null);
            tail = tail.next;
        }
        size++;
    }
    
    public void add(int index, E e){
        if(size == 0) this.addLast(e);
        else if(index >= size)System.out.println("Warning : Index not in boundry");
        else if(index == 0) this.addFirst(e);
        else if(index == size) this.addLast(e);
        else if(index <= size/2){
            SNode<E> current = head;
            for(int i = 1; i < index; i++) {current = current.next;}
            current.next = new SNode(e, current, current.next);
            current.next.next.prev = current.next;
            size++;
        }else{
            SNode<E> current = tail;
            for(int i = size - 2; i > index; i--) {current = current.prev;}
            current.prev = new SNode(e, current.prev, current);
            current.prev.prev.next = current.prev;
            size++;
        }
    }
    
    public void iterateForward(){
        System.out.println("iterating forward...");
        SNode current = head;
        for(int i = 0; i < size; i++){
            System.out.println(current.element);
            current = current.next;
        }
    }
    
    public void iterateBackward(){
        System.out.println("iterating backward...");
        SNode current = tail;
        for(int i = size-1; i >= 0; i--){
            System.out.println(current.element);
            current = current.prev;
        }
    }
    
    public E removeFirst(){
        E e = head.element;
        head = head.next;
        size--;
        return e;
    }
    
    public E removeLast(){
        E e = tail.element;
        tail = tail.prev;
        size--;
        return e;
    }
    
    public E remove(int index){
        if(index >= size) {System.out.println("Index not in boundry"); return null;}
        else if(index == 0) return this.removeFirst();
        else if(index == size - 1) return this.removeLast();
        else if(index <= size/2){
            SNode<E> current = head;
            for(int i = 1; i <= index; i++) current = current.next;
            E e = current.element;
            current.next = current.next.next;
            size--;
            return e;
        }else{
            SNode<E> current = tail;
            for(int i = size - 1; i >= index; i--) current = current.prev;
            E e = current.element;
            current.prev = current.prev.prev;
            size--;
            return e;
        }
    }
    
    public void clear(){
        head = null;
        tail = null;
        size = 0;
    }
    
    public int getSize(){
        return size;
    }
}
