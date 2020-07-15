package com.hackerrank.bst;

import java.util.*;

/*class Node {
	Node left, right;
	int data;

	Node(int data) {
		this.data = data;
		left = right = null;
	}
}
*/
class BST {

	public static int getHeight(Node root) {
		// Write your code here
		//System.out.println(root.data);
		if (root.left == null && root.right == null) {
			return 0;
		} else {
			int lheight = 0;
			int rheight = 0;
			if (root.left != null) {
				lheight = getHeight(root.left);
				// System.out.println("leheight "+lheight +" "+root.left.data);
			}
			if (root.right != null) {
				rheight = getHeight(root.right);
				// System.out.println("rheight "+rheight+" "+root.right.data);
			}
			int max = (lheight > rheight) ? lheight : rheight;
			return max + 1;
		}

	}

	public static Node insert(Node root, int data) {
		if (root == null) {
			return new Node(data);
		} else {
			Node cur;
			if (data <= root.data) {
				cur = insert(root.left, data);
				root.left = cur;
			} else {
				cur = insert(root.right, data);
				root.right = cur;
			}
			return root;
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		Node root = null;
		while (T-- > 0) {
			int data = sc.nextInt();
			root = insert(root, data);
		}
		int height = getHeight(root);
		System.out.println(height);
		sc.close();
	}
}