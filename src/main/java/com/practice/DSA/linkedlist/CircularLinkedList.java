package com.practice.DSA.linkedlist;

public class CircularLinkedList {
	
	
	private static boolean isCircular(Node first) {
		Node temp = new Node();
		temp = first;
		if(temp == null) {
			System.out.println("List is Empty!");
			return false;
		}
		while(temp.next != first && temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
		if(temp == null || temp.next == null) {
			return false;
		}
		System.out.println(temp.data);
		return true;
	}
	
	private static boolean isLoop(Node first) {
		Node p = new Node();
		Node q = new Node();
		p = q = first;
		do {
			p = p.next;
			//System.out.println("P's data: "+ p.data);
			q =  q.next;
			//System.out.println("q's data: "+q.data);
			q = (q.next != null) ? q.next : null ;
		}while(p != first && q != first);
		return p == q ? true : false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating a circular Linked List
		Node first =  new Node();
		first.data = 10;
		first.next = null;
		Node last;
		Node temp;
		last  =  first;
		
		for(int i=1; i<5; i++) {
			temp = new Node();
			temp.data = (i*10)+ 10;
			temp.next = null;
			
			last.next = temp;
			//System.out.println("Last: "+ last.data + "next: "+ last.next);
			last = temp;
		}
		//System.out.println("Last: "+ last.data + "next again: "+ last.next);
		last.next =  first;
		//System.out.println("First: "+ first);
		//System.out.println("Last: "+ last.data + "next again: "+ last.next);

		System.out.println("List is circular Linked list: "+ isLoop(first));
		System.out.println("Is circular: "+ isCircular(first));
		
		Node newNode = new Node();
		newNode = null;
		//System.out.println("newNode : "+ newNode.data);
		newNode = insert(newNode, 0, 70);
		newNode = insert(newNode, 1, 80);
		newNode = insert(newNode, 2, 100);
		newNode = insert(newNode, 0, 60); 
		newNode = insert(newNode, 3, 90);
		 
		System.out.println("Is circular: "+ isCircular(newNode));
		
		newNode = delete(newNode, 0);
		System.out.println("Is circular: "+ isCircular(newNode));
		
	}
	
	private static Node insert(Node first, int pos, int value) {
		Node q = new Node();
		Node p = new Node(); 
		//Node q = null;
		
		if(first == null) {
			p.data = value;
			p.next = p;
			first = p;
		}else if(pos == 0) {
			q.data = value;
			q.next = first;
			p = first;
			while(p.next != first) 
				p = p.next;
			p.next = q;
			first = q;
		}else {
			p = first;
			for(int i=0; i<pos-1; i++) {
				p = p.next;
			}
			q.data = value;
			q.next = p.next;
			p.next = q;
		}
		return first;
	}

	private static Node delete(Node first, int pos) {
		Node p = new Node();
		p = first;
		if(pos != 0) {
			Node q = new Node();
			for(int i=0; i<pos-1; i++) {
				p = p.next;
			}
			q = p.next;
			p.next = q.next;
		}else {
			while(p.next != first) {
				p = p.next;
			}
			p.next = first.next;
			first = p.next;
		}
		return first;
	}
}
