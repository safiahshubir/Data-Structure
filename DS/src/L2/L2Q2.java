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
public class L2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
               
        System.out.println(permuteString("","ABCD"));
   
    }
    
    public static String permute(String text){ 
        if(text.length()==0)return "";
        for(int j=0; j<text.length(); j++){
            return text.charAt(j)+permute(text.replaceAll(text.substring(j,j+1),""));
        }
        return "?";
    }
    public static void permuteD(String f, String r){
        if(r.length() == 0){
            System.out.println(f+r);
        }
        else{
            for(int x = 0; x < r.length(); x++){
                String newR = f+r.substring(x, x+1);
                permuteD(newR,r.replaceAll(r.substring(x,x+1), ""));
            }
        }
    }
    //permutation methods
    public static String permuteString(String head, String leftovers){
        if(leftovers.length() == 0){
            return head+leftovers;
        }
        else{
            for(int x = 0; x < leftovers.length(); x++){
                String newR = head+leftovers.substring(x, x+1);
                permuteString(newR,leftovers.replaceAll(leftovers.substring(x,x+1), "")); //don't
            }
        }
        return "";
    }
}