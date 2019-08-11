package com.Brian;

public class Queue {
	Stack oldest;
	Stack newest;
	
	Queue() {
		this.oldest = new Stack();
		this.newest = new Stack();
	}
	
	public void add(Node node) {
		this.newest.push(node);
	}
	
	public Node peek() {
		if (this.oldest.peek() != null) {
			return this.oldest.peek();
		} else {
			while (newest.peek() != null) {
				oldest.push(newest.pop());
			}
			return this.oldest.peek();
		}
	}
	
	public Node remove() {
		if (this.oldest.peek() != null) {
			return this.oldest.pop();
		} else {
			while (newest.peek() != null) {
				oldest.push(newest.pop());
			}
			return this.oldest.pop();
		}
	}
}
