package com.practice.DSA.Queue;

public class CircularQueue {

	public static void main(String[] args) {
		int size = 5;
		QueueArray queue = new QueueArray(size, 0, 0);
		queue.Q = new int[size];

		System.out.println("Is Queue Empty: " + isEmpty(queue));
		System.out.println("Is Queue Full: " + isFull(queue));

		enqueue(queue, 10);
		enqueue(queue, 20);
		enqueue(queue, 30);
		enqueue(queue, 40);
		enqueue(queue, 70);

		display(queue);

		dequeue(queue);
		dequeue(queue);
		
		enqueue(queue, 50);
		enqueue(queue, 60);
		
		System.out.println("n displaying again: ");
		display(queue);

	}

	public static void display(QueueArray queue) {
		int i = queue.front + 1;
		do {
			System.out.print(queue.Q[i] + " ");
			i = (i+1) % queue.size;
		} while(i != ((queue.rear + 1) % queue.size));
	}

	private static int dequeue(QueueArray queue) {
		int x = 0;
		if (isEmpty(queue)) {
			return x;
		} else {
			queue.front = (queue.front + 1) % queue.size;
			x = queue.Q[queue.front];
			queue.Q[queue.front] = 0;
		}
		return x;
	}

	private static void enqueue(QueueArray queue, int x) {
		if (isFull(queue)) {
			System.out.println("Queue is full!");
		} else {
			queue.rear++;
			queue.rear = queue.rear % queue.size;
			queue.Q[queue.rear] = x;
		}
	}

	private static boolean isFull(QueueArray queue) {
		if ((queue.rear + 1) % queue.size == queue.front) {
			return true;
		}
		return false;
	}

	private static boolean isEmpty(QueueArray queue) {
		if (queue.rear == queue.front) {
			return true;
		}
		return false;
	}

}
