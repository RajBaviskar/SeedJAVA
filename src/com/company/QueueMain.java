package com.company;

import com.company.MyQueue;

public class QueueMain {
	public static void main(String[] args) {
		MyQueue myQueue = new MyQueue();
		myQueue.enqueue(2);
		myQueue.enqueue(5);
		myQueue.enqueue(8);
		myQueue.enqueue(10);
		myQueue.showQueue();
		myQueue.dequeue();
		myQueue.showQueue();
		myQueue.dequeue();
		myQueue.dequeue();
		myQueue.dequeue();
		myQueue.showQueue();
		// Stack operations 

		myQueue.push(2);
		myQueue.push(5);
		myQueue.push(8);
		myQueue.push(10);
		myQueue.showQueue();
		myQueue.pop();
		//myQueue.push(10);
		myQueue.showQueue();
		myQueue.pop();
		myQueue.push(2);
		myQueue.showQueue();
	}
}
