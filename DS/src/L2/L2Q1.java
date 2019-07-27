/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l2;

/**
 *
 * @author user
 */
public class L2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
             
        System.out.println(D("Astronaut"));
    }
    
    public static String D(String word){
        if(word.isEmpty()) return word;
        else if(word.charAt(0) == 'a'){
            return "i"+word.substring(1);
        }
        return word.charAt(0)+D(word.substring(1));
        
    }
}
    
    

