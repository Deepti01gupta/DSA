package BootCamp;

import java.util.*;

public class bfs {
	
	public void bfs_tra(int n) {
		Map<Integer, ArrayList<Integer>> map=new HashMap<>();
		Queue<Integer> q=new LinkedList<>();
		Set<Integer> vis=new HashSet<>();
		q.add(0);
		while(!q.isEmpty()) {
			int rv=q.poll();
			
			if(vis.contains(rv)) {
				continue;
			}
			
			vis.add(rv);
			
			for(int i:map.get(rv)) {
				if(!vis.contains(i)) {
					q.add(i);
				}
			}
			
		}
	}

}
