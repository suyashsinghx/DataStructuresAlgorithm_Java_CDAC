package graphs.userDefinedGraph;

public class UserOfCityGraph {

	public static void main(String[] args) {
		CityGraph c = new CityGraph(5);
		
		c.addCity("Mumbai");
		c.addCity("Pune");
		c.addCity("Bangalore");
		c.addCity("Indore");
		c.addCity("Bhopal");
		
		c.addEdge("Mumbai", "Bhopal", 1900);
		c.addEdge("Pune", "Indore", 1700);
		c.addEdge("Bhopal", "Bangalore", 1300);
		c.addEdge("Indore", "Mumbai", 2200);
		c.addEdge("Bhopal", "Pune", 780);
		c.addEdge("Bhopal", "Mumbai", 2500);
		
		
		c.display();
		
		System.out.println("\n---------------\n");
		
		c.displayNeighbors("Bhopal");
		
		System.out.println("\n---------------\n");
		
		c.DFS();
		
		System.out.println("\n---------------\n");
		
		c.BFS();
		
		
	}
	
}
