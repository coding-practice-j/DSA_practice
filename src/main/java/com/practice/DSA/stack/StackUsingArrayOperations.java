package com.practice.DSA.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class StackUsingArrayOperations {
	
	public static void main(String[] args) throws IOException {
		
		StackUsingArray s = new StackUsingArray();
		
		/*
		 * BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 * String str = br.readLine();
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size: ");
		int size = sc.nextInt();
		
		s.size = size;
		s.top = -1;
		s.A = new int[size];
		
		boolean flag = false;
		
		flag = isEmpty(s);
		System.out.println("is Empty: "+ flag);
		flag = isFull(s);
		System.out.println("is Full: "+ flag);
		
		s = push(s, 10);
		s = push(s, 20);
		s = push(s, 30);
		s = push(s, 40);
		s = push(s, 50);
		display(s);
		
		flag = isEmpty(s);
		System.out.println("\nis Empty: "+ flag);
		flag = isFull(s);
		System.out.println("is Full: "+ flag);
		
		int returnVal = peek(s, 2);
		System.out.println("Peeked: "+ s.A[returnVal] + ", Array Position: "+ returnVal);
		
		s = pop(s);
		s = pop(s);
		display(s);
		
		int top = stackTop(s);
		System.out.println("\nStack top Value: "+top);
		display(s);
	}

	private static void display(StackUsingArray s) {
		for(int i= s.top; i>=0; i--) {
			System.out.print(s.A[i] + " ");
		}
	}

	private static int stackTop(StackUsingArray s) {
		if(isEmpty(s)) {
			return -1;
		}
		return s.A[s.top];
	}

	private static StackUsingArray pop(StackUsingArray s) {
		if(isEmpty(s)) {
			System.out.println("Stack Underflow!");
		} else {
			System.out.println("Popped: "+ s.A[s.top]);
			s.A[s.top] = 0;
			s.top--;
		}
		return s;
	}

	private static int peek(StackUsingArray s, int pos) {
		if((s.top- pos + 1) < 0) {
			System.out.println("Invalid index!");
		}
		return (s.top- pos + 1);
	}

	private static StackUsingArray push(StackUsingArray s, int value) {
		if(!isFull(s)) {
			s.top++;
			s.A[s.top] = value;
		}else {
			System.out.println("Stack Overflow!");
		}
		return s;
	}

	private static boolean isFull(StackUsingArray s) {
		if(s.top == s.size-1) {
			return true;
		}
		return false;
	}

	private static boolean isEmpty(StackUsingArray st) {
		if(st.top == -1) {
			return true;
		}
		return false;
	}

}
