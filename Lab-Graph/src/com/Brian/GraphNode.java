package com.Brian;

import java.util.List;

public class GraphNode {
	int data;
	List<GraphNode> neighbors;
	
	public void addNeighbor(GraphNode node) {
		this.neighbors.add(node);
	}
}
