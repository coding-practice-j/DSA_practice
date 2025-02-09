package com.practice.DSA.linkedlist.doublyLinkedList;

public class OperationsOnDoublyLinkedList {
	
	private static Node insert(Node head, int pos, int val) {
		Node temp = new Node();
		if(head == null) {
			temp.data = val;
			temp.prev = null;
			temp.next = null;
			head = temp;
		}else if(pos == 0) {
			temp.data = val;
			temp.prev = null;
			temp.next = head;
			head.prev = temp;
			head = temp;
		}else {
			temp = head;
			Node p = new Node();
			for(int i=0; i<pos-1; i++) {
				head = head.next;
			}
			p.data = val;
			p.prev = head;
			p.next = head.next;
			if(head.next != null) {
				head.next.prev = p;
			}
			head.next = p;
			//System.out.println("head: "+ p.data);
			return temp;
		}
		return head;
	}

	public static void main(String[] args) {

		Node head = new Node();
		head = null;
		head = insert(head, 0, 10);
		head = insert(head, 1, 20);
		head = insert(head, 2, 30);
		head = insert(head, 3, 40);
		head = insert(head, 4, 50);
		//head = insert(head, 0, 00);
		//head = insert(head, 3, 90);
		
		display(head);
		
		System.out.println("\nReverse Doubly Linked List: ");
		head = reverse(head);
		display(head);
		System.out.println("\nReverse again Doubly Linked List: ");
		head = reverse(head);
		display(head);
		System.out.println("\nDeleting Nodes: ");
		head = delete(head, 0);
		head = delete(head, 3);
		display(head);
		head = delete(head, 1);
		display(head);
		System.out.println("\nFinal Reverse: ");
		head = reverse(head);
		display(head);
	}
	
	private static void display(Node head) {
		Node first = new Node();
		first = head;
		while(first != null) {
			System.out.print(first.data + "  ");
			first = first.next;
		}
	}
	
	private static Node delete(Node head, int pos) {
		Node temp = new Node();
		if(head == null) {
			System.out.println("List is empty");
			return null;
		}else if(pos == 0) {
			System.out.println("Deleted Node: "+ head.data);
			head = head.next;
			if(head.prev != null) {
				head.prev = null;
			}
		}else {
			temp = head;
			Node p = new Node();
			for(int i=0; i<pos-1; i++) {
				head = head.next;
			}
			p = head.next;
			System.out.println("\nDeleted Node: "+ p.data);
			if(p.next != null) {
				head.next = head.next.next;
				head = head.next;
				head.prev = p.prev;
			}else {
				head.next = null;
				p.prev = null;
				
			}
			return temp;
		}
		return head;
	}
	
	private static Node reverse(Node first) {
		Node p = new Node();
		p = first;
		Node temp = new Node();
		while(p.next != null) {
			temp = p.next;
			p.next = p.prev;
			p.prev = temp;
			p = p.prev;
		}

		if(p.next == null) {
			temp = p.next;
			p.next = p.prev;
			p.prev = temp;
			first = p;
		}
		
		return first;
	}

}
