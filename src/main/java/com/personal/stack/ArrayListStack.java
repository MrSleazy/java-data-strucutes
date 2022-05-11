package com.personal.stack;

import java.util.ArrayList;

public class ArrayListStack<T> implements IStack<T> {

    private ArrayList<T> items = new ArrayList<>();

    @Override
    public void push(T item) {
        items.add(item);
    }

    @Override
    public T pop() {
        if (!items.isEmpty()) {
            T top = items.get(items.size() - 1);
            items.remove(items.size() - 1);
            return top;
        }
        return null;
    }

    @Override
    public boolean contains(T item) {
        return items.contains(item);
    }

    @Override
    public T access(T item) {
        while(!items.isEmpty()){
            T top = pop();
            if (top.equals(item)) {
                return top;
            }
        }
        return null;
    }

    @Override
    public T peek() {
        if (items.isEmpty())
            return null;
        return items.get(items.size() - 1);
    }

    @Override
    public int size() {
        return items.size();
    }

}
