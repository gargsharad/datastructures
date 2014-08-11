package com.sharad.ds.stack;

import java.util.Arrays;

public class ArrayBackedStack<E> implements Stack<E> {
	
	private int top;
	private int size;	
	private static final int DEFAULT_CAPACITY = 10;
	private Object[] elementData;
	private static final int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8;
	
	public ArrayBackedStack() {
		super();
		top = -1;
		size = 0;
		elementData = new Object[DEFAULT_CAPACITY];
		System.out.println("Creating Stack with default cpacity :: TOP :: "+ top +" Size :: " + size);
		
	}
	
	public ArrayBackedStack(int initialCapacity) {
		super();
		if (initialCapacity<0)
			throw new IllegalArgumentException("Illegal Capacity: " + initialCapacity);
		top = -1;
		size = 0;
		elementData = new Object[initialCapacity];
		System.out.println("Creating Stack with supplied cpacity :: TOP :: "+ top +" Size :: " + size);
		
	}

	@Override
	public boolean push(E e) {
		ensureCapacity(size + 1);  // Increments modCount!!
		size++;
        elementData[++top] = e;
        System.out.println("Push :: TOP :: "+ top +" Size :: " + size);
        return true;
	}

	@Override
	@SuppressWarnings("unchecked")
	public E pop() throws EmptyStackException{
		if (size <= 0)
			throw new EmptyStackException("Stack is empty");
		
		E e = (E) elementData[top];
		elementData[top] = null;
		top--;
		size--;
		System.out.println("Pop :: TOP :: "+ top +" Size :: " + size);
		return e;
	}

	@Override
	@SuppressWarnings("unchecked")
	public E top() throws EmptyStackException{
		System.out.println("Top :: TOP :: "+ top +" Size :: " + size);
		return (E) elementData[top];
	}
	
	private void ensureCapacity(int minCapacity) {
		if (minCapacity - elementData.length > 0)
            grow(minCapacity);
	}

	private void grow(int minCapacity) {
		int oldCapacity = elementData.length;
        int newCapacity = oldCapacity + (oldCapacity >> 1);
        if (newCapacity - minCapacity < 0)
            newCapacity = minCapacity;
        if (newCapacity - MAX_ARRAY_SIZE > 0)
            newCapacity = hugeCapacity(minCapacity);
        elementData = Arrays.copyOf(elementData, newCapacity);
		
	}

	private int hugeCapacity(int minCapacity) {
		if (minCapacity < 0) 
            throw new OutOfMemoryError();
        return (minCapacity > MAX_ARRAY_SIZE) ? Integer.MAX_VALUE : MAX_ARRAY_SIZE;
	}

}
