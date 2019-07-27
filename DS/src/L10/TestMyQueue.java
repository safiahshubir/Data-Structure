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
public class TestMyQueue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[]a = {"Durian, Blueberry"};
        MyQueue<String> fruitQ = new MyQueue<>(a);
        
//        fruitQ.enqueue("Durian");
//        System.out.println("(1)" + fruitQ);
//        
//        fruitQ.enqueue("Blueberry");
//        System.out.println("(2)" + fruitQ);
        
        fruitQ.enqueue("Apple");
        System.out.println("(1)" + fruitQ);
        
        fruitQ.enqueue("Orange");
        System.out.println("(2)" + fruitQ);
        
        fruitQ.enqueue("Grapes");
        System.out.println("(3)" + fruitQ);
        
        fruitQ.enqueue("Cherry");
        System.out.println("(4)" + fruitQ);
        
        fruitQ.toString();
        System.out.println("(5)" + fruitQ);
        
        fruitQ.peek();
        System.out.println("(6)" + fruitQ.peek()) ;
        
        fruitQ.getSize();
        System.out.println("(7) Queue size : " + fruitQ.getSize());
        
        fruitQ.dequeue();
        System.out.println("(8)" + fruitQ);
        
        
        
        System.out.println("(9) Check for 'Cherry' in the queue : " + fruitQ.contains("Cherry"));
        System.out.println("(10) Check for 'Durian' in the queue : " + fruitQ.contains("Durian"));
        
        fruitQ.isEmpty();
        System.out.println("(11) Display the queue : " + fruitQ);
        
        
    }
    
}
