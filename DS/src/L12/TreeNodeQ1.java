/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l12;

/**
 *
 * @author user
 */

public class TreeNodeQ1 <E extends Comparable<E>>{
    
     /*
    Create a package called BST and implement a node class called TreeNode<E> and 
    Binary Search Tree Class called BST<E>. Both the BST<E> and 
    TreeNode<E> classes extends Comparable.
    */
    
    E element;
    
    TreeNodeQ1<E> left;
    
    TreeNodeQ1<E>right;

    
    public TreeNodeQ1(E element) {
        
        this.element = element;
        
    }
    
}
