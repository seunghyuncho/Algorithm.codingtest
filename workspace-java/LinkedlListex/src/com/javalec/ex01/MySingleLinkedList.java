package com.javalec.ex01;

public class MySingleLinkedList<T> {
	public Node<T> head;
	public int size;

	public MySingleLinkedList() {
		head = null;
		size = 0;
	}

	public void add(int index, T item) {

	}

	public void remove(int index) {

	}

	public int indexOf(T item) {
		return -1;
	}

	public T get(int index) {
		return null;
	}

	public void addFirst(T item) {
		Node<T> newNode = new Node<T>(item);

		newNode.next = head;
		head = newNode;
		size++;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
