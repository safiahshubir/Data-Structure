/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l12;

/**
 *
 * @author user
 */
public class TestBSTQ1 {
    
    /*
      A)   Include necessary declaration in the BST<E>and TreeNode<E>classes.
      B)   Write a test program called  TestBSTin the BST package. 
           Using the appropriate methods you implemented in BST<E>,
            produce the following output:   
    */
    
    public static void main(String[] args) {
        
         BSTQ1<Integer> S = new BSTQ1<>();
         
        System.out.println("Input Data : 45,88,54,76,98,1,2,20,6,53,42,100,86,32,28,65,14");
        
        System.out.print(S.insert(45)+",");
        System.out.print(S.insert(88)+",");
        System.out.print(S.insert(54)+",");
        System.out.print(S.insert(76)+",");
        System.out.print(S.insert(98)+",");
        System.out.print(S.insert(1)+",");
        System.out.print(S.insert(2)+",");
        System.out.print(S.insert(20)+",");
        System.out.print(S.insert(6)+",");
        System.out.print(S.insert(53)+",");
        System.out.print(S.insert(42)+",");
        System.out.print(S.insert(100)+",");
        System.out.print(S.insert(86)+",");
        System.out.print(S.insert(32)+",");
        System.out.print(S.insert(28)+",");
        System.out.print(S.insert(65)+",");
        System.out.print(S.insert(14)+",");
        
        System.out.println("\nInorder(sorted):");
        
        S.inorder(S.root);
        System.out.println("\nPostOrder:");
        
        S.postorder(S.root);
        System.out.println("\nPreOrder");
        
        S.preorder(S.root);
        System.out.println("");
        
        System.out.print("Height of BST:");
        
        System.out.print(S.height());
        System.out.println("");
        System.out.println("Check whether 10 is in the tree?"+S.search(65));
       
        System.out.println("Delete 53");
        S.delete(53);
        
        System.out.println("Updated inorder data(sorted)");
        S.inorder(S.root);
        System.out.println("");
        
        System.out.print("MIN value:");
        System.out.print(S.minValue());
        
        System.out.println("");
        System.out.print("MAX value:");
        System.out.print(S.maxValue()); 
        
        System.out.println("");
        System.out.print("A path from the root to  6 is: ");
        
       for (TreeNodeQ1<Integer> node : S.path(6)) {
           
            System.out.print(node.element+" ");
            
        }
        
    }
}