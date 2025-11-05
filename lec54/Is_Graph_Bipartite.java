package lec54;

import java.util.*;

public class Is_Graph_Bipartite {

	
//	https://leetcode.com/problems/is-graph-bipartite/
	class BipartitePair{
        int vtx;
        int dis;
        public BipartitePair(int vtx, int dis){
            this.vtx=vtx;
            this.dis=dis;
        }
    }

    public boolean isBipartite(int[][] graph) {
        Queue<BipartitePair> q=new LinkedList<>();
        Map<Integer, Integer> vis=new HashMap<>();
        for(int i=0; i<graph.length; i++){  // vtx
            if(vis.containsKey(i)){
                continue;
            }
            q.add(new BipartitePair(i,0));
            while(!q.isEmpty()){
                // 1. remove
                BipartitePair rp=q.poll();

                // 2. ignore if already visited
                if(vis.containsKey(rp.vtx)){
                    if(vis.get(rp.vtx)!=rp.dis){
                        return false;
                    }
                    continue;
                }

                // 3. marked visited
                vis.put(rp.vtx, rp.dis);

                // 4. self worl
                // 5. add unvisited nbrs
                for(int nbrs:graph[rp.vtx]){
                    if(!vis.containsKey(nbrs)){
                        q.add(new BipartitePair(nbrs,rp.dis+1));
                    }
                }
            }
        }
        return true;
    }
}
