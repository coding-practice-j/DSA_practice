package com.practice.DSA.Queue;

class DNode{
	int data;
	DNode prev;
	DNode next;
}

public class DEQueue {
	
	static DNode front = new DNode();
	static DNode rear = new DNode();

	public static void main(String[] args) {
		front = rear = null;

		System.out.println("Is empty(): "+ empty());
		System.out.println("Is full(): "+ full());
		
		enqueueFront(10);
		enqueueLast(20);
		enqueueFront(30);
		enqueueLast(40);
		enqueueFront(50);
		
		display();
		
		System.out.println("Removing element from front: "+ dequeueFront());
		System.out.println("Removing element from front: "+ dequeueLast());
		
		display();
	}

	private static int dequeueLast() {
		int x = -1;
		if(empty()) {
			System.out.println("Queue is already empty!");
		}else {
			x = rear.data;
			rear = rear.prev;
			rear.next = null;
		}
		return x;
	}

	private static int dequeueFront() {
		int x = -1;
		if(empty()) {
			System.out.println("Queue is already empty!");
		}else {
			x = front.data;
			front = front.next;
			front.prev = null;
		}
		return x;
	}

	private static void display() {
		DNode temp = new DNode();
		temp = front;
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}

	private static void enqueueLast(int x) {
		if(full()) {
			System.out.println("DEqueue is full!");
		}else {
			DNode temp = new DNode();
			temp.data = x;
			temp.next = null;
			if(empty()) {
				temp.prev = null;
				front = rear = temp;
			}else {
				rear.next = temp;
				temp.prev = rear;
				rear = temp;
			}
		}
	}

	private static void enqueueFront(int x) {
		if(full()) {
			System.out.println("DEqueue is full!");
		}else {
			DNode temp = new DNode();
			temp.data = x;
			temp.prev = null;
			if(empty()) {
				temp.next = null;
				front = rear = temp;
			}else {
				temp.next = front;
				front.prev = temp;
				front = temp;
			}
		}
	}

	private static boolean full() {		//This is only possible when heap is full and we are unable to create new Node.
		DNode newNode = new DNode();
		if(newNode == null) {
			return true;
		}
		return false;
	}

	private static boolean empty() {
		if(front == null) {
			return true;
		}
		return false;
	}

}
