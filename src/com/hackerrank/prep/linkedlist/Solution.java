package com.hackerrank.prep.linkedlist;

import java.io.*;
import java.util.*;

public class Solution {

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

	public static void printSinglyLinkedList(SinglyLinkedListNode head) throws IOException {
		Map<SinglyLinkedListNode, Boolean> visitedMap = new LinkedHashMap<Solution.SinglyLinkedListNode, Boolean>();
		while(head.next!=null){
           
            if(visitedMap.containsKey(head)){
                System.out.println("visited "+head.data);
                break;
            }
            else{
            	System.out.println("visited no "+head.data);
            }
            visitedMap.put(head,true);
            head=head.next;
            
        }
	}

	//private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		SinglyLinkedList list = new SinglyLinkedList();
		list.insertNode(1);
		list.insertNode(2);
		list.insertNode(3);
		list.insertNode(4);
		SinglyLinkedListNode node = new SinglyLinkedListNode(5);
		list.tail.next = node;
		node.next = list.head;
		printSinglyLinkedList(list.head);
	}
}
