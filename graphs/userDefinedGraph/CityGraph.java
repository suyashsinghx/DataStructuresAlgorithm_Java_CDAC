package graphs.userDefinedGraph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class CityGraph {
	
//	------------------------------------------
	public class cityEdge{
		
		private String city;
		private int distance;
		
		cityEdge(String city, int distance){
			this.city = city;
			this.distance = distance;
		}
		
		public String getCity() {
			return city;
		}
		
		public int getDistance() {
			return distance;
		}
		
	}
//	------------------------------------------
	
	private int numVertex;
	private int cityIndex=0;
	private HashMap<String, Integer> city;
	private ArrayList<ArrayList<cityEdge>> adj;
	
	public CityGraph(int numberOfCities) {
		
		numVertex = numberOfCities;
		
		city = new HashMap<String, Integer>();
		
		adj = new ArrayList<>();
		
		for(int i=0; i<numVertex; i++) {
			adj.add(new ArrayList<>());
		}
		
	}
	
	public void addCity(String cityName) {
		
		if(cityIndex >= numVertex) {
			System.out.println("Maximum cities reached.");
	        return;
		}
		
		if(this.city.containsKey(cityName)) {
			System.out.println("City already exists.");
	        return;
		}
		
		this.city.put(cityName, cityIndex);
		cityIndex++;
	}
	
	
	public void addEdge(String city1, String city2, int distance) {
		
		if(!city.containsKey(city1) || !city.containsKey(city2)) {
			return;
		}
		
		int cityIdx1 = city.get(city1);
		int cityIdx2 = city.get(city2);
		
		if(cityIdx1 >= numVertex || cityIdx2 >= numVertex || cityIdx1 < 0 || cityIdx2 < 0) {
			System.out.println("Invalid City");
			return;
		}
		
		for(cityEdge edge : adj.get(cityIdx1)) {

		    if(edge.getCity().equals(city2)) {
		        return;
		    }
		}
		
		adj.get(cityIdx1).add(new cityEdge(city2, distance));
		adj.get(cityIdx2).add(new cityEdge(city1, distance));			//undirected-weighted graph
		
	}
	
	public void display()
	{
		for(String cityName : city.keySet()) {
			
			int cityidx = city.get(cityName);
			
			System.out.print(cityName + "\t-> ");
			
			for(cityEdge c : adj.get(cityidx)) {
				
				System.out.print("\t"+c.getCity() + " " + c.getDistance()+",");
				
			}			
			
			System.out.println();
		}
	}
	
	public void displayNeighbors(String city) {
		
		int idx = this.city.get(city);
		
//		System.out.println("Neighbor of "+city+" :- "+ adj.get(idx));
		System.out.print("Neighbor city of "+city+":  ");
		
		for(cityEdge c : adj.get(idx)) {
			System.out.print(" "+c.getCity() + ",  ");
		}
		
		System.out.println();
		
	}
	
	
	public void DFS() {
		
		if(numVertex <= 0) {
			System.out.println("Empty Graph..");
			return;
		}
		
		Stack<String> st = new Stack<String>();
		
//		visited marking array
		boolean visited[] = new boolean[numVertex]; 
		String temp;
		
		st.add("Mumbai");
		
		visited[city.get("Mumbai")] = true;
		
		while(!st.isEmpty()) {
			
			temp = st.pop();
			
			int idx = city.get(temp);
				
				System.out.print(temp+", ");
				visited[idx] = true;
			
				for(cityEdge edge : adj.get(idx)) {
					
					String neighbor = edge.getCity();
					
					int neighborIdx = city.get(neighbor);
					
					if(visited[neighborIdx] == false) {
						st.push(neighbor);
						visited[neighborIdx] = true;
					}
					
				}

			
		}
		System.out.println();
		
	}
	
	public void BFS() {
		
		if(numVertex <= 0) {
			System.out.println("Empty Graph");
			return;
		}
		
		boolean []visited = new boolean[numVertex];
//		breadth first search -> queue
		
		Queue<String> q = new LinkedList<String> ();
		
		String temp;
		
		q.offer("Mumbai");
		
		visited[city.get("Mumbai")] = true;
		
		while(!q.isEmpty()) {
			
			temp = q.poll();
			
			System.out.print(temp + ", ");
			
			int idx = city.get(temp);
			
			visited[idx] = true;
			
			for(cityEdge e : adj.get(idx)) {
				
				String neighborCity = e.getCity();
				int neighborIdx = city.get(neighborCity);
				
				if(visited[neighborIdx] == false) {
					q.offer(neighborCity);
					visited[neighborIdx] = true;
				}
				
			}
			
		}
		System.out.println();
		
	}
	
}
