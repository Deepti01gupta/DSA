package BootCamp;

import java.util.*;

public class bipartite {
	
	public class pair{
		int v;
		int d;
		pair(int v, int d){
			this.d=d;
			this.v=v;
		}
	}
	
	public boolean is_bipartite() {
		int[][] arr=new int[5][2];
		HashMap<Integer, Integer> vis=new HashMap<>();
		Queue<pair> q=new LinkedList<>();
		for(int i=0; i<arr.length; i++) {
			if(vis.containsKey(i)) {
				continue;
			}
			
			q.add(new pair(i,0));
			while(!q.isEmpty()) {
				pair rp=q.poll();
				
				if(vis.containsKey(rp.v)) {
					if(vis.get(rp.v)!=rp.d) { 
						return false;
					}
				}
				
				vis.put(rp.v,rp.d);
				
				for(int nbr:arr[rp.v]) {
					if(!vis.containsKey(nbr)) {
						q.add(new pair(nbr,rp.d+1));
					}
				}
			}
		}
		return true;
	}

}
