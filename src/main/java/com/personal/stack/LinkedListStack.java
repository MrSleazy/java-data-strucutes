package com.personal.stack;

import java.util.LinkedList;
import java.util.List;

public class LinkedListStack<T> implements IStack<T> {

    private Node top = null;
    private int stackIndex = 0;

    private class Node<T> {
        private T item = null;
        private Node<T> previous = null;
    }

    @Override
    public void push(T item) {
        Node<T> temp = new Node<T>();
        temp.item = item;
        temp.previous = top;
        top = temp;
        stackIndex++;
    }

    @Override
    public T pop() {
        if(top == null) {
            System.out.println("Tried to pop from empty stack!");
            return null;
        }
        T item = top.item;
        top = top.previous;
        stackIndex--;
        return item;
    }

    @Override
    public boolean contains(T item) {
        return items.contains(item);
    }

    @Override
    public T access(T item) {
        while (!items.isEmpty()) {
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
