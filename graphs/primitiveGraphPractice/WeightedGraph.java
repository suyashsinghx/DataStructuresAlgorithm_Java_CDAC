package graphs.primitiveGraphPractice;

import java.util.ArrayList;

public class WeightedGraph {

	public class Edge{
		private int neighbor;
		private int weight;
		
		public Edge(int neighbor, int weight) {
			this.neighbor = neighbor;
			this.weight = weight;
		}
		
		public int getNeighbour() {
			return neighbor;
		}
		
		public int getWeight() {
			return weight;
		}
		
	}
	//---------------------------------------------
	private int numVert;
	private ArrayList<ArrayList<Edge>> adj;
	
	public WeightedGraph(int numberOfVertices) {
		numVert = numberOfVertices;
		adj = new ArrayList<>();
		
		for(int i=0; i<numVert; i++) {
			adj.add(new ArrayList<>());
		}
	}
	
	public void addEdge(int vertex, int adjVertex, int weight) {
		
		if(vertex < 0 || vertex > numVert || adjVertex > numVert || adjVertex < 0) {
			System.out.println("Invalid Vertices..");
			return;
		}
		
		if(adj.get(vertex).contains(adjVertex)) {
			return;
		}
		
		adj.get(vertex).add(new Edge(adjVertex, weight));
		adj.get(adjVertex).add(new Edge(vertex, weight));		//undirected-weighted graph
		
	}
	
	public void display() {
		
		for(int i=0; i<adj.size(); i++) {
			System.out.print(i+" -> ");
			for(Edge e : adj.get(i)) {
				System.out.print(e.neighbor+"  "+e.weight);
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		
		WeightedGraph g = new WeightedGraph(5);
		
		g.addEdge(0, 1, 8);
		g.addEdge(1, 4, 7);
		g.addEdge(2, 3, 6);
		g.addEdge(3, 1, 9);
		
		g.display();
		
	}
	
}
