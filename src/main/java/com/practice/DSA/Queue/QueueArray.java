package com.practice.DSA.Queue;

public class QueueArray {
	
	int size;
	int front; 	//Front to delete the element from the queue.
	int rear; 	//Rear to insert the elements in the queue.
	int[] Q;
	
	public QueueArray(int size, int front, int rear) {
		this.size = size;
		this.rear = rear;
		this.front = front;
	}

}
