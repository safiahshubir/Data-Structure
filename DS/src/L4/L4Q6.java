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
public class L4Q6 {

    public static void main(String[] args) {
        
        MinMaxTwoArray mm = new MinMaxTwoArray();
        
        Integer[][]numbers = {{4,5,6},{1,2,3}};
        
        System.out.println(MinMaxTwoArray.<Integer>min(numbers));
        System.out.println(MinMaxTwoArray.<Integer>max(numbers));
    }
       
}