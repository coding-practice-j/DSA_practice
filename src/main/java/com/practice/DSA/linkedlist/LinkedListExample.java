package com.practice.DSA.linkedlist;

import java.util.stream.Stream;

class Node{
	int data;
	Node next;
}

public class LinkedListExample {

	public static void main(String[] args) {

		int A[] = new int[] {5,3,1,7,9};
		
		Node head1 = new Node();
		
		Node temp;
		Node last;
		
		head1.data = A[0];
		head1.next = null;
		last = head1;
		
		//Create a LinkedList
		for(int i=0; i<A.length; i++) {
			temp = new Node();		//Creating temp node
			
			//Populating temp node
			temp.data = A[i];
			temp.next = null;
			
			//last's next is pointing to temp
			last.next = temp;
			last = temp;
		}
		
		//Display Linked List
		Node p = head1;
		LinkedListExample.display(p);
		System.out.println("Find a element in list: "+ LinkedListExample.find(p, 20));
		
		Stream.of(7, 7).forEach(i -> System.out.println("Using move first: "+ LinkedListExample.findUsingMoveFirst(p, i)));
		
	}

	public static void display(Node p) {
		int count = 0; 
		int sum = 0;
		int max = 0;
		int min =0;
		while(p != null) {
			System.out.println(p.data);
			sum += p.data;
			if(p.data > max) {
				max = p.data;
			}else {
				min = p.data;
			}
			p = p.next;
			count++;
		}
		System.out.println("count: "+count);
		System.out.println("total sum: "+sum);
		System.out.println("min: "+min + " and Max: "+ max);
		
	}
	
	public static boolean find(Node p, int key) {
		while(p!=null) {
			if(p.data == key) {
				return true;
			}
			p = p.next;
		}
		return false;
	}
	
	public static boolean findUsingMoveFirst(Node p, int key) {
		Node first = p;
		System.out.println("First Element: "+first.data);
		Node q = null;
		while(p!=null) {
			if(p.data == key) {
				q.next = p.next;
				p.next = first;
				first = p;
				return true;
			}
			q = p;
			p = p.next;
		}
		return false;
	}
	
}
