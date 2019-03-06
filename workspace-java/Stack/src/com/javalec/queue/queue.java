package com.javalec.queue;

public class queue {

	private int front;
	private int rear;
	private int maxSize;
	private Object[] queueArray;

	public queue(int maxSize) {
		this.front = 0;
		this.rear = -1;
		this.maxSize = maxSize;
		this.queueArray = new Object[maxSize];
	}

	public boolean empty() {
		return (front == rear + 1);
	}

	public boolean full() {
		return (rear == maxSize - 1);
	}

	// 큐 rear에 item 등록
	public void insert(Object item) {
		if (full() == false) {
			queueArray[++rear] = item;
		} else {
			System.out.println("queue is full");
		}
	}

	// 큐에서 front data remove
	public Object remove() {
		Object item = peek();
		front++;
		return queueArray[front];

		// return queueArray[front++];
	}

	public Object peek() {
		if (empty()) {
			throw new ArrayIndexOutOfBoundsException();
		}
		return queueArray[front];

	}

	public void printStack() {
		System.out.println("---------queue list-------------");
		for (int i = front; i <= rear; i++) {
			System.out.print(queueArray[i] + "  ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		queue qu = new queue(50);

		qu.insert(5);
		qu.insert(4);
		qu.insert(3);
		qu.insert(2);
		qu.insert(1);
		qu.insert(0);

		qu.remove();

		qu.printStack();

	}

}
