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
public class StorePairGeneric <T> implements Comparable{

    private int first,second;
        
        public StorePairGeneric(int first, int second){
            this.first = first;
            this.second = second;
        }
        
        public int getFirst(){
            return first;
        }
        public int getSecond(){
            return second;
        }
        public void setPair(int first, int second){
            this.first = first;
            this.second =  second;
        }
    @Override
        public String toString(){
            return "first = " + first + "second = "+ second;
        }
    @Override
        public boolean equals(Object obj){
        return first == second;
        }
    @Override
        public int compareTo(Object t) {
            if(first > second){
                return 1;
            }
            else if(second > first){
                return -1;
            }
            else return 0;
        }
}
