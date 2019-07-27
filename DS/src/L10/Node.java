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
public class Node {
    int stockQuantity;
    double stockPrice;
    
    Node next;
    
    Node(){
        
    }
    
    public void setElement(int quantity, double price){
        stockQuantity = quantity;
        stockPrice = price;
    }
    
    public void setNext(Node n){
        next = n;
    }
    
    public int getElement1(){
        return stockQuantity;
    }
    
    public double getElement2(){
        return stockPrice;
    }
    
    public Node getNext(){
        return next;
    }
    
}
