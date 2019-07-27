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
public class SNode<E> {
    SNode<E> prev = null;
    SNode<E> next = null;
    E element;
    
    public SNode(){
        this.element = null;
    }
    
    public SNode(E e){
        this.element = e;
    }
    
    public SNode(E e, SNode<E> prev, SNode<E> next){
        this.element = e;
        this.prev = prev;
        this.next = next;
    }
}
