package com.sharad.ds.tree;

public class BinarySearchTreeNode<T extends Comparable<? super T>> {
	private T el;
	private BinarySearchTreeNode<T> leftChild, rightChild;

	public BinarySearchTreeNode() {
		leftChild = rightChild = null;
	}

	public BinarySearchTreeNode(T el, BinarySearchTreeNode<T> lc, BinarySearchTreeNode<T> rc) {
		this.el = el;
		this.leftChild = lc;
		this.rightChild = rc;
	}

	public BinarySearchTreeNode(T el) {
		this(el, null, null);
	}

	public T getEl() {
		return el;
	}

	public void setEl(T el) {
		this.el = el;
	}

	public BinarySearchTreeNode<T> getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(BinarySearchTreeNode<T> leftChild) {
		this.leftChild = leftChild;
	}

	public BinarySearchTreeNode<T> getRightChild() {
		return rightChild;
	}

	public void setRightChild(BinarySearchTreeNode<T> rightChild) {
		this.rightChild = rightChild;
	}
}
