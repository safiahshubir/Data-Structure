/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l10;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class TestPalindromeQueue {
    
    public static void main(String[] args) {
        System.out.print("Enter any string : ");
        Scanner in = new Scanner (System.in);
        String inputString = in.nextLine();
        Queue queue = new LinkedList();
        
        for(int i = inputString.length()-1; i>=0; i--){
            queue.add(inputString.charAt(i));
        }
        
        String reverseString = " ";
        
        while(!queue.isEmpty()){
            reverseString = reverseString+queue.remove();
        }
        
        if(inputString.equals(reverseString))
            System.out.println("The input String is a palindrome.");
        else
            System.out.println("The input String is not a palindrome.");
    }
    
}
