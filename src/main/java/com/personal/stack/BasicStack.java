package com.personal.stack;

public class BasicStack<T> implements IStack<T> {

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
        if (stackIndex == 0) {
            System.out.println("Attempted pop call from empty Stack");
            return null;
        }

        return items[stackIndex--];
    }

    public boolean contains(T searchedItem) {
        for (int i = stackIndex; i > 0; i--) {
            if (items[i].equals(searchedItem)) {
                return true;
            }
        }

        return false;
    }

    public T access(T searchedItem) {
        while (stackIndex > 0) {
            T item = pop();
            if (item.equals(searchedItem)) {
                return item;
            }
        }
        return null;
    }

    public int size() {
        return stackIndex;
    }

    @Override
    public String toString() {
        return "{" +
                " items='" + items + "'" +
                ", stackIndex='" + stackIndex + "'" +
                "}";
    }

    @Override
    public T peek() {
        if (stackIndex < 1) {
            return null;
        }
        return items[stackIndex];
    }
}
