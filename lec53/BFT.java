package lec53;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class BFT {
    private HashMap<Integer, HashMap<Integer,Integer>> map;
    public  BFT(int v){
        map=new HashMap<>();
        for (int i=1;i<=v;i++){
            map.put(i,new HashMap<>());
        }
    }
    public void AddEdge(int v1,int v2,int cost){
        map.get(v1).put(v2,cost);
        map.get(v2).put(v1,cost);
    }
    public void bft(){
        Queue<Integer> q=new LinkedList<>();
        HashSet<Integer> visited=new HashSet<>();
       for (int src:map.keySet()){
           if(visited.contains(src)){
               continue;
           }
           q.add(src);
           while(!q.isEmpty()){
//            1 remove
               int r=q.poll();
//            2 ignore if already visited
               if(visited.contains(r)){
                   continue;
               }
//            3 marked visited
               visited.add(r);
//            4 self work
               System.out.print(r+" ");
//            5 add unvisited nbrs
               for (int nbrs:map.get(r).keySet()){
                   if(!visited.contains(nbrs)){
                       q.add(nbrs);
                   }
               }
           }
       }
    }
}