package com.sharad.ds.stack;

/**
 * @author Sharad K Garg
 */
public interface Stack<E> {
	
	public boolean push(E e);

	public E pop();

	public E top();
}
