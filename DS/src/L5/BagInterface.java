/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L5;

/**
 *
 * @author user
 */
public interface BagInterface<T> {

    public int getCurrentSize();
    
    public boolean isEmpty();
    
    public boolean add(T newEntry);
    
    public T remove();
    
    public boolean remove(T anEntry);
    
    public void clear();
    
    public int getFrequencyOf(T anEntry);
    
    public boolean contains(T anEntry);
    
    public T[] toArray();
    
    public BagInterface<T> union(BagInterface<T> anotherBag);
    
    public BagInterface<T> intersection(BagInterface<T> anotherBag);
    
    public BagInterface<T> difference(BagInterface<T> anotherBag);
    
}

