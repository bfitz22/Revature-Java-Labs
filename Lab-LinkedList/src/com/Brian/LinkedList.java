package com.Brian;

public class LinkedList {
	Node head;
	
	public LinkedList() {
		this.head = new Node(0);
	}
	
	public static void main(String[] args) {
		LinkedList li = new LinkedList();
		System.out.println(li);
	}

	@Override
	public String toString() {
		String string = "";
		Node current = this.head;
		while (current != null) {
			string += "node: " + current.data + ", ";
			current = current.next;
		}
		return string;
	}
	
	public void add(Node newNode) {
		Node current = this.head;
		while (current.next != null) {
			current = current.next;
		}
		current.next = newNode;
	}
}
