package com.practice.DSA.linkedlist;

public class LinkedListUsingRecursion {
	Node1 head = null;

	// Creating static class so that our main method can access it.
	static class Node1 {
		int data;
		Node1 next;

		Node1(int data) {
			this.data = data;
			this.next = null;
		}
	}

	// Insert an element in the list
	private static LinkedListUsingRecursion insert(LinkedListUsingRecursion list, int data) {
		Node1 newNode = new Node1(data);
		newNode.next = null;
		if (list.head == null) {
			list.head = newNode;
		} else {
			Node1 last = list.head;
			while (last.next != null) {
				last = last.next;
			}
			last.next = newNode;
		}
		return list;
	}

	// Delete by key
	private static LinkedListUsingRecursion delete(LinkedListUsingRecursion list, int key) {
		Node1 pNode = list.head;
		Node1 qNode = null;

		if (pNode != null && pNode.data == key) {
			list.head = pNode.next;
			return list;
		}
		
		while (pNode != null && pNode.data != key) {
			qNode = pNode;
			pNode = pNode.next;
		}
		
		if(pNode != null) {
			qNode.next = pNode.next;
		}else {
			System.out.println(key + " not found");
		}

		return list;
	}
	
	private static LinkedListUsingRecursion deleteAtPosition(LinkedListUsingRecursion list, int index) {
		Node1 pNode = list.head;
		Node1 qNode = null;
		if(index == 0 && pNode != null) {
			list.head = pNode.next;
		}else {
			int counter = 0;
			while(pNode.next != null) {
				if(counter == index) {
					qNode.next = pNode.next;
					break;
				}
				qNode = pNode;
				pNode = pNode.next;
				counter++;
			}
		}
		
		return list;
	}

	public static void main(String[] args) {
		LinkedListUsingRecursion list = new LinkedListUsingRecursion();
		// creating a linked list using add node
		list = insert(list, 23);
		list = insert(list, 33);
		list = insert(list, 43);
		list = insert(list, 53);
		list = insert(list, 63);

		list.display(list);
		System.out.println("\nDeleting By Key: ");
		list.delete(list, 53);
		list.display(list);
		System.out.println("\nDeleting By index: ");
		list.deleteAtPosition(list, 2);
		list.display(list);
	}

	private void display(LinkedListUsingRecursion list) {
		Node1 headNode = list.head;
		while (headNode != null) {
			System.out.print(headNode.data + " ");
			headNode = headNode.next;
		}
	}

}
