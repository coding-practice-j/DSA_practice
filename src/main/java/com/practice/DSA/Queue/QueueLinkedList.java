package com.practice.DSA.Queue;

public class QueueLinkedList {

	static Node front = new Node();		//Deletion
	static Node rear = new Node();		//Insertion
	
	public static void main(String[] args) {
		front =  rear = null;
		
		System.out.println("Is Empty: " + isEmpty(front));
		System.out.println("Is Full: " + isFull());
		
		enqueue(10);
		enqueue(20);
		enqueue(30);
		enqueue(40);
		enqueue(50);
		
		display();		
		System.out.println("\nremoving value: " + dequeue());
		System.out.println("removing value: " + dequeue());

		display();
	}

	private static int dequeue() {
		int x = -1;
		if(isEmpty(front)) {
			System.out.println("Queue is already empty!");
		}else {
			x = front.data;
			front = front.next;
		}
		return x;
	}

	private static void display() {
		Node n = new Node();
		n = front;
		while(n != null) {
			System.out.print(n.data + " ");
			n = n.next;
		}
	}

	private static void enqueue(int x) {
		Node tempNode = new Node();
		if(isFull()) {
			System.out.println("Queue is Full!");
		}else {
			tempNode.data = x;
			tempNode.next = null;
			if(isEmpty(front)) {
				front = rear = tempNode;
			}else {
				rear.next = tempNode;
				rear = tempNode;
			}
		}
	}

	private static boolean isFull() {	//This is only possible when heap is full and we are unable to create new Node.
		Node newNode = new Node();			
		if(newNode == null) {
			return true;
		}
		return false;
	}

	private static boolean isEmpty(Node front) {
		if(front == null) {
			return true;
		}
		return false;
	}
}
