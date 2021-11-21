package com.heloword.practice.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Easy_226_InvertBinaryTree {
	public static void main(String[] args) {

//		Input: root = [4,2,7,1,3,6,9]
//		Output: [4,7,2,9,6,3,1]

//		Input: root = [2,1,3]
//		Output: [2,3,1]

//		Input: root = []
//		Output: []

		List<Integer> integers = new ArrayList<>(Arrays.asList(1, 2, 3));
		List<Integer> integers2 = new ArrayList<>(Arrays.asList(4, 5, 6));
		integers.addAll(integers2);
		System.out.println(integers);




	}

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode() {}
		TreeNode(int val) { this.val = val; }
		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}

		@Override
		public String toString() {
			return "TreeNode{" +
					"val=" + val +
					", left=" + left +
					", right=" + right +
					'}';
		}
	}
	class Solution {
		public TreeNode invertTree(TreeNode root) {

			if(root == null) return root;

			TreeNode tempRight = root.right;
			TreeNode tempLeft = root.left;

			root.right = invertTree(tempLeft);
			root.left = invertTree(tempRight);
			return root;

		}
	}
}
