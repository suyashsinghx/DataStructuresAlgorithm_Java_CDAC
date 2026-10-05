package graphs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class MyGraph {
	
	int adj[][];
	int n;			//edges number of..
	Scanner sc = new Scanner(System.in);
	
	
	public MyGraph() {
		n = 10;
		adj = new int[n][n];
	}
	public MyGraph(int size) {
		n = size;
		adj = new int[n][n];
	}
	
	public void createGraph()
	{
		int i, orign, dest, maxEdge;
		
		maxEdge = n*(n-1);		//formula for number of edges..
		
		for(i=0; i<n; i++) {
			System.out.print("Enter Edges or (-1, -1) to exit: ");
			orign = sc.nextInt();
			dest = sc.nextInt();
			
			if(orign == -1 || dest == -1) {
				System.out.println("Exiting..");
				return;
			}
			
			if(orign < 0 || orign > maxEdge || dest < 0 || dest > maxEdge) {
				System.out.println("Invalid Edges..");
				return;
			}
			
			adj[orign][dest] = 1;
//			adj[dest][orign] = 1;		//only with un-directed graph case
			
		}
	}
	
	public void insertEdge() {
		int orign, dest, maxEdge;
		
		maxEdge = n*(n-1);		//formula for number of edges..
		
			System.out.print("Enter Edges or (-1, -1) to exit: ");
			orign = sc.nextInt();
			dest = sc.nextInt();
			
			
			if(orign < 0 || orign > maxEdge || dest < 0 || dest > maxEdge) {
				System.out.println("Invalid Edges..");
				return;
			}
			
			if(adj[orign][dest] == 0) {
				adj[orign][dest] = 1;
			}
			
			return;
	}
	
	public void deleteEdge() {
		int orign, dest, maxEdge;
		
		maxEdge = n*(n-1);		//formula for number of edges..
		
			System.out.print("Enter Edges: ");
			orign = sc.nextInt();
			dest = sc.nextInt();
			
			
			if(orign < 0 || orign > maxEdge || dest < 0 || dest > maxEdge) {
				System.out.println("Invalid Edges..");
				return;
			}
			
			if(adj[orign][dest] == 1) {
				adj[orign][dest] = 0;
			}
			
			return;
	}
	
	public void displayGraph() {
		
		if(n==0) {
			System.out.println("Graph is Empty..");
			return;
		}
		
		int row, col;
		
		System.out.print("\t");
		for(int i=0; i<n; i++) {
			System.out.print(i + "\t");
		}
		
		for(row=0; row<n; row++) {
			
			System.out.print(row + "\t");
			for(col=0; col<n; col++) {
				
				System.out.print(adj[row][col] + "\t");
				
			}
			
			System.out.println();
			
		}
		
	}
	
	public void depthFirstSearch() {
		
		//create visited array
		boolean []visited = new boolean[n];
		
		Stack<Integer> st = new Stack();
		
		int temp, i;
		
		st.push(0);
		
		while(!st.empty()) {
			
			temp = st.pop();
			
			if(visited[temp] == false) {
				System.out.println(temp);
				visited[temp] = true; 
			}
			
			for(i =0; i<n; i++) {
				
				if(adj[temp][i] == 1) {
					if(visited[i] == false) {
						st.push(i);
					}
				}
				
			}
		}
	}
	
	public void breadthFirstSearch() {
		
		boolean []visited = new boolean[n];
		
		Queue<Integer> q = new LinkedList<>();
		
		int temp, i;
		
		q.offer(0);
		
		while(!q.isEmpty()) {
			
			temp = q.poll();
			
			if(visited[temp] == false) {
				System.out.println(temp);
				visited[temp] = true;
			}
			
			for(i=0; i<n; i++) {
				
				if(adj[temp][i] == 1) {
					
					if(visited[i] == false) {
						q.offer(i);
					}
				}
				
			}
			
		}
		
	}
	
	
}
