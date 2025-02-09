package com.practice.DSA.linkedlist;


public class LinkedListInsertion {
	Node head = new Node();
	
	private static Node insertAtFront(int data, Node head) {
		Node first = new Node();
		first.data = data;
		first.next = head;
		head = first;
		return head;
	}
	
	private static Node insertAfter(int data, Node head) {
		Node temp = new Node();
		temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = null;
		temp.next = newNode;
		return head;
	}
	
	private static Node insertAtNextKey(int data, int key, Node head) {
		Node newNode = new Node();
		Node temp = new Node();
		newNode.data = data;
		temp = head;
		while(temp.next != null) {
			if(temp.data == key) {
				newNode.next = temp.next;
				temp.next = newNode;
				break;
			}
			temp = temp.next;
		}
		return head;
	}
	
	private static Node insertAtPreviousKey(int data, int key, Node head) {
		Node p = new Node();
		Node q = new Node();
		Node newNode = new Node();
		newNode.data = data;
		p = q = head;
		while(p.next != null) {
			if(p.data == key) {
				q.next = newNode;
				newNode.next = p;
				break;
			}
			q = p;
			p = p.next;
		}
		return head;
	}
	
	private static Node insertAtIndexPosition(int data, int pos, Node head) {
		Node newData = new Node();
		newData.data = data;
		
		Node temp = new Node();
		Node prev = new Node();
		temp = head;
		int count = 0;
		while(temp.next != null && count != pos) {
			prev = temp;
			temp = temp.next;
			count++;
		}
		prev.next = newData;
		newData.next = temp;
		
		return head;
	}
	
	private static boolean isSorted(LinkedListInsertion list) {
		Node prev = new Node();
		Node head = new Node();
		head = list.head;
		prev.data = 0;
		
		while(head.next != null) {
			if(prev.data > head.data) {
				System.out.println("List is not Sorted!");
				return false;
			}
			prev = head;
			head = head.next;
		}
		System.out.println("List is sorted!");
		return true;
	}
	
	private static LinkedListInsertion removeDuplicateFromSorted(LinkedListInsertion list) {
		Node first = new Node();
		Node second = new Node();
		first = list.head;
		while(first != null) {
			if(second.data != first.data) {
				second = first;
				first = first.next;
			}else {
				second.next = first.next;
				first = second.next;
			}
		}
		//list.display(list.head);
		return list;
	}
	

	public static void main(String[] args) {
		//int A[] = new int[] {5,3,1,7,9};
		int A[] = new int[] {1,1,2,2,2,3,4,5,5,6};
		LinkedListInsertion l = new LinkedListInsertion();
		
		Node temp;
		Node last = new Node();
		
		l.head.data = A[0];
		l.head.next = null;
		last = l.head;
		
		//Create a LinkedList
		for(int i=1; i<A.length; i++) {
			temp = new Node();		//Creating temp node
			
			//Populating temp node
			temp.data = A[i];
			temp.next = null;
			
			//last's next is pointing to temp
			last.next = temp;
			last = temp;
		}
		System.out.println(l.isSorted(l));
		l = l.removeDuplicateFromSorted(l);
		l.display(l.head);
		l.head = l.insertAtFront(4, l.head);
		l.head = l.insertAfter(9, l.head);
		l.head = l.insertAtNextKey(8, 3, l.head);
		l.head = l.insertAtPreviousKey(2, 1, l.head);
		l.head = l.insertAtIndexPosition(6, 2, l.head);
		System.out.println(l.isSorted(l));
		l.display(l);
		
	}

	private void display(LinkedListInsertion list) {
		while(list.head != null) {
			System.out.println("Iterating list "+ head.data);
			list.head = list.head.next;
		}
	}
	
	private void display(Node head) {
		Node first = new Node();
		first = head;
		if(first.next != null) {
			System.out.println(first.data);
			first = first.next;
			display(first);
		}
	}

}
