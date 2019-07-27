/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab11;

import java.awt.print.Book;
import java.util.*;
import java.util.Queue;

/**
 *
 * @author user
 */
public class mainComparableBook {
    public static void main(String[] args) {
Queue<ComparableBook> BookQueue = new java.util.PriorityQueue<>();
BookQueue.add(new ComparableBook(1065, "Effective Java: Third Edition"));
BookQueue.add(new ComparableBook(3012, "Java: A Beginner Guide Seventh Edition"));
BookQueue.add(new ComparableBook(1097, "Learn Java in One Day and Learn It Well"));
BookQueue.add(new ComparableBook(7063, "Beginning Programming with Java (Dummies)"));
BookQueue.add(new ComparableBook(6481, "Java: Programming Basic for Absolute Beginner"));
System.out.println(BookQueue);
while (BookQueue.peek() != null) {
System.out.println("Head Element: " + BookQueue.peek().toString());
BookQueue.remove();
System.out.println("Priority queue: " + BookQueue.toString());
}
    }
}


class ComparableBook <E> implements Comparable<ComparableBook>{
    int id;
    String name;
    
    public ComparableBook(int id, String name){
    this.id = id;
    this.name = name;
    }
    
    @Override
    public int compareTo(ComparableBook a) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates
    if(id>a.id)
        return -1;
    else if(id<a.id)    
        return 1;
    else
        return 0;
    }   
    @Override
    public String toString(){
      return  this.id +" "+this.name+" ";
    }
}
