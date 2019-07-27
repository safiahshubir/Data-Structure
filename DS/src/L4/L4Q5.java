/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l4;

import java.util.Arrays;
import l4.FindMax.Circle;
/**
 *
 * @author user
 */
public class L4Q5 {

    public static void main(String[] args) {
        
        FindMax a = new FindMax();
        
        Integer[] intArray = {1, 2, 3};
        String[] strArray = {"red","green","blue"};
        //Circle[] circle = {3 , 2.9, 5.9};
        
        System.out.println(max(intArray));
        System.out.println(max(strArray));
        //System.out.println(max(circle));
    }
    
    public static <E extends Comparable<E>> E max(E[] list){
        Arrays.sort(list);
        
        return list[list.length-1];
    } 
}