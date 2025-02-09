package com.practice.DSA.linkedlist.doublyLinkedList;

public class CircularDoublyLinkedList {
	
	private static Node display(Node head) {
		Node first;
		first = head;
		while(first.next != head) {
			
			System.out.print(first.data+" ");
			/*
			 * System.out.print("next: "+first.next.data+" ");
			 * System.out.println("prev: "+first.prev.data+" ");
			 */
			first = first.next;
		}
		System.out.print(first.data);
		return head;
	}
	
	private static Node delete(Node head, int key) {
		Node first;
		Node temp = null;
		first = head;
		if(first.next == head) {
			return null;
		}
		while(first.data != key) {
			if(first.next ==  head) {
				System.out.println("List doesn't contain value: "+ key);
				break;
			}
			first = first.next;			
		}
		if(first.data == key) {
			System.out.println("Deleted Node: "+ first.data);
			if(first == head) {
				System.out.println("Deleting First Node");
				temp = first.prev;
				first =  first.next;
				temp.next = first;
				first.prev = temp;
				head = first;
			}else {
				temp = first.prev;
				first = first.next;
				temp.next = first;
				first.prev = temp;
			}
		}
		return head;
	}
	
	private static Node deleteAtPosition(Node head, int pos) {
		Node first = new Node();
		Node temp = null;
		first = head;
		if(pos == 0) {
			System.out.println("Deleting First Node");
			temp = first.prev;
			first =  first.next;
			temp.next = first;
			first.prev = temp;
			head = first;
		}else {
			for(int i=0; i<pos; i++) {
				first = first.next;
			}
			temp = first.prev;
			first = first.next;
			temp.next = first;
			first.prev = temp;
		}
		
		return head;
	}

	public static void main(String[] args) {
		Node head =  new Node();
		head = null;
		head = insert(head, 0, 20);
		head = insert(head, 0, 10);
		head = insert(head, 2, 30);
		head = insert(head, 3, 50);
		head = insert(head, 3, 40);
		head = insert(head, 5, 60);

		head = display(head);
		System.out.print("\nReverse:: ");
		head = reverse(head);
		head = display(head);
		System.out.println("\nDeleting based on key: ");
		head = delete(head, 10);
		head = display(head);
		
		System.out.println("\nDeleting based on key: ");
		head = delete(head, 40);
		head = display(head);
		
		System.out.println("\nDeleting based on position: ");
		head = deleteAtPosition(head, 0);
		head = display(head);
		
		System.out.println("\nDeleting based on position: ");
		head = deleteAtPosition(head, 1);
		head = display(head);
	}
	
	private static Node insert(Node head, int pos, int val) {
		Node p = new Node();
		if(head == null) {
			p.data = val;
			p.prev = p;
			p.next = p;
			head = p;
		}else if(pos == 0) {
			p.data = val;
			p.prev = head.prev;
			p.next = head;
			head.prev.next = p;
			head.prev = p;
			head = p;
		}else {
			Node temp = new Node();
			p = head;
			for(int i=0; i<pos-1; i++) {
//				System.out.println("values: "+p.next + " "+ p.prev + " "+ p.data);
				p = p.next;
			}
			temp.data = val;
			temp.prev = p;
			temp.next = p.next;
			p.next.prev = temp;
			p.next = temp;
		}
		return head;
	}
	
	private static Node reverse(Node first) {
		Node p = new Node();
		p = first;
		Node temp = new Node();
		while(p.next != first) {
			temp = p.next;
			p.next = p.prev;
			p.prev = temp;
			p = p.prev;
		}
		if(p.next == first) {
			temp = p.next;
			p.next = p.prev;
			p.prev = temp;
			first = p;
		}
		return first;
	}

}
