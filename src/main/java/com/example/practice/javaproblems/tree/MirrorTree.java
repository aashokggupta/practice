/**
 * JavaProblems
 * Problem_05.java
 */
package com.example.practice.javaproblems.tree;

import com.example.practice.javaproblems.library.TreeNode; 

/**
 * <br> Problem Statement
 * 
 * Convert a Tree to its mirror image
 * 
 * </br>
 * 
 * @author Ashok
 */
public class MirrorTree {

	/**
	 * Method to create a mirror image of a given tree
	 * 
	 * @param root
	 */
	public static <T> void mirrorImage(TreeNode<T> root) {
		if (root == null) {
			return;
		}
		/* Swap tree's left and right node */
		TreeNode<T> temp = root.getLeft();
		root.setLeft(root.getRight());
		root.setRight(temp);
		/* Swap left and right sub tree recursively */
		mirrorImage(root.getLeft());
		mirrorImage(root.getRight());
	}

}
