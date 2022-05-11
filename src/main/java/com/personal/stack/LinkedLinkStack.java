package com.personal.stack;

import java.util.LinkedList;
import java.util.List;

public class LinkedLinkStack<T> implements IStack<T> {

    private List<T> items;
    private int stackIndex = 0;

    public LinkedLinkStack() {
        items = new LinkedList<>();
    }

    @Override
    public void push(T item) {
        items.add(item);
        stackIndex++;
    }

    @Override
    public T pop() {
        if (items.isEmpty())
            return null;
        return items.remove(stackIndex-- -1);
    }

    @Override
    public boolean contains(T item) {
        return items.contains(item);
    }

    @Override
    public T access(T item) {
        while(!items.isEmpty()) {
            T top = pop();
            if (top.equals(item)) {
                return top;
            }
        }
        return null;
    }

    @Override
    public T peek() {
        return items.get(stackIndex);
    }

    @Override
    public int size() {
        return stackIndex;
    }

}
