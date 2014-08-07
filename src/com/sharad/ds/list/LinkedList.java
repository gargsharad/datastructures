package com.sharad.ds.list;


public class LinkedList<E> {
    
    private static class Node<E> {
        E item;
        Node<E> next;
        Node(E element, Node<E> next) {
            this.item = element;
            this.next = next;
        }
    }
}
