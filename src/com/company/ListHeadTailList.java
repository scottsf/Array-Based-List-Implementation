package com.company;

import java.util.ArrayList;
import java.util.List;

public class ListHeadTailList<T> implements HeadTailListInterface<T> {
    List<T> list;

    public ListHeadTailList() {
        this.list = new ArrayList<>();

    }

    public void addFront(T newEntry) {
        list.add(list.size(), newEntry);

    }

    public void addBack(T newEntry) {
        list.add(newEntry);
    }

    public T removeFront() {
        if (list.isEmpty()) {
            return null;
        }
        T frontElement = list.get(0);
        list.remove(0);
        return frontElement;
    }


    public T removeBack() {
        if (list.isEmpty()) {
            return null;
        }
        T backElement = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        return backElement;

    }


    public void clear() {
        list.clear();
    }

    public T getEntry(int givenPosition){
        if(givenPosition > list.size()-1) {
            return null;
        }
        return list.get(givenPosition);
    }

    public void display() {
        if (!list.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                System.out.print(list.get(i) + ", ");
            }

        }
        else {
            System.out.print("");

        }
    }


    public int indexOf(T anEntry) {
        return list.indexOf(anEntry);
    }

    public int lastIndexOf(T anEntry) {
        return lastIndexOf(anEntry);
    }


    public boolean contains(T anEntry) {
        return contains(anEntry);
    }


    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }
}
