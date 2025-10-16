package GRAPH;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Traversal_Graph {

	HashMap<Integer, HashMap<Integer, Integer>> map;

	public Traversal_Graph(int v) {
		map = new HashMap<>();
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());
		}
	}

	public void AddEdge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);
	}
	
	public void BFT() {
	    Queue<Integer> q = new LinkedList<>();
	    HashSet<Integer> visited = new HashSet<>();

	    // In case the graph is disconnected, we check every vertex
	    for (int key : map.keySet()) {
	        if (visited.contains(key)) {
	            continue;
	        }

	        // Start BFS from this vertex
	        q.add(key);

	        while (!q.isEmpty()) {
	            // 1. Remove front element
	            int rv = q.poll();

	            // 2. Skip if already visited
	            if (visited.contains(rv)) {
	                continue;
	            }

	            // 3. Mark as visited
	            visited.add(rv);

	            // 4. Self work (print or process)
	            System.out.print(rv + " ");

	            // 5. Add all unvisited neighbours to queue
	            for (int nbr : map.get(rv).keySet()) {
	                if (!visited.contains(nbr)) {
	                    q.add(nbr);
	                }
	            }
	        }
	    }
	}
	
	
	
	public void DFT() {
	    Stack<Integer> s = new Stack<>();
	    HashSet<Integer> visited = new HashSet<>();

	    for (int key : map.keySet()) {
	        if (visited.contains(key)) {
	            continue;
	        }

	        s.push(key);

	        while (!s.isEmpty()) {
	            // 1. remove
	            int rv = s.pop();

	            // 2. Ignore if Already Visited
	            if (visited.contains(rv)) {
	                continue;
	            }

	            // 3. add visited
	            visited.add(rv);

	            // 4. self Work
	            System.out.print(rv + " ");

	            // 5. Add unvisited neighbours
	            for (int nbrs : map.get(rv).keySet()) {
	                if (!visited.contains(nbrs)) {
	                    s.push(nbrs);
	                }
	            }
	        }
	    }
	}

	
}
