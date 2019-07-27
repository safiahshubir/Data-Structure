/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L7Q2;

import java.util.*;
import java.io.*;
/**
 *
 * @author user
 */
public class L7Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        KindergartenList<String> list = new KindergartenList();
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your student name list. Enter 'n' to end.....");
        String line;
        while(true){
            String name = in.readLine();
            if(name.charAt(0) == 'n' && name.length() == 1)//cant for name == "n"
                break;
            else
                list.add(name);
        }
        System.out.println("\nYou have entered the following students' name :");
        list.printList();
        
        System.out.println("\nThe number of students entered is : " + list.getSize());
        do{
            System.out.println("\nAll the names entered are correct? Enter 'r' to rename the student name, 'n' tp proceed.");
            line = in.readLine();
            if(line.charAt(0) == 'r' && line.length() == 1){
                System.out.println("\nEnter the existing student name that u want to rename : ");
                String e = in.readLine();
                System.out.println("\nEnter the new name : ");
                String newE = in.readLine();
                list.replace(e, newE);
                System.out.println("\nThe new student list is : ");
                list.printList();
            }else if(line.charAt(0) != 'n' || line.length() != 1)
                System.out.println("Please enter only 'r' or 'n'");
        }while(line.charAt(0) != 'n' || line.length() != 1);
        do{
            System.out.println("\nDo you want to remove any of your student name? Enter 'y' for yes, 'n' to proceed. ");
            line = in.readLine();
            if(line.charAt(0) == 'y' && line.length() == 1){
                System.out.println("\nEnter a student name to remove : ");
                String e = in.readLine();
                list.removeElement(e);
                System.out.println("\nThe number of updated students is : " + list.getSize());
                System.out.println("The updated student list is : ");
                list.printList();
            }else if(line.charAt(0) != 'n' || line.length() != 1)
                System.out.println("Please enter only 'y' or 'n'");
        }while(line.charAt(0) != 'n' || line.length() != 1);
        System.out.println("\nAll student data captured complete. Thank you!");
    }
    
}
