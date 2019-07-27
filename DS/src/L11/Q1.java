/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab11;

import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;

/**
 *
 * @author user
 */
public class Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int[] array = {4,8,1,2,9,6,3,7};
       
        for(int a=0; a<array.length; a++)
           pq.add(array[a]);
        System.out.println("\nElements in queue: "+pq.toString());
                
        System.out.println("Poll(): "+pq.poll());
        System.out.println("Add() element 5");
        pq.add(5);
        System.out.println("toArray(): ");
        Object[] arr2 = pq.toArray();
        for(int i=0; i<array.length; i++)
            System.out.print(arr2[i]+" ");
        
        System.out.println("\nPeek(): "+pq.peek());
        System.out.println("Contains(1): "+pq.contains(1));
        System.out.println("Size(): "+pq.size());
        System.out.println("isEmpty(): "+pq.isEmpty());
      
        PriorityQueue reverse = new PriorityQueue(pq.size(), Collections.reverseOrder());
        for(int j=0; j<8; j++)
            reverse.add(pq.poll());
        System.out.println("Reversing order: ");
        while(reverse.size()>0)
            System.out.print(reverse.remove()+" ");
        
               
        
    }
    
}

