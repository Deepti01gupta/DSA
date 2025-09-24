package lec52;

import java.util.*;

public class GraphClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph g = new Graph(7);
		g.AddEdge(1, 4, 2);
		g.AddEdge(1, 2, 5);
		g.AddEdge(3, 2, 7);
		g.AddEdge(3, 4, -1);
		g.AddEdge(5, 4, 3);
		g.AddEdge(5, 6, 7);
		g.AddEdge(5, 7, 8);
		g.AddEdge(7, 6, 4);
		
		g.Display();
		System.out.println(g.HasPath(1, 6, new HashSet<>()));
		
		g.printPath(1, 6, new HashSet<>(), "");
		
		
//		g.display();
////		System.out.println("****************");
////		g.removevertex(4);
////		g.display();
//		System.out.println(g.haspath(1, 6, new HashSet<>()));
//		g.PrintAllPath(1, 6, new HashSet<>(), "");
//		System.out.println(g.BFS(1, 6));
//		System.out.println(g.DFS(1, 6));
		
	}

}
