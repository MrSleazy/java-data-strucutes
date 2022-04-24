package com.personal;

public class BasicStack<T> {

    private T[] items;
    private int stackIndex;

    public BasicStack() {
        items = (T[]) new Object[1000];
        stackIndex = 0;
    }

    public void push(T newItem) {
        items[++stackIndex] = newItem;
    }

    public T pop() {
        if(stackIndex == 0) {
            System.out.println("Cannot pop from empty Stack");
            return null;
        }

        return items[stackIndex--];
    }

    public boolean contains(T searchedItem) {
        for(int i = stackIndex; i> 0 ; i--) {
            if(items[i].equals(searchedItem)) {
                return true;
            }
        } 

        return false;
    }

    public T access(T searchedItem) {
        for (int i = 0; i < stackIndex ; i++) {
            T currentItem = items[i];
            if(currentItem.equals(searchedItem)) {
                // found item
                return currentItem;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "{" +
            " items='" + items + "'" +
            ", stackIndex='" + stackIndex + "'" +
            "}";
    }
    
}
