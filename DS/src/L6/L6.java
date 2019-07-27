/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L6;

/**
 *
 * @author user
 */
public class L6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          MyLinkedList<Character> TestLinkedList = new MyLinkedList<>();
        TestLinkedList.addFirst('a');
        TestLinkedList.add('b');
        TestLinkedList.add('c');
        TestLinkedList.add('d');
        TestLinkedList.addLast('e');
        TestLinkedList.print();
        TestLinkedList.reverse();
        TestLinkedList.print();
//        int j=0;
//        switch(j){
//            case 0:TestLinkedList.set(j, 'h');
//            j++;
//            case 1:TestLinkedList.set(j, 'e');
//            j++;
//            case 2:TestLinkedList.set(j, 'l');
//            j++;
//            case 3:TestLinkedList.set(j, 'l');
//            j++;
//            case 4:TestLinkedList.set(j, 'o');
//        }
//       TestLinkedList.print();
        int NoE=0;
        for(int i=0 ;i<TestLinkedList.size;i++){
            if(TestLinkedList.get(i)!=null)
                NoE++;
        }
        System.out.println("Number of Elements: "+NoE);
        System.out.println("First Value: "+TestLinkedList.getFirst());
        System.out.println("Last Value: "+TestLinkedList.getLast());
        System.out.println("Middle value: "+TestLinkedList.getMiddleValue());
        System.out.print("After removal: ");
        TestLinkedList.remove((TestLinkedList.size)/2+1);
        TestLinkedList.print();
        System.out.println("Index Of Value 'b': "+TestLinkedList.indexOf('b'));
        System.out.println("Index Of Value 'c': "+TestLinkedList.indexOf('c'));
        System.out.println("Contain 'c': "+TestLinkedList.contains('c'));
        System.out.print("Final print: ");
       TestLinkedList.print();
        
    }
    
}
