package com.sharad.ds.tree;

public class BinarySearchTree<T extends Comparable<? super T>> {
	private BinarySearchTreeNode<T> root = null; // taking the simplest
	private int size = 0;

	// Clear To clear the tree just assign null to root
	public void clear() {
		this.root = null;
	}

	// isEmpty
	public boolean isEmpty() {
		return this.root == null;
	}

	public int getSize() {
		return this.size;
	}

	// insert iterative
	public void insert(T el) {
		BinarySearchTreeNode<T> currentNode, previousNode = null;
		if (getSize() > 0) {
			// start traversing from root to find out right place to insert
			currentNode = root;
			while (currentNode != null) {
				previousNode = currentNode; // save previous rootNode of subtree
				if (el.compareTo(currentNode.getEl()) < 0) {
					// we need to go left as the new value is lesser then
					// current root value
					currentNode = currentNode.getLeftChild();
				} else {
					// we need to go right as the new value is greater then
					// current root value
					currentNode = currentNode.getRightChild();
				}
			}
			// after the completion of loop previousNode is the node which will
			// become the parent of
			// new node in the tree
			if (el.compareTo(previousNode.getEl()) < 0) {
				// add as left child
				previousNode.setLeftChild(new BinarySearchTreeNode<T>(el));
			} else {
				// add as right child
				previousNode.setRightChild(new BinarySearchTreeNode<T>(el));
			}
		} else {
			this.root = new BinarySearchTreeNode<T>(el);
		}
		this.size += 1; // increment the size
	}

	// preorder
	public void preorder() {
		preorder(root);
	}

	// inorder also confirm the tree we formed in binary tree
	public void inorder() {
		inorder(root);
	}

	// postorder
	public void postorder() {
		postorder(root);
	}

	protected void visit(BinarySearchTreeNode<T> p) {
		System.out.print(p.getEl() + "->");
	}

	protected void inorder(BinarySearchTreeNode<T> p) {
		if (p != null) {
			inorder(p.getLeftChild());
			visit(p);
			inorder(p.getRightChild());
		}
	}

	protected void preorder(BinarySearchTreeNode<T> p) {
		if (p != null) {
			visit(p);
			preorder(p.getLeftChild());
			preorder(p.getRightChild());
		}
	}

	protected void postorder(BinarySearchTreeNode<T> p) {
		if (p != null) {
			postorder(p.getLeftChild());
			postorder(p.getRightChild());
			visit(p);
		}
	}

	// delete
	public void deleteByMerging(T el) {
		BinarySearchTreeNode<T> tmp, node, p = root, prev = null;
		while (p != null && !p.getEl().equals(el)) { 			// find the node p with element el
			prev = p;
			if (el.compareTo(p.getEl()) < 0)
				p = p.getRightChild();
			else
				p = p.getLeftChild();
		}
		node = p;  // node found
		
		if (p != null && p.getEl().equals(el)) {
			if (node.getRightChild() == null) 					// node has no right child: its left
				node = node.getLeftChild(); 					// child (if any) is attached to its parent;
			else if (node.getLeftChild() == null) 				// node has no left child: its right
				node = node.getRightChild(); 					// child is attached to its parent;
			else { 												// be ready for merging subtrees;
				tmp = node.getLeftChild(); 						// 1.	move left
				while (tmp.getRightChild() != null){
					tmp = tmp.getRightChild();					// 2. 	and then right as far as
				}												// 		possible;
					tmp.setRightChild(node.getRightChild()); 	// 3. 	establish the link between
																// 		the rightmost node of the left
																// 		subtree and the right subtree;
				node = node.getLeftChild(); 					// 4.
			}
			
			// below we actually removed the node
			if (p == root)
				root = node;
			else if (prev.getLeftChild() == p)
				prev.setLeftChild(node);
			else
				prev.setRightChild(node); 						// 5.
			
		} else if (root != null)
			System.out.println("el " + el + " is not in the tree");
		else
			System.out.println("the tree is empty");
	}
	// general algorithm is: to delete N, if it has two subtrees, replace the
	// value in N with
	// the largest value in its left subtree and then delete the node with the
	// largest value
	// from its left subtree.

	// serch
	
	
	/*private AvlNode<AnyType> balance( AvlNode<AnyType> t )
    {
        if( t == null )
            return t;
        
        if( height( t.left ) - height( t.right ) > ALLOWED_IMBALANCE )
            if( height( t.left.left ) >= height( t.left.right ) )
                t = rotateWithLeftChild( t );
            else
                t = doubleWithLeftChild( t );
        else
        if( height( t.right ) - height( t.left ) > ALLOWED_IMBALANCE )
            if( height( t.right.right ) >= height( t.right.left ) )
                t = rotateWithRightChild( t );
            else
                t = doubleWithRightChild( t );

        t.height = Math.max( height( t.left ), height( t.right ) ) + 1;
        return t;
    }*/
}
