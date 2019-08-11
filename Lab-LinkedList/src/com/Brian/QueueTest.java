package com.Brian;

public class QueueTest {
	public static void main(String[] args) {
		Node newNode = new Node(1);
		Node newNode1 = new Node(1);
		Node newNode2 = new Node(2);
		Node newNode3 = new Node(3);
		Node newNode4 = new Node(3);
		
		Queue queue = new Queue();
		queue.add(newNode);
		queue.add(newNode1);
		queue.add(newNode2);
		queue.add(newNode3);
		queue.add(newNode4);
		
		queue.remove();
		
		System.out.println(queue.peek() == newNode1);
		System.out.println(queue.peek().next == newNode2);
	}
}
