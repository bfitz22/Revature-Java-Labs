package com.Brian;

public class Stack {
	private Node top;
	
	public void push(Node newNode) {
		if (this.top != null) {
			newNode.next = this.top;
			this.top = newNode; 
		} else {
			this.top = newNode;
		}
	}
	
	public Node pop() {
		Node removed;
		if (this.top != null & this.top.next != null) {
			removed = this.top;
			this.top = this.top.next;
			return removed;
		} else if(this.top != null) {
			removed = this.top;
			this.top = null; 
			return removed;
		} else {
			return null; 
		}
	}
	
	public Node peek() {
		return this.top; 
	}
}
