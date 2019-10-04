package com.company;

public class ArrayHeadTailList<T> implements HeadTailListInterface<T> {
    private T[] listArray;
    private int numberOfElements;
    private T head;
    private  T tail;
    private static final int initialCapacity = 15;

    public ArrayHeadTailList() {
        this(initialCapacity);
    }

    public ArrayHeadTailList(int initialCapacity) {
        T[] tempListArray = (T[]) new Object[initialCapacity + 1];
        head = null;
        tail = null;
        listArray = tempListArray;
        numberOfElements = 0;
    }


    @Override
    public void addFront(T newEntry) {

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
        return false;
    }
}




