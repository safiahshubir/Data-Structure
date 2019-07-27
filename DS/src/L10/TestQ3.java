/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l10;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class TestQ3 {
    static MyQueue<Integer> share = new MyQueue<>();
    static MyQueue<Integer> price = new MyQueue<>();
    
    static String[]array;
    
    static int gain;
    
    public static void main(String[]args){
        
        getInput();
        while(!share.isEmpty()){
            if(array[0].equals("Sell"))
                sell();
            if(!share.isEmpty())
                getInput();
            else
                System.out.println("No more shares to sell\nFinal capital Gain/Loss : " + gain);
        }
    }
    
    public static void getInput(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your query (In format 'Buy/Sell x shares at $ each'): ");
        String string = in.nextLine();
        array = string.split(" ");
        
        if(array[0].equals("Buy"))
            buy();
    }
    
    public static void buy(){
        share.enqueue(Integer.parseInt(array[1]));
        price.enqueue(Integer.parseInt(array[4].substring(1,array[4].length())));
        
        System.out.println("\nBuying now.....");
        
        System.out.println("Queue for share : " + share.toString());
        System.out.println("Queue for price : " + price.toString() + "\n");
    }
    
    public static void sell(){
        System.out.println("\nSelling the shares now.....");
        
        int getShare = Integer.parseInt(array[1]);
        int getPrice =Integer.parseInt(array[4].substring(1, array[4].length()));
        
        
        while(getShare !=0){
            MyQueue<Integer> tshare = share;
            MyQueue<Integer> tprice = price;
            
            int peekShare = share.peek();
            int peekPrice = price.peek();
            
            gain = getShare * getPrice - peekShare * peekPrice;
            
            if(peekShare >= getShare){
                peekShare-= getShare;
                getShare =0;
                
                while(!share.isEmpty()&& !price.isEmpty()){
                    share.dequeue();
                    price.dequeue();
                }
                
                if(peekShare !=0){
                    share.enqueue(peekShare);
                    price.enqueue(peekPrice);
                }
                
                for(int i =1; i<tshare.getSize(); i++){
                    share.enqueue(tshare.getElement(i));
                    price.enqueue(tprice.getElement(i));
                }
            }
            else{
                getShare-= peekShare;
                share.dequeue();
                price.dequeue();
            }
            System.out.println("Total capital gain/loss : " +gain);
        }
        
        System.out.println("Queue for share : " + share.toString());
        System.out.println("Queue for price : " + price.toString() + "\n");
    }
    
}
