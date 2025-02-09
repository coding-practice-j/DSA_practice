package com.practice.DSA.stack;

public class StackUsingLLOperations {
	static StackUsingLL top = new StackUsingLL();
	public static void main(String[] args) {
		top = null;
		
		boolean flag = false;
		flag = isEmpty(top);
		System.out.println("Empty: "+ flag);
		flag = isFull();
		System.out.println("Empty: "+ flag);
		
		top = push(20);
		top = push(40);
		top = push(60);
		top = push(80);
		top = push(100);
		
		display();
		int value = pop();
		System.out.println("\nPopped: "+value);
		value = pop();
		System.out.println("Popped: "+value);
		display();
		
		value = peek(top, 2);
		System.out.println("\nPeeked: "+value);
		display();
		
		System.out.println("\nStack top: "+top.data);
	}

	private static int peek(StackUsingLL top, int pos) {
		StackUsingLL temp = new StackUsingLL();
		temp = top;
		for(int i=0; i<pos-1;i++) {
			temp = temp.next;
		}
		return temp.data;
	}

	private static int pop() {
		if(isEmpty(top)) {
			System.out.println("Stack Underflow!");
			return -1;
		}else {
			int x = top.data;
			top = top.next;
			return x;
		}
	}

	private static void display() {
		StackUsingLL s = new StackUsingLL();
		s = top;
		while(s != null) {
			System.out.print(s.data+" ");
			s = s.next;
		}
		
	}

	private static StackUsingLL push(int value) {
		if(isFull()) {
			System.out.println("Stack Overflow!");
		}else {
			StackUsingLL newNode = new StackUsingLL();
			newNode.data = value;
			newNode.next = top;
			top = newNode;
		}
		return top;
	}

	private static boolean isFull() {
		StackUsingLL tempNode = new StackUsingLL();
		if(tempNode == null) {
			return true;
		}
		return false;
	}

	private static boolean isEmpty(StackUsingLL top) {
		if(top == null) {
			return true;
		}
		return false;
	}

}
