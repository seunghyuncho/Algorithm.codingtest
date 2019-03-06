package com.javalec.queue;


public class queue_LinkedList {
	private Node front;
	private Node rear;

	public queue_LinkedList() {
		this.front = null;
		this.rear = null;
	}

	public boolean empty() {
		return (front == null);
	}

	public void insert(Object item) {
		Node node = new Node(item);
		node.nextNode = null;
		if (empty()) {
			front = node;
			rear = node;
		} else {
			rear.nextNode = node;
			rear = node;
		}
		System.out.println("queue insert : ");

	}

	public Object peek() {
		if (empty())
			throw new ArrayIndexOutOfBoundsException();
		System.out.println("peek!!" + front.data);
		return front.data;
	}

	public Object remove() {
		Object item = peek();
		front.nextNode = front;

		if (front == null) {
			rear = null;
		}
		System.out.println("remove!!!" + item);
		return item;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		queue_LinkedList qu = new queue_LinkedList();

		qu.insert(1);
		qu.insert(2);
		qu.insert(3);
		qu.insert(4);
		
		qu.peek();

	}

}
