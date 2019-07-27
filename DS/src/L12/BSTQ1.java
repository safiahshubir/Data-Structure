/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l12;


import java.util.ArrayList;

/**
 *
 * @author user
 */
public class BSTQ1 <E extends Comparable<E>> {
    
    /*
       Implement the following methods in class BST<E>:
    */
    
       TreeNodeQ1<E> root;
       private int size;
    
       
       
       // Returns true if the element is in the tree
        public boolean search(E e) {
            
        boolean exits = false;
        TreeNodeQ1<E> current = root;
        while (current != null) {
            if (e.compareTo(current.element) > 0) {
                current = current.right;
            } else if (e.compareTo(current.element) < 0) {
                current = current.left;
            } else {
                exits = true;
                break;
            }
        }
        return exits;
        
    }

    //Insert element o into the binary tree and return true if the element is inserted successfully
        
    public boolean insert(E e) {
        
        TreeNodeQ1<E> newnode = new TreeNodeQ1<>(e);
        TreeNodeQ1<E> parent = root;
        if (root == null) {
            root = newnode;
        } else {
            TreeNodeQ1<E> current = root;
            while (current != null) {
                if (e.compareTo(current.element) > 0) {
                    parent = current;
                    current = current.right;
                }else if(e.compareTo(current.element)<0) {
                    parent = current;
                    current = current.left;
                } else {
                    return false;
                }
                
            }

            if (e.compareTo(parent.element) > 0) {
                parent.right = new TreeNodeQ1(e);
            } else {
                parent.left = new TreeNodeQ1(e);
            }
        }
        size++;
        return true;
        
    }
    
    //Get the number of nodes in the tree
    public int getSize() {
        
        return size;
        
    }
    
    //Returns the height of the BST
    public int height() {
        return height(root);
    }

    
    // Returns the height of the BST
    private int height(TreeNodeQ1<E> node) {
        int leftcount,rightcount;
        if(node==null){
            return -1;
        }else{
            leftcount = height(node.left)+1;
            rightcount = height(node.right)+1;
        }
        return Math.max(leftcount, rightcount);
    }

    
    // Returns the root of the BST
    public E getRoot() {
        return root.element;
    }
    
    
    // Returns the minimum value of the BST
    public E minValue() {

        TreeNodeQ1<E> parent = null;
        TreeNodeQ1<E> current = root;
        while (current!= null) {
            parent=current;
            current = current.left;
        }
        return parent.element;
    }
     
    
    
    // Returns the maximum value of the BST
    public E maxValue() {

        if(root==null) return null;
        TreeNodeQ1<E> current = root;
        TreeNodeQ1<E> parent = null; 
        while (current!= null) {
            parent=current;
            current = current.right;
        }
        return parent.element;
        
    }

    
    
    
     // Returns a path from the root leading to the specified element
    
    public ArrayList<TreeNodeQ1<E>> path(E e) {
        ArrayList<TreeNodeQ1<E>> pathnode = new ArrayList();
        TreeNodeQ1<E> current = root;
        while (current != null) {
            if (e.compareTo(current.element) > 0) {
                pathnode.add(current);
                current = current.right;
            } else if (e.compareTo(current.element) < 0) {
                pathnode.add(current);
                current = current.left;
            } else {
                pathnode.add(current);
                break;
            }
        }
        return pathnode;
    }
    
  //  Delete an element from the binary tree. Return true if the element is deleted successfully, 
  //  and return false if the element is not in the tree
    
    public boolean delete(E e) {
        TreeNodeQ1<E> current = root;
        TreeNodeQ1<E> parent = null;
        boolean click = search(e);
        if (click == false) {
            return false;
        } 
        while (click==true) {
                if (e.compareTo(current.element) > 0) {
                    parent = current;
                    current = current.right;
                } else if (e.compareTo(current.element) < 0) {
                    parent = current;
                    current = current.left;
                } else break;
            }

            if (current.left == null) { //case1
                if (current.element.compareTo(parent.element) > 0)
                    parent.right = current.right;
                 else 
                    parent.left = current.right;
            } else { //case2
                TreeNodeQ1<E> rightparent = current;
                TreeNodeQ1<E> rightcurrent = current.left;
                while (rightcurrent.right!= null) {
                    System.out.println(rightparent.element);
                    rightparent = rightcurrent;
                    rightcurrent = rightcurrent.right;
                }
                current.element = rightcurrent.element; //overide the element
                rightparent.right = rightcurrent.left; // get rid the most right node
            }
        size--;
        return true;
        
    }
    
    
    // Remove all elements from the tree
    public boolean clear() {
        if (root != null) {
            return false;
        } else {
            root = null;
            size = 0;
            return true;
        }

    }
    
    // Display inorder traversal from a subtree
    protected void inorder(TreeNodeQ1<E> root) {
       if(root==null) return;
        inorder(root.left);
        System.out.print(root.element+" ");
        inorder(root.right); 
        
        }
    
      // Display postorder traversal from a subtree
        protected void postorder(TreeNodeQ1<E> root){
        if(root==null)return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.element+" ");
        
    }
        
        // Display preorder traversal from a subtree
        protected void preorder(TreeNodeQ1<E> root) {
        if(root==null) return;
        System.out.print(root.element+" ");
        preorder(root.left);
        preorder(root.right);
    }
        
}
