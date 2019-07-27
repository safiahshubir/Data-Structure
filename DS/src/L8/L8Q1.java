/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l8;

/**
 *
 * @author user
 */

public class L8Q1 {
public L8Q1(){}
    /**
     * @param args the command line arguments
     */
   public void selectionSortSmallest(int[] arr){  
        for (int i = 0; i < arr.length - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < arr.length; j++){  
                if (arr[j] < arr[index]){  
                    index = j;//searching for lowest index  
                }  
            }  
            int smallerNumber = arr[index];   
            arr[index] = arr[i];  
            arr[i] = smallerNumber;  
        }  
    }  
    
     public void selectionSortLargest(int[] arr){  
        for (int i = 0; i < arr.length-1; i++)  
        {  
            int maxIndex = i;  
            for (int j = i+1; j<arr.length; j++){  
                if (arr[j] > arr[maxIndex]){  
                    maxIndex = j;//searching for largest index  
                }  
            }  
            int largestNumber = arr[maxIndex];   
            arr[maxIndex] = arr[i];  
            arr[i] = largestNumber;  
        }  
    }  
       
     public static int[] insertionSort(int[] input){
         
        int temp;
        for (int i = 1; i < input.length; i++) {
            for(int j = i ; j > 0 ; j--){
                if(input[j] < input[j-1]){
                    temp = input[j];
                    input[j] = input[j-1];
                    input[j-1] = temp;
                }
            }
        }
       return input;
    
}
    public static void main(String a[]){  
        int[] arr1 = {9,14,3,2,43,11,58,22};  
       
       /* System.out.println("Before Selection Sort");  
        for(int i:arr1){  
            System.out.print(i+" ");  
        }  
        System.out.println();  
          */L8Q1 K=new L8Q1();
          
        K.selectionSortSmallest(arr1);//sorting array using selection sort  
         
        System.out.println("Ascending Order [selection sort]");  
        for(int i:arr1){  
            System.out.print(i+" ");  
        }
       int[] arr2 = {9,14,3,2,43,11,58,22};  
    
      K.selectionSortLargest(arr2);//sorting array using selection sort  
         
        System.out.println("\nDescending Order [selection sort]");  
        for(int j:arr2){  
            System.out.print(j+ " ");
        }
      int[] arr3 = {10,34,2,56,7,67,88,42};
        int[] arr4 = insertionSort(arr3);
        System.out.println("\nAscending Order [insertion sort]");  
        for(int i:arr4){
            System.out.print(i+" ");
        
    }
    }
    
}
