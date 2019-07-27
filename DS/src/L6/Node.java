/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L6;

/**
 *
 * @author user
 */
public class Node <E>{
    E element;
    Node <E>next=null;
    public Node(){
        
    }
    public Node(E element){
        this.element=element;
    }
    
}
class MyLinkedList <E>{
    Node<E> head;
    Node<E> tail;
    int size=0;
     MyLinkedList(){
            head = null;
            tail = null;
    }
    public void addFirst(E e){
        Node<E> newHead = new Node(e);
        newHead.next=head;
        head=newHead;
        size++;
    }
    public void addLast(E e){
       tail=head;
       if(size==0){
               head=new Node(e);
               size++;
           return;
       }
       while(tail.next!=null){
       tail = tail.next;
        }
        tail.next = new Node(e);
        tail=tail.next;
        
        size++;
    }
    public void add(E e){
        addLast(e);
    }
    
    public void add(int index,E e){
        if(index>=0||index<=size){
            if(index==0)
           addFirst(e);
            else if(index==size)
                addLast(e);
            else{
                Node current=head;
            for(int i =1;i<index;i++){
                current=current.next;
            }
            Node temp=new Node(e);
            temp.next=current.next;
            current.next=temp;
            size++;
            }
            
        }
        
    }
    public E removeFirst(){
         if(head==null)
             return null;
         else{
             Node<E> temp=head;
             head=head.next;
             size--;
             return temp.element;
         }
         
         
    }
    public E removeLast(){
        Node<E> current=head;
        if(size==0)
            return null;
        if(size==1)
            return removeFirst();
        
       for(int i=1;i<size-1;i++){
           current=current.next;
       }
       Node<E> temp=current.next;
       current.next=null;
       
       size--;
       return temp.element;
    }
    public E remove(int index){
        
        if(index>=0||index<=size){
        if(index==0)
            return removeFirst();
        if(index==size)
            return removeLast();
        else{
            Node<E> current=head;
            for(int i =1;i<index-1;i++){
                current=current.next;
            }
            Node<E> temp=current.next;
            current.next=current.next.next;
            size--;
            return temp.element;
        }
        
        }
       return null;
    }
    public boolean contains(E e){
        Node<E> current = head;
        boolean have=false;
        for(int i =0;i<size;i++){
            if(current.element==e)
                have=true;
                    current=current.next;
            }
        return have;
    }
    public E get(int index){
        Node<E> current=head;
        for(int i =0;i<index;i++){
                    current=current.next;
            }
        return current.element;
    }
    public E getFirst(){
        return get(0);
    }
    public E getLast(){
        return get(size-1);
    }
    public int indexOf(E e){
        Node<E> current = head;
        for(int i =0;i<size;i++){
            if(current.element==e)
                return i;
            else
                    current=current.next;
            }
        return -1;
    }
    public int lastIndexOf(E e){
        Node<E> current=head;
        int count=0;
        
        for(int i =0;i<size;i++){
            if(current.element==e){
                count=i;
                current=current.next;
            }
            else
                    current=current.next;
            }
        if(count==0){
            return -1;
        }
        return count;
    }
    public E set(int index,E e){
        Node <E> current = head;
        E replace=null;
        for(int i =0;i<size;i++){
            if(i==index){
                replace=current.element;
                current.element=e;
                current=current.next;
            }
            else
                    current=current.next;
            }
        return replace;
    }
    public void clear(){
        int Size=size;
        for(int i =0 ;i<Size;i++){
            head=head.next;
            size--;
        }
    }
    public void print(){
        Node<E> current=head;
        for(int i=0;i<size;i++){
            System.out.print(current.element+" ");
            current=current.next;
        }
        System.out.println("");
    }
    public void reverse(){
       Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }
    public E getMiddleValue(){
        return get((size/2));
    }
}