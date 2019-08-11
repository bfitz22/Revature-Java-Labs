package com.Brian;

import java.util.List;

public class Graph {
	private List<GraphNode> nodes;
	
	public List<GraphNode> getNodes() {
		return nodes;
	}
	
	public void setNodes(List<GraphNode> nodes) {
		this.nodes = nodes;
	}

	public void addNode(GraphNode node) {
		this.nodes.add(node);
	}
}
