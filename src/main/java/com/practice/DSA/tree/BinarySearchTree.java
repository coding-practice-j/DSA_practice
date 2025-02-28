package com.practice.DSA.tree;

public class BinarySearchTree {

	public static void main(String[] args) {
		Node root = null;

		root = insert(root, 30);
		root = insert(root, 10);
		root = insert(root, 40);
		root = insert(root, 35);
		root = insert(root, 20);
		root = insert(root, 33);
		
		/*
		 * root = recursiveInsert(root, 30); root = recursiveInsert(root, 10); root =
		 * recursiveInsert(root, 40); root = recursiveInsert(root, 35); root =
		 * recursiveInsert(root, 20);
		 */

		System.out.println("Displaying tree: ");
		inOrder(root);

		Node element = search(root, 20);
		if (element == null) {
			System.out.println("\nElement no found!");
		} else {
			System.out.println("\nElement found at Node " + element + " value: " + element.data);
		}

		root = delete(root, 30);
		System.out.println("After Deletion :");

		inOrder(root);
		System.out.println("\nHeight: "+height(root));

	}

	private static Node inPredecessor(Node p) {
		while (p != null && p.rightChild != null) {
			p = p.rightChild;
		}
		return p;
	}

	private static Node inSuccessor(Node p) {
		while (p != null && p.leftChild != null) {
			p = p.leftChild;
		}
		return p;
	}

	private static int height(Node root) {
		int x, y;
		if (root == null) {
			return 0;
		}
		x = height(root.leftChild);
		y = height(root.rightChild);
		return x > y ? x + 1 : y + 1;
	}

	private static Node delete(Node root, int key) {
		Node q;

		if (root == null) {
			return root;
		}

		if(root.data == key) {
			if (root.leftChild == null && root.rightChild == null) {
				return null;
			}else if (root.leftChild == null) { 
				return root.rightChild; 
			}else if(root.rightChild == null){
				return root.leftChild; 
			}
		}

		if (key < root.data) {
			root.leftChild = delete(root.leftChild, key);
		} else if (key > root.data) {
			root.rightChild = delete(root.rightChild, key);
		} else {
			if (height(root.leftChild) > height(root.rightChild)) {
				q = inPredecessor(root.leftChild);
				root.data = q.data;
				root.rightChild = delete(root.leftChild, q.data);
			} else {
				q = inSuccessor(root.rightChild);
				root.data = q.data;
				root.rightChild = delete(root.rightChild, q.data);
			}
		}
		return root;
	}

	private static Node search(Node root, int key) {
		Node temp = root;
		while (temp != null) {
			if (temp.data == key) {
				return temp;
			} else if (key < temp.data) {
				temp = temp.leftChild;
			} else {
				temp = temp.rightChild;
			}
		}
		return null;
	}

	private static void inOrder(Node root) {
		if (root != null) {
			inOrder(root.leftChild);
			System.out.print(root.data + " ");
			inOrder(root.rightChild);
		}
	}

	private static Node insert(Node root, int key) {
		Node p = new Node();
		Node temp;
		temp = root;
		Node slowptr = null;

		if (root == null) {
			p.data = key;
			p.leftChild = null;
			p.rightChild = null;
			root = p;
		} else {
			while (temp != null) {
				slowptr = temp;
				if (key < temp.data) {
					temp = temp.leftChild;
				} else {
					temp = temp.rightChild;
				}
			}
			p = new Node();
			p.data = key;
			p.leftChild = null;
			p.rightChild = null;
			if (key < slowptr.data) {
				slowptr.leftChild = p;
			} else {
				slowptr.rightChild = p;
			}
		}
		return root;
	}

	private static Node recursiveInsert(Node root, int key) {
		if (root == null) {
			root = new Node();
			root.data = key;
			root.leftChild = null;
			root.rightChild = null;
			return root;
		}
		if (key < root.data) {
			root.leftChild = recursiveInsert(root.leftChild, key);
		} else {
			root.rightChild = recursiveInsert(root.rightChild, key);
		}
		return root;
	}

}
