/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l4;

/**
 *
 * @author user
 */
public class CompareMax<T>{
    
    public CompareMax(){}
    
    public static <T extends Comparable> T maximum(T first, T second, T third){
        
        T n1 = first;
        T n2 = second;
        T n3 = third;
        
        if(n1.compareTo(n2)>0){
            if(n1.compareTo(n3)>0){
                return n1;
            }
            else{
                return n3;
            }
        }
        else if(n1.compareTo(n2)< 0){
            if(n2.compareTo(n3)> 0){
                return n2;
            }
            else{
                return n3;
            }
        }
        else{
            if(n1.compareTo(n3)>0){
                return n1;
            }
            else if(n1.compareTo(n3)<0){
                return n3;
            }
            else return n1;
        }
    }
    
    public static void main(String[] args){
        
        CompareMax<Integer> c = new CompareMax<>();
        
        System.out.println(CompareMax.<Integer>maximum(11, 2, 65));
    }
}
