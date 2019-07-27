/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l4;

import java.util.Arrays;

/**
 *
 * @author user
 */
public class L4Q4 {

    public static void main(String[] args) {
        
        Integer[] intArray = {5,3,7,1,4,9,8,2};
        String[] strArray = {"red","blue","orange","tan"};
        
        minmax(intArray);
        
        
        System.out.println(minmax(intArray));
        System.out.println(minmax(strArray));
    }
    
    public static <T extends Comparable> String minmax(T[] t){
        T max = t[0];
        
        Arrays.sort(t);
        
        return "Min = " + t[0] + " Max = " + t[t.length-1];
    }
}
