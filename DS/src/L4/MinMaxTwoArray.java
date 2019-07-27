/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l4;

import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author user
 */
public class MinMaxTwoArray {
    
    public static <E extends Comparable<E>> E min (E[][]list){
        
        Comparator<Integer[]> com = new Comparator<Integer[]>(){
            @Override
            public int compare(Integer[] t1, Integer[] t2) {
                return t1[0].compareTo(t2[0]);
            }
            
        };
        
        Arrays.sort(list);
        
        return list[0][0];
    }
    public static <E extends Comparable<E>> E max (E[][]list){
         
        Arrays.sort(list);
        
        return list[0][0];
    }
    
}
