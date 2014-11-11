package com.sharad.ds.heap;

import java.util.ArrayList;

public class Heap<T extends Comparable<T>> {
    private ArrayList<T> items;

    //constructor
    public Heap() {
	items = new ArrayList<T>();
    }

    public boolean add(T t) {
	items.add(t);
	shiftup();
	return false;
    }
    
    private void shiftup(){
	
    }

    public T remove() {
	// TODO Auto-generated method stub
	return null;
    }
    
    private void shiftDown(){
	
    }

    public T element() {
	return null;
    }
}
