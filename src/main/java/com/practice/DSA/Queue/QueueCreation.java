package com.practice.DSA.Queue;

import java.util.Scanner;

public class QueueCreation {

	public static void main(String[] args) {
		/*
		 * Scanner sc = new Scanner(System.in);
		 * System.out.print("Enter the size of a queue: "); int size = sc.nextInt();
		 */
		int size = 7;
		QueueArray queue = new QueueArray(size, -1, -1);
		queue.Q = new int[size];

		System.out.println("Is Queue Empty: " + isEmpty(queue));
		System.out.println("Is Queue Full: " + isFull(queue));
		
		enqueue(queue, 10);
		enqueue(queue, 20);
		enqueue(queue, 30);
		enqueue(queue, 40);
		enqueue(queue, 50);
		enqueue(queue, 60);
		enqueue(queue, 70);

		display(queue);
		
		System.out.println("\nIs Queue Empty: " + isEmpty(queue));
		System.out.println("Is Queue Full: " + isFull(queue));

		dequeue(queue);
		dequeue(queue);
		dequeue(queue);
		
		display(queue);
		
		System.out.println("\nIs Queue Empty: " + isEmpty(queue));
		System.out.println("Is Queue Full: " + isFull(queue));	//this is the drawback of using array, we cannot use delete space
	}

	private static void display(QueueArray queue) {
		for(int i=queue.front+1; i<=queue.rear; i++) {
			System.out.print(queue.Q[i] + " ");
		}
	}

	private static int dequeue(QueueArray queue) {
		int x = -1;
		if(isEmpty(queue)) {
			System.out.println("Queue is already empty!");
		}else {
			queue.front++;
			x = queue.Q[queue.front];
			queue.Q[queue.front] = -1;
		}
		return x;
	}

	private static boolean isFull(QueueArray queue) {
		if (queue.rear == queue.Q.length - 1) {
			return true;
		}
		return false;
	}

	private static boolean isEmpty(QueueArray queue) {
		if (queue.front == queue.rear) {
			return true;
		}
		return false;
	}

	private static void enqueue(QueueArray queue, int value) {
		if (isFull(queue)) {
			System.out.println("Queue is full!");
		} else {
			queue.rear++;
			queue.Q[queue.rear] = value;
		}
	}

}
