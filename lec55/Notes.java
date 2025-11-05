package lec55;

public class Notes {

}




// SPANNING TREE:
// A spanning tree is a subset of graph G, which has all the vertices covered with minimum possible number of edges.
// Hence, a spanning tree does not have cycles and it cannot be disconnected.
// A connected graph G can have more than one spanning tree.
// Spanning tree has n-1 edges, where n is the number of Node(vertex).
// All possible spanning trees of graph G, have the same number of edges and vertices.
// The spanning tree does not have any cycle(loops).
// Removing one edge from the spanning tree will make the graph disconnected, i.e. the spanning tree is minimally connected.
// Adding one edge to the spanning tree will create a circuit or loop. i.e. the spanning tree is maximally.

// Minimum Spanning Tree (MST):
// In a weighted graph, a minimum spanning tree is a spanning tree that has minimum weight than all other spanning trees of the same graph.
// For MST 2 Algorithm is used , and both are greedy algorithm: 
// 1. Kruskal's Algorithm : DSU (Disjoint Set Union) is used
// 2. Prim's Algorithm : (e+v).log(e)



// Topological Sort
// Not a sprting algorithm
// Only used for DAG (Directed Acyclic Garph) 
// InDegree: number of incoming edges
// OutDegree: number of outgoin edges









