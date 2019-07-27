

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L1Q1;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class L1Q2 {
     public static void main(String[] args) throws FileNotFoundException {
     int charCount;
        
        Scanner sc1_1 = new Scanner(new FileReader("text1.txt"));
        Scanner sc1_2 = new Scanner(new FileReader("text1.txt"));
        Scanner sc1_3 = new Scanner(new FileReader("text1.txt"));
       
        charCount = charCount(sc1_1);
        System.out.println("Number of characters in text1 : "+charCount+"\n");
        displayChar(sc1_2,sc1_3);
        
        Scanner sc2_1 = new Scanner(new FileReader("text2.txt"));
        Scanner sc2_2 = new Scanner(new FileReader("text2.txt"));
        Scanner sc2_3 = new Scanner(new FileReader("text2.txt"));
        
        charCount = charCount(sc2_1);
        System.out.println("Number of characters in text2 : "+charCount+"\n");
        displayChar(sc2_2,sc2_3);
        
        Scanner sc3_1 = new Scanner(new FileReader("text3.txt"));
        Scanner sc3_2 = new Scanner(new FileReader("text3.txt"));
        Scanner sc3_3 = new Scanner(new FileReader("text3.txt"));
        
        charCount = charCount(sc3_1);
        System.out.println("Number of characters in text3 : "+charCount+"\n");
        displayChar(sc3_2,sc3_3);
        
        Scanner sc4_1 = new Scanner(new FileReader("text4.txt"));
        Scanner sc4_2 = new Scanner(new FileReader("text4.txt"));
        Scanner sc4_3 = new Scanner(new FileReader("text4.txt"));
        
         charCount = charCount(sc4_1);
        System.out.println("Number of characters in text4 : "+charCount+"\n\n");
        displayChar(sc4_2,sc4_3);
    }
      public static int charCount(Scanner O){
        int charCount = 0;
        while(O.hasNext()){
            String c;
            c = O.next();
            for(int x = 0; x < c.length(); x++){
                char character = c.charAt(x);
                if(Character.isLetterOrDigit(character)){
                    charCount++;
                }else;                
            }
        }    
        return charCount;
        
         }
    //display the characters without special characters
    public static void displayChar(Scanner C,Scanner line){
        int lineN = 0;
        while(line.hasNextLine()){
            line.nextLine();
            lineN++;
        }
line.close();
        String[] text = new String[lineN];
        int y = 0;        
        while(C.hasNext()){
            String c;
            c = C.nextLine(); //read the whole line
            if(y < lineN){
                text[y++] = c.replaceAll("[^a-zA-Z0-9]",""); //remove any special characters & assign the 
            }else;            
        }
        for(int x = 0; x < text.length; x++){
            System.out.println(text[x]);
        }
        System.out.println("");
    }
}
    


    

