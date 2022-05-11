package com.personal.stack;

public interface IStack<T> {

    public void push(T item);
    public T pop();
    public boolean contains(T item);
    public T access(T item);
    public T peek();
    public int size();
}
