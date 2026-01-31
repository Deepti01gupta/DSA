package lec58;
import java.util.*;

public class Longest_Cycle_in_a_Graph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] edges= {3,3,4,2,3};
		int ans=longestCycle(edges);
		System.out.println(ans);

	}
	
	// https://leetcode.com/problems/longest-cycle-in-a-graph/
	public static int longestCycle(int[] edges) {
        int[] in=new int[edges.length];
	    for(int i=0; i<edges.length; i++) {
	       	in[edges[i]]++;
	    }
	        
	    Queue<Integer> q=new LinkedList<>();
	    for(int i=0; i<in.length; i++) {
	    	if(in[i]==0) {
	      		q.add(i);
	       	}
	    }
	    
	    boolean[] vis=new boolean[edges.length];
	    while(!q.isEmpty()) {
	    	
	    	int e=q.poll();
	  
	    	vis[e]=true;
	    	
	    	in[edges[e]]--;
	    	
	    	if(in[edges[e]]==0) {
	    		q.add(edges[e]);
	    	}
	    }
	    int ans=-1;
	    for(int i=0; i<vis.length; i++) {
	    	if(vis[i]==false) {
	    		int c=1;
	    		int nbrs=edges[i];
	    		while(nbrs!=i) {
	    			c++;
	    			vis[nbrs]=true;
	    			nbrs=edges[nbrs];
	    		}
	    		ans=Math.max(ans, c);
	    	}
	    }
	    return ans;
	}

}
