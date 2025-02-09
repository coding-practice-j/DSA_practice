package com.practice.DSA.linkedlist;

import com.practice.DSA.linkedlist.LinkedListUsingRecursion.Node1;

public class LinkedListReverse {
	
	private static Node insertEnd(Node head, int data) {
        // If linked list is empty, create a new node
        if (head == null) {
        	head = new Node();
        	head.data = data;
        	head.next = null;
        	return head;
        }
        // If we have not reached the end, keep traversing recursively
        head.next = insertEnd(head.next, data);
        return head;
    }
	
	private static Node reverse(Node head) {
		Node first = new Node();
		Node prev = new Node();
		first = head;
		prev = null;
		Node next = new Node();
		while(first != null) {
			next = first.next;
			first.next = prev;
			prev = first;
			first = next;
		}
		return prev;
	}
	
	private static Node reverseUsingRecursion(Node prev, Node head) {
		Node temp = new Node();
		if(head == null || head.next == null) {
			return head;
		}
		prev = head;
		reverseUsingRecursion(prev, head.next);
		head.next = prev;
		return head;
	}

	public static void main(String[] args) {
		int A[] = new int[] {5,3,1,7,9};
		Node head = null;
        head = insertEnd(head, 1);
        head = insertEnd(head, 2);
        head = insertEnd(head, 3);
        head = insertEnd(head, 4);
        head = insertEnd(head, 5);
		
        display(head);
        //System.out.println("\n"+head.data);
        Node revNode = reverse(head);
        System.out.println("\nReverse List: ");
        display(revNode);
        System.out.println("\nReverse List using recursion: ");
        Node prev = new Node();
        prev = null;
        //System.out.println(head.data);
        reverseUsingRecursion(prev, head);
        display(revNode);

	}
	
	private static void display(Node head) {
		if(head != null) {
			System.out.print(head.data+" ");
			display(head.next);
		}
	}

}
