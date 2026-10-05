package graphs.primitiveGraphPractice;

import java.util.ArrayList;

public class UnweightedGraph {

	private int numVert;
	private ArrayList<ArrayList<Integer>> adj;
	
	public UnweightedGraph(int size) {
		numVert = size;
		adj = new ArrayList<>();
		for(int i=0; i<numVert; i++) {
			adj.add(new ArrayList<Integer>());
		}
	}
	
	public void addEdge(int v, int u) {
		//v-> vertex index
		//u-> neighbor or adjacent vertex
		
		if(u < 0 || u >= numVert ||
			       v < 0 || v >= numVert) {

			        System.out.println("Invalid vertex");
			        return;
			    }
		
		if(!adj.get(v).contains(u)) {
			
			adj.get(v).add(u);
			adj.get(u).add(v);	//cause undirected-unweighted......
			
		}
		
	}
	
	public ArrayList<Integer> neighbors(int vertex){
		
//		System.out.println(vertex+ ":- " +adj.get(vertex));
		return adj.get(vertex);
	}
	
	public int numVertices() {
		return numVert;
	}
	
	public void display() {
		
		for(int i=0; i<adj.size(); i++) {
			System.out.println(i+" -> "+adj.get(i));
		}
		
	}
	
	public static void main(String[] args) {
		
		UnweightedGraph g = new UnweightedGraph(5);
		
		g.addEdge(0, 2);
		g.addEdge(0, 3);
		g.addEdge(2, 1);
		
		
		g.display();
		
		System.out.println(g.neighbors(2));
		System.out.println(g.numVert);
		
	}
	
}
