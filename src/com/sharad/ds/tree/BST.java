package com.sharad.ds.tree;

public class BST<T extends Comparable<? super T>> {
	// Class holding the node element and its right and left child
	private static class BSTNode<T extends Comparable<? super T>> {
		T el;
		BSTNode<T> lc, rc;

		public BSTNode(T el) {
			this.el = el;
			this.lc = this.rc = null;
		}
	}

	// at begining rot will be null
	BSTNode<T> root = null;

	public boolean clear() {
		if (null != this.root)
			this.root = null;
		return this.root == null;
	}

	public boolean isEmpty() {
		return this.root == null;
	}

	public void insert(T el) {
		this.root = insert(el, this.root);
	}

	public BSTNode<T> insert(T el, BSTNode<T> node) {
		if (null == node)
			node = new BSTNode<T>(el);
		else if (el.compareTo(node.el) < 0)
			node.lc = insert(el, node.lc);
		else
			node.rc = insert(el, node.rc);
		return node;
	}

	public void remove(T el) {

	}

}