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
        // check the capacity and expand it if necessary
        for (int i = numberOfElements; i > 0; i--) {
            listArray[i] = listArray[i - 1];
        }

        listArray[0] = newEntry;
        numberOfElements++;
    }

    @Override
    public void addBack(T newEntry) {

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

        System.out.println(Arrays.toString(array));
    }

    @Override
    public int indexOf(T anEntry) {
        return 0;
    }

    @Override
    public int lastIndexOf(T anEntry) {
        return 0;
    }

    @Override
    public boolean contains(T anEntry) {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return numberOfElements == 0;
    }
}




