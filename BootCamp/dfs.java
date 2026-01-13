package BootCamp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class dfs {
	
	public void dfs_tra(int n) {
		Map<Integer, ArrayList<Integer>> map=new HashMap<>();
		Stack<Integer> st=new Stack<>();
		Set<Integer> vis=new HashSet<>();
		st.push(0);
		while(!st.isEmpty()) {
			int rv=st.pop();
			
			if(vis.contains(rv)) {
				continue;
			}
			
			vis.add(rv);
			
			for(int i:map.get(rv)) {
				if(!vis.contains(i)) {
					st.push(i);
				}
			}
			
		}
	}

}
