package com.company;

import com.company.Node;

public class MyQueue {
	Node head;
	Node tail;

	public void enqueue(int data) {
		Node newNode = new Node(data);

		if(head == null || tail == null) {
			System.out.println("-");
			head = newNode;
			tail = newNode;
		}
		tail.next = newNode;
		newNode.prev = tail;
		tail = newNode;
	}

	public void dequeue() {
		if(head == null) {
			System.out.println("Queue is already empty");
			return;
		}

		head = head.next;
	}

	public void push(int data) {
		this.enqueue(data);
	}

	public void pop() {
		if(tail == null) {
			return;
		}

		tail = tail.prev;
	}

	public void showQueue() {
		if(head == null) {
			System.out.println("Queue is Empty");
			return;
		}

		Node iterator = head;
		while(iterator != null) {
			System.out.println(iterator.data);
			if(iterator == tail) {
				break;
			}
			iterator = iterator.next;
		}
		System.out.println("----");
	}
}