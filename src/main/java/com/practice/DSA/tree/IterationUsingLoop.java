package com.practice.DSA.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class IterationUsingLoop {

	public static void preOrder(Node traverse) {
		Stack<Node> st = new Stack<>();
		Node t = new Node();
		t = traverse;
		while (t != null || !st.empty()) {
			if (t != null) {
				System.out.print(t.data + " ");
				st.add(t);
				t = t.leftChild;
			} else {
				t = st.pop();
				t = t.rightChild;
			}
		}
	}

	public static void inOrder(Node traverse) {
		Stack<Node> st = new Stack<>();
		Node t = new Node();
		t = traverse;
		while (t != null || !st.empty()) {
			if (t != null) {
				st.push(t);
				t = t.leftChild;
			} else {
				t = st.pop();
				System.out.print(t.data + " ");
				t = t.rightChild;
			}
		}
	}

	public static void postOrder(Node traverse) {
		Stack<Node> st = new Stack<>();
		Node temp;
		Node t = new Node();
		t = traverse;
		while (t != null || !st.empty()) {
			if (t != null) {
				st.push(t);
				t = t.leftChild;
			} else {
				temp = st.pop();
				t = t.rightChild;
				st.push(temp);
				System.out.print(temp.data + " ");
				t = null;
			}
		}
	}

	public static void levelOrder(Node traverse) {
		Queue<Node> queue = new LinkedList<>();
		Node p = new Node();
		System.out.print(traverse.data + " ");
		queue.add(traverse);
		while (!queue.isEmpty()) {
			p = queue.poll();
			if (p.leftChild != null) {
				System.out.print(p.leftChild.data + " ");
				queue.add(p.leftChild);
			}
			if (p.rightChild != null) {
				System.out.print(p.rightChild.data + " ");
				queue.add(p.rightChild);
			}
		}
	}

	public static int countLeaf(Node traverse) {
		int x, y;
		if (traverse != null) {
			x = countLeaf(traverse.leftChild);
			y = countLeaf(traverse.rightChild);
			// return x+y+1; // returns total could of the node

			// return degree 2 nodes
			/*
			 * if(traverse.leftChild != null && traverse.rightChild != null) { return x+y+1;
			 * }else { return x+y; }
			 */

			// return degree 0 nodes
			if (traverse.leftChild == null && traverse.rightChild == null) {
				return x + y + 1;
			} else {
				return x + y;
			}

			// return height of the tree
			/*
			 * if (x > y) { return x + 1; } else { return y + 1; }
			 */
		}
		return 0;
	}

}
