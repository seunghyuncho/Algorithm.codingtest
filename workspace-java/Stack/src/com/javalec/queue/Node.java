package com.javalec.queue;

public class Node {
	public Node nextNode;
	public Object data;

	public Node(Object data) {
		this.data = data;
		this.nextNode = null;
	}
}
