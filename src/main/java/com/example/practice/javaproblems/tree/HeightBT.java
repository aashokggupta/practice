
package com.example.practice.javaproblems.tree;

import java.util.HashMap;
import java.util.Map;

import com.example.practice.javaproblems.library.TreeNode;


public class HeightBT {


	public static <T> int height(TreeNode<T> root) {
		if (root == null) {
			return 0;
		}
		int leftHeight = height(root.getLeft());
		int rightHeight = height(root.getRight());
		return 1 + Math.max(leftHeight, rightHeight);
	}

	public static void main(String[] args) {
		TreeNode<Integer> root = new TreeNode<Integer>(10);
		TreeNode<Integer> node1 = new TreeNode<Integer>(6);
		TreeNode<Integer> node2 = new TreeNode<Integer>(17);
		TreeNode<Integer> node3 = new TreeNode<Integer>(3);
		TreeNode<Integer> node4 = new TreeNode<Integer>(12);
		TreeNode<Integer> node5 = new TreeNode<Integer>(23);
		TreeNode<Integer> node6 = new TreeNode<Integer>(19);
		TreeNode<Integer> node7 = new TreeNode<Integer>(10);
		TreeNode<Integer> node8 = new TreeNode<Integer>(11);
		TreeNode<Integer> node9 = new TreeNode<Integer>(21);
		root.setLeft(node1);
		root.setRight(node2);
		node1.setLeft(node3);
		node2.setLeft(node4);
		node2.setRight(node5);
		node5.setLeft(node6);
		node4.setLeft(node7);
		node4.setRight(node8);
		node8.setLeft(node9);
		System.out.println(height(root));
	}
}
