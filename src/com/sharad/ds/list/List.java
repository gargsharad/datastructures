package com.sharad.ds.list;

import java.util.Iterator;

public interface List <E> extends Iterable<E> {
	
	public void add(E e);
	
	public void add(E e, int idx);
	
	public E remove();
	
	public E remove(E e);
	
	public E remove(int idx);
	
	public E get(int idx);
	
	public Iterator<E> iterator();

}
