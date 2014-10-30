package com.sharad.ds.tree;

import org.junit.Test;

import com.sharad.algos.common.RandomGenerator;

public class BinarySearchTreeTest {

	@Test
	public void testInsert() {
		Integer[] input = RandomGenerator.getRandomIntegers(10);
		BinarySearchTree<Integer> bst = new BinarySearchTree<Integer>();
		for (int i = 0; i < input.length; i++) {
			bst.insert(input[i]);
		}
		bst.inorder();
		System.out.println("\n");
		bst.preorder();
		System.out.println("\n");
		bst.postorder();
	}
}
