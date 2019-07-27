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
public class L4Q2 {

    public static void main(String[] args) {
        
        MyGeneric<String>strObj = new MyGeneric<>();
        MyGeneric<Integer>intObj = new MyGeneric<>();
        
        strObj.setType("Data Structure");
        intObj.setType(500);
        
        System.out.println(strObj.getType());
        System.out.println(intObj.getType());
    }
    
}