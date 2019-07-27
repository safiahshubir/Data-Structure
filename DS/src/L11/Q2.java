/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab11;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 *
 * @author user
 */
public class Q2 {
    public static void main(String[]args){
    PriorityQueue<String> q1 = new PriorityQueue<>(Arrays.asList("George","Jim","John","Blake","Kevin","Michael"));
    PriorityQueue<String> q2 = new PriorityQueue<>(Arrays.asList("George", "Katie", "Kevin", "Michelle", "Ryan"));
//    
//    q1.offer("George");
//    q1.offer("Jim");
//    q1.offer("John");
//    q1.offer("Blake");
//    q1.offer("Kevin");
//    q1.offer("Michael");
//    
//    q2.offer("George");
//    q2.offer("Katie");
//    q2.offer("Kevin");
//    q2.offer("Michelle");
//    q2.offer("Ryan");
    
System.out.println("Set1: "+q1);
System.out.println("Set2: "+q2);
System.out.println("Union of sets: "+union(q1,q2));
System.out.println("Difference of sets: "+difference(q1,q2));
System.out.println("Intersection of sets: "+intersection(q1,q2));
    
    }
    
    private static <T> PriorityQueue<T> union(PriorityQueue<T> set1, PriorityQueue<T> set2){
    PriorityQueue<T> union = new PriorityQueue<>(set1); //copy set1 to union
    union.addAll(set2); //combine set2 into union
    return union;
    }
    
    private static <T> PriorityQueue<T> difference(PriorityQueue<T> set1, PriorityQueue<T> set2){
    PriorityQueue<T> difference = new PriorityQueue<>(set1); //copy set1 to difference
    difference.removeAll(set2); //remove same elements
    return difference;
    }
    
    private static<T> PriorityQueue<T> intersection(PriorityQueue set1, PriorityQueue set2){
    PriorityQueue<T> intersection = new PriorityQueue<>(set1); //copy set1 to intersection
    intersection.retainAll(set2); //remain same elements
    return intersection;
    }
    }

