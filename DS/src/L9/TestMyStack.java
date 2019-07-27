/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l9;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class TestMyStack {

    public static void main(String[] args) {
        //Q1
        MyStack<Character> stack = new MyStack<>();

        stack.push('a');
        stack.push('b');
        stack.push('c');
        System.out.println(stack.toString());
        System.out.println(stack.search('b'));
        System.out.println(stack.search('k'));

        MyStack<Integer> stack2 = new MyStack<>();

        stack2.push(1);
        stack2.push(2);
        stack2.push(3);
        System.out.println(stack2.toString());
        System.out.println(stack2.search(6));
    
        //Q2
        Scanner a = new Scanner(System.in);
        Scanner b = new Scanner(System.in);
        MyStack<Object> stack3 = new MyStack<>();

        System.out.println("Enter no of Integer you want to Insert :");
        int index = a.nextInt();

        System.out.println("Enter Integer values you want to Insert :");
        for(int i =0;i<index;i++)
        {Object s = b.next();
        stack3.push(s);}

        System.out.println("Size of stack : "+stack3.getSize());

         for(int i =0;i<index;i++)
        { System.out.println(i +" Index :"+ stack3.pop());} 

        //Q3
        Random c = new Random();
        Random d = new Random();
        MyStack<Integer> stack4 = new MyStack<>();

        int index1 = c.nextInt(10);
        System.out.println("No Random Number generated : "+index1);

        for(int i =0;i<index1;i++)
        {int r = d.nextInt(50);
          stack4.push(r);}

         System.out.println(stack4.toString());
         int sum=0;

          while(!stack4.isEmpty()) {
              sum+=stack4.pop(); }

          System.out.println("Sum of all number in stack :" +sum);


       //Q4
          String input = "test";
          MyStack<Character> stack5 = new MyStack<Character>();

          for (int i = 0; i < input.length(); i++) {
              stack.push(input.charAt(i));   }

          String reverseInput = "";

          while (!stack.isEmpty()) {
              reverseInput += stack.pop();
          }
          if (input.equals(reverseInput))
              System.out.println("Yes,that is a palindrome.");
          else
              System.out.println("No, that isn't a palindrome.");

        
    }
    
    
    
}
