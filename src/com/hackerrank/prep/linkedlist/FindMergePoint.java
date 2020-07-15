package com.hackerrank.prep.linkedlist;

import java.io.*;
import java.util.*;

public class FindMergePoint {

	static class SinglyLinkedListNode {
		public int data;
		public SinglyLinkedListNode next;

		public SinglyLinkedListNode(int nodeData) {
			this.data = nodeData;
			this.next = null;
		}
	}

	static class SinglyLinkedList {
		public SinglyLinkedListNode head;
		public SinglyLinkedListNode tail;

		public SinglyLinkedList() {
			this.head = null;
			this.tail = null;
		}

		public void insertNode(int nodeData) {
			SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

			if (this.head == null) {
				this.head = node;
			} else {
				this.tail.next = node;
			}

			this.tail = node;
		}
	}

	public static void printSinglyLinkedList(SinglyLinkedListNode node) throws IOException {
		int cnt = 0;
		while (node != null) {
			// bufferedWriter.write(String.valueOf(node.data));
			// System.out.print(node.data + " ");
			node = node.next;

			if (node != null) {
				// bufferedWriter.write(sep);
				cnt++;
			}

		}
		System.out.println("cnt " + cnt);
	}

	// Complete the findMergeNode function below.

	/*
	 * For your reference:
	 *
	 * SinglyLinkedListNode { int data; SinglyLinkedListNode next; }
	 *
	 */
	static int findMergeNode(SinglyLinkedListNode head1, SinglyLinkedListNode head2) throws IOException {
		// int mergePoint = 0;
		// SinglyLinkedListNode h2 = head2;
		SinglyLinkedListNode tmpA = head1;
		SinglyLinkedListNode tmpB = head2;
		/*
		 * while (head1.next != null) { while (head2.next != null) { //
		 * System.out.println("h1.next-" + head1.next.data + " h2.next-" + //
		 * head2.next.data); if (head1.next.data == head2.next.data) { mergePoint =
		 * head1.next.data; break; } head2 = head2.next;
		 * 
		 * } if (mergePoint == 0) { head1 = head1.next; head2 = h2; } else { break; } }
		 */
		while (tmpA != tmpB) {
			if (tmpA.next == null) {
				tmpA = head2;
			} else {
				tmpA = tmpA.next;
			}
			if (tmpB.next == null) {
				tmpB = head1;
			} else {
				tmpB = tmpB.next;
			}
		}
		return tmpB.data;

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		// BufferedWriter bufferedWriter = new BufferedWriter(new
		// FileWriter(System.getenv("OUTPUT_PATH")));

		int tests = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int testsItr = 0; testsItr < tests; testsItr++) {
			int index = scanner.nextInt();
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			SinglyLinkedList llist1 = new SinglyLinkedList();

			int llist1Count = scanner.nextInt();
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			for (int i = 0; i < llist1Count; i++) {
				int llist1Item = scanner.nextInt();
				scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

				llist1.insertNode(llist1Item);
			}

			SinglyLinkedList llist2 = new SinglyLinkedList();

			int llist2Count = scanner.nextInt();
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			for (int i = 0; i < llist2Count; i++) {
				int llist2Item = scanner.nextInt();
				scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

				llist2.insertNode(llist2Item);
			}

			SinglyLinkedListNode ptr1 = llist1.head;
			SinglyLinkedListNode ptr2 = llist2.head;

			for (int i = 0; i < llist1Count; i++) {
				if (i < index) {
					ptr1 = ptr1.next;
				}
			}

			for (int i = 0; i < llist2Count; i++) {
				if (i != llist2Count - 1) {
					ptr2 = ptr2.next;
				}
			}

			ptr2.next = ptr1;

			int result = findMergeNode(llist1.head, llist2.head);

			System.out.println(result);

			/*
			 * bufferedWriter.write(String.valueOf(result)); bufferedWriter.newLine();
			 */
		}

		// bufferedWriter.close();

		scanner.close();
	}
}
