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
public class ArrayBag<T> implements BagInterface<T> {
    
    private T[] bag;
    private static final int DEFAULT_CAPACITY = 25;
    private int numberOfEntries;
    
    public ArrayBag() {
        this(DEFAULT_CAPACITY);
    }
    public ArrayBag(int capacity) {
        bag = (T[]) new Object[capacity];
    }
    public int getCurrentSize() {
        return numberOfEntries;
    }
    public boolean isFull() {
        return (numberOfEntries == bag.length);
    }
    public boolean isEmpty() {
        return (numberOfEntries == 0);
    }
    public boolean add(T newEntry) {
        if (isFull())
            return false;
        else {
            bag[numberOfEntries++] = newEntry;
            return true;
        }
    }
    
    public T remove() {
        T result = removeEntry(numberOfEntries - 1);
        return result;
    }
    
    public boolean remove(T anEntry) {
        int index =  getIndexOf(anEntry);
        T result = removeEntry(index);
        return anEntry.equals(result);
    }
    
    private T removeEntry(int givenIndex) {
        T result = null;
        
        if(!isEmpty() && (givenIndex>= 0)) {
            result = bag[givenIndex];
            numberOfEntries--;
            bag[givenIndex] = bag[numberOfEntries];
            bag[numberOfEntries] = null;
        }
        return result;
    }
    
    private int getIndexOf(T anEntry) {
        int where = -1;
        boolean found = false;
        
        for(int index = 0; !found && (index < numberOfEntries); index++) {
            if (anEntry.equals(bag[index])) {
                found = true;
                where = index;
            }
        }
        return where;
    }
    public void clear() {
        while(!isEmpty()) remove();
    }
    public int getFrequencyOf(T anEntry) {
        int counter = 0;
        
        for (int index = 0; index < numberOfEntries; index++) {
            if (anEntry.equals(bag[index])) {
                counter++;
            }
        }
        return counter;
    }
    public boolean contains(T anEntry) {
        boolean found = false;
        
        for(int index = 0; !found && (index < numberOfEntries); index++) {
            if (anEntry.equals(bag[index])) {
                found = true;
            }
        }
        return found;
    }
    public T[] toArray() {
        T[] result = (T[]) new Object[numberOfEntries];
        
        for (int index = 0; index < numberOfEntries; index++) {
            result[index] = bag[index];
        }
        return result;
    }
    //Q2
    public BagInterface<T> union(BagInterface<T> anotherBag) {
        int sizeOfUnionBag = anotherBag.getCurrentSize() + getCurrentSize();
        BagInterface<T> unionBag = new ArrayBag<T>(sizeOfUnionBag);
        ArrayBag<T>otherBag = (ArrayBag<T>) anotherBag;
        
        int index;
        for (index = 0; index < numberOfEntries; index++)
            unionBag.add(bag[index]);
        for (index = 0; index < otherBag.getCurrentSize(); index++)
            unionBag.add(otherBag.bag[index]);
        return unionBag;
    }
    //Q3
    public BagInterface<T> intersection(BagInterface<T> anotherBag) {
        BagInterface<T> intersectionBag = new ArrayBag<T>();
        ArrayBag<T> otherBag = (ArrayBag<T>) anotherBag;
        BagInterface<T> copyOfAnotherBag = new ArrayBag<T>();
        
        int index;
        
        for (index = 0; index < otherBag.numberOfEntries; index++) {
            copyOfAnotherBag.add(otherBag.bag[index]);
        }
        for (index = 0; index < getCurrentSize(); index++) {
            if (copyOfAnotherBag.contains(bag[index])) {
                intersectionBag.add(bag[index]);
                copyOfAnotherBag.remove(bag[index]);
            }
        }
        return intersectionBag;
    }
    //Q4
    public BagInterface<T> difference(BagInterface<T> anotherBag) {
        BagInterface<T> differenceBag = new ArrayBag<T>();
        ArrayBag<T> otherBag = (ArrayBag<T>) anotherBag;
        
        int index;
        
        for (index = 0; index < numberOfEntries; index++) {
            differenceBag.add(bag[index]);
        }
        for (index = 0; index < otherBag.getCurrentSize(); index++) {
            if (differenceBag.contains(otherBag.bag[index])) {
                differenceBag.remove(otherBag.bag[index]);
            }
        }
        return differenceBag;
    }
    
}
