package com.practice.DSA.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.ConcurrentLinkedQueue;

public class CreateBinaryTree {

	public static void main(String[] args) {
		Queue<Node> queue = new LinkedList<>();
		Node root = new Node();
		Node p = new Node();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter root element!");
		int nodeData = sc.nextInt();
		
		root.data = nodeData;
		root.leftChild = root.rightChild = null;
		
		queue.add(root);
		while(!queue.isEmpty()) {
			p = queue.poll();
			System.out.println("Enter left child; " + p.data + ": ");
			nodeData = sc.nextInt();
			if(nodeData != -1) {
				Node temp = new Node();
				temp.data = nodeData;
				temp.leftChild = null;
				temp.rightChild = null;
				p.leftChild = temp;
				
				queue.add(temp);
			}
			
			System.out.println("Enter right child; " + p.data + ": ");
			nodeData = sc.nextInt();
			if(nodeData != -1) {
				Node temp = new Node();
				temp.data = nodeData;
				temp.leftChild = null;
				temp.rightChild = null;
				p.rightChild = temp;
				
				queue.add(temp);
			}
		}
		
		Node traverse = new Node();
		traverse = root;
		
		System.out.println("Pre-Order Traversal: ");
		preOrder(traverse);
		System.out.println();
		IterationUsingLoop.preOrder(traverse);
		
		System.out.println("\nIn-Order Traversal: ");
		inOrder(traverse);
		System.out.println();
		IterationUsingLoop.inOrder(traverse);
		
		System.out.println("\nPost-Order Traversal: ");
		postOrder(traverse);
		System.out.println();
		//IterationUsingLoop.postOrder(traverse);
		
		System.out.println("\nLevel Order Traversal: ");
		IterationUsingLoop.levelOrder(traverse);
		
		System.out.println("\nCount of the leaf nodes: " + IterationUsingLoop.countLeaf(traverse));
		
	}

	private static void postOrder(Node traverse) {
		
		if(traverse != null) {
			postOrder(traverse.leftChild);
			postOrder(traverse.rightChild);
			System.out.print(traverse.data + " ");
		}
	}

	private static void inOrder(Node traverse) {
		if(traverse != null) {
			inOrder(traverse.leftChild);
			System.out.print(traverse.data + " ");
			inOrder(traverse.rightChild);
		}
	}

	private static void preOrder(Node traverse) {
		
		if(traverse != null) {
			System.out.print(traverse.data + " ");
			preOrder(traverse.leftChild);
			preOrder(traverse.rightChild);
		}
	}

}
