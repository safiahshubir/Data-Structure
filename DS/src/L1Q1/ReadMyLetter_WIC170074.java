/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L1Q1;

/**
 *
 * @author user
 */
import java.io.*;
import java.util.Scanner;

public class ReadMyLetter_WIC170074  {

  /*  public static void main(String[] args) throws FileNotFoundException {
        
        Scanner sc = new Scanner(new File("Safiah_WIC170074.txt"));
        Scanner in = new Scanner(System.in);

        while(sc.hasNextLine()){
            System.out.print(sc.nextLine());
            System.out.println("");
        }
        //Part II & III
        try{
            PrintWriter p = new PrintWriter(new FileWriter("Safiah_WIC170074.txt",true));
            
            p.println();
            int d = 1;
            while(d == 1){
                String line;
                line = in.nextLine();
                if(line.equals("endletter")){
                    break;
                }else{
                    p.print(line);
                    p.println();
                }
            }            
            p.close();
        }catch(Exception e){
            System.out.println("Problem with input");
        }
    }
    
}*/
       public static void main(String[] args) throws FileNotFoundException {
      Scanner sc = new Scanner(new FileReader("Safiah_WIC170074.txt"));
        Scanner in = new Scanner(System.in);
        
//        while(sc.hasNext()){
//            String s = sc.next();
//            char c = s.charAt(s.length()-1);
//            if(c == '.'){
//                System.out.print(s);
//                System.out.print(" \n");
//            }else{
//                System.out.print(s);
//                System.out.print(" ");
//            }
//        }

        while(sc.hasNextLine()){
            System.out.print(sc.nextLine());
            System.out.println("");
        }
         //Part II & III
        try{
            PrintWriter p = new PrintWriter(new FileWriter("Safiah_WIC170074.txt",true));
            
            p.println();
            int d = 1;
            while(d == 1){
                String line;
                line = in.nextLine();
                if(line.equals("endletter")){
                    break;
                }else{
                    p.print(line);
                    p.println();
                }
            }            
            p.close();
        }catch(Exception e){
            System.out.println("Problem with input");
        }
    }
}
        
