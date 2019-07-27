/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l4;

/**
 *
 * @author user
 */
public class MyGeneric<T>{
    
    private T e;
    
    MyGeneric(){
        
    }
    MyGeneric(T e){
        this.e = e;
    }
    
    public void setType(T t){
        e = t;
    }
    public T getType(){
        return e;
    }
    
}