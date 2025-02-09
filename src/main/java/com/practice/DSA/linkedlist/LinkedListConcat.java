package com.practice.DSA.linkedlist;

public class LinkedListConcat {
	Node head = new Node();
	
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

	private static boolean isLoop(Node first) {
		Node p = new Node();
		Node q = new Node();
		p = q = first;
		do {
			p = p.next;
			q =  q.next;
			q = (q.next != null) ? q.next : null ;
		}while(p != null && q != null);
		return p == q ? true : false;
	}
	
	public static void main(String[] args) {

		int A[] = new int[] {2,4,6,8,10};
		
		LinkedListConcat list1 = new LinkedListConcat();
		Node temp;
		Node last = new Node();
		list1.head.data = A[0];
		list1.head.next = null;
		last = list1.head;
		
		//Create a LinkedList
		for(int i=1; i<A.length; i++) {
			temp = new Node();		//Creating temp node
			
			temp.data = A[i];		//Populating temp node
			temp.next = null;
			
			last.next = temp;		//last's next is pointing to temp
			last = temp;
		}
		
		Node head = null;
        head = insertEnd(head, 1);
        head = insertEnd(head, 3);
        head = insertEnd(head, 5);
        head = insertEnd(head, 7);
        head = insertEnd(head, 9);
        LinkedListConcat list2 = new LinkedListConcat();
        list2.head = head;
        //list2.head.next = head.next;
        
        LinkedListConcat list = concate(list1, list2);
        display(list);
        
        Node first = new Node();
        first = merging(list1.head, list2.head);
        System.out.println("\nMerging two sorted list: ");
        
        display(first);
        System.out.println("Is Loop? "+ isLoop(first));
	}
	
	private static void display(Node first) {
		Node traverse = new Node();
		traverse = first;
		while(traverse != null) {
			System.out.print(traverse.data +" ");
			traverse = traverse.next;
		}
		
	}

	private static Node merging(Node head1, Node head2) {
		Node first = new Node();
		Node last  = new Node();

		if(head1.data < head2.data) {
			first = head1;
			last = head1;
			head1 = head1.next;
			first.next = null;
		}else {
			first = head2;
			last = head2;
			head2 = head2.next;
			first.next = null;
		}
		
		while(head1 != null && head2 != null) {
			if(head1.data < head2.data) {
				last.next = head1;
				last = head1;
				head1 = head1.next;
				last.next = null;
			}else {
				last.next = head2;
				last = head2;
				head2 = head2.next;
				last.next = null;
			}
		}
		if(head1 != null) {
			last.next = head1;
			last = last.next;		//--> Not a valid statement
		}else {
			last.next = head2;
			last = last.next;		//--> Not a valid statement
		}
		last.next = null;			//--> Not a valid statement
		//System.out.println((last.next == null) + " data: "+ last.data);
		
		return first;
	}

	private static LinkedListConcat concate(LinkedListConcat list1, LinkedListConcat list2) {
		LinkedListConcat list = new LinkedListConcat();
		Node first = new Node();
		Node second = new Node();
		first = list1.head;
		second = list2.head;
		list.head = list1.head;
		while(first.next != null) {
			first = first.next;
		}
		first.next = second;
		return list;
	}
	
	private static void display(LinkedListConcat list) {
		Node first = new Node();
		first = list.head;
		while(first != null) {
			System.out.print(first.data + " ");
			first = first.next;
		}
	}

}
