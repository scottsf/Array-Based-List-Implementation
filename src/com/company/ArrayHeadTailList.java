package com.company;

import java.util.Arrays;

public class ArrayHeadTailList<T> implements HeadTailListInterface<T> {
    private T[] listArray;
    private int numberOfElements;
    private static final int DEFAULT_CAPACITY = 10;

    public ArrayHeadTailList(int initialCapacity) {
        if (initialCapacity < DEFAULT_CAPACITY) {
            initialCapacity = DEFAULT_CAPACITY;
        }

        T[] tempListArray = (T[]) new Object[initialCapacity];
        listArray = tempListArray;
        numberOfElements = 0;
    }


    @Override
    public void addFront(T newEntry) {
        expandCapacity();
        for (int i = numberOfElements; i > 0; i--) {
            listArray[i] = listArray[i - 1];
        }

        listArray[0] = newEntry;
        numberOfElements++;
    }

    @Override
    public void addBack(T newEntry) {
        expandCapacity();
        listArray[numberOfElements] = newEntry;
        numberOfElements++;
    }

    @Override
    public T removeFront() {
        return null;
    }

    @Override
    public T removeBack() {
        return null;
    }

    @Override
    public void clear() {
        listArray = (T[]) new Object[DEFAULT_CAPACITY];
        numberOfElements = 0;
    }

    @Override
    public T getEntry(int givenPosition) {
        return null;
    }

    @Override
    public void display() {
        T[] array = (T[]) new Object[numberOfElements];
        for (int i = 0; i < numberOfElements; i++) {
            array[i] = listArray[i];
        }

        System.out.println(numberOfElements + " elements; " + "capacity = " +
                DEFAULT_CAPACITY + "\t" + (numberOfElements == 0 ? " " : Arrays.toString(array)));
    }

    @Override
    public int indexOf(T anEntry) {
        for (int i = 0 ; i < numberOfElements; i++) {
            if (listArray[i].equals(anEntry)) {
                return i;
            }
        }

        return -1;
    }

    @Override
    public int lastIndexOf(T anEntry) {
        for (int i = numberOfElements - 1; i >= 0; i--) {
            if (listArray[i].equals(anEntry)) {
                return i;
            }

        }
        return -1;
    }

    @Override
    public boolean contains(T anEntry) {
        for (int i = 0; i < numberOfElements; i++) {
            if (listArray[i].equals(anEntry)) {
                return true;
            }
        }

        return false;
    }

    @Override
    public int size() {
        return numberOfElements;
    }

    @Override
    public boolean isEmpty() {
        return numberOfElements == 0;
    }

    public void expandCapacity() {
        if (numberOfElements + 1 == listArray.length) {
            listArray = Arrays.copyOf(listArray, numberOfElements * 2);
        }
    }
}




