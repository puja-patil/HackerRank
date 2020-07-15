package com.hackerrank.linkedlist;

import java.util.*;

/*class Node {
	int data;
	Node next;

	Node(int d) {
		data = d;
		next = null;
	}
}*/

class LinkedList {

	public static Node insert(Node head, int data) {
		// System.out.println("head "+head);
		/*
		 * Node start = head; Node tmp = new Node(data); if (head == null) { head = tmp;
		 * start = head; } else { while (head.next != null) {
		 * 
		 * head = head.next; } head.next = tmp; head = head.next; }
		 */
		if (head == null) {
			return new Node(data);
		} else {
			Node curr;
			curr = insert(head.next, data);
			head.next = curr;
			return head;
		}

		// return start;
	}

	public static void display(Node head) {
		Node start = head;
		while (start != null) {
			System.out.print(start.data + " ");
			start = start.next;
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Node head = null;
		int N = sc.nextInt();

		while (N-- > 0) {
			int ele = sc.nextInt();
			head = insert(head, ele);
		}
		display(head);
		sc.close();
	}
}