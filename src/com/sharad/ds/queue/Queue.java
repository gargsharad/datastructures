package com.sharad.ds.queue;


public interface Queue<T> {
    // add an element at the head
    public boolean add(T e);
    // remove and return element from the head
    public T remove();
    // return element at the head of queue without removing it
    public T element();
}
