package com.sharad.ds.list;

import java.util.Iterator;

public class LinkedList<E> implements List<E>  {
	
	private int size;
	private Node<E> firstNode;
		
	public LinkedList(){
		this.size = 0;
		this.firstNode = null;
	}
	   
    private static class Node<E> {
        E item;
        Node<E> next;
        Node(E element, Node<E> next) {
            this.item = element;
            this.next = next;
        }
    }
    
    private class Itr implements Iterator<E>{
    	private Node<E> lastReturned = null;
        private Node<E> next;
        private int nextIndex;
        
        Itr(){
        	nextIndex = 0;
        	if(firstNode == null){
        		next = null;
        	}else{
        		next = firstNode;
        	}
        }
        
		@Override
		public boolean hasNext() {
			return nextIndex < size;
		}

		@Override
		public E next() {
			lastReturned = next;
			next = next.next;
			nextIndex++;
			return lastReturned.item;
		}
    	
    }
    
    private Node<E> node(int nextIndex) {
		// TODO Auto-generated method stub
		return null;
	}

    @Override
	public void add(E e) {
    	this.size++;
    	Node node = firstNode;
    	Node<E> newNode = new Node<E>(e, null);
		if(this.firstNode != null){
			while(node.next != null){
				node = node.next;
			}
			node.next = newNode;
		}else{
			this.firstNode = newNode;
		}
	}

	@Override
	public void add(E e, int idx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public E remove() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E remove(E e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E remove(int idx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E get(int idx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterator<E> iterator() {
		return new Itr();
	}
	
	
}
