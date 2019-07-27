/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l7q1;

/**
 *
 * @author user
 */
public class L7Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
        SList<String> list = new SList();
        list.appendEnd("Linked list");
        list.appendEnd("is");
        list.appendEnd("easy");
        list.display();
        list.removeInitial();
        System.out.println(list.contains("difficult"));
        list.display();
        list.clear();
        list.display();
    }
    
}
