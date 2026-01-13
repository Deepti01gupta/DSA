package lec59;
import java.util.*;

// https://codeforces.com/problemset/problem/1242/B
public class MST_0_1 {
	
	static HashMap<Integer, HashSet<Integer>> map;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		map=new HashMap<>();
		int n=sc.nextInt();
		int m=sc.nextInt();
		for(int i=1; i<=n; i++) {
			map.put(i, new HashSet<>());
		}
		
		for(int i=1; i<=m; i++) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			map.get(a).add(b);
			map.get(b).add(a);
			
		}
		int ans=prims();
		System.out.println(ans);
		
		sc.close();

	}
	
	static class Pair{
		int vtx;
		int cost;
		public Pair(int vtx, int cost) {
			this.cost=cost;
			this.vtx=vtx;
		}
	}
	 
	public static int prims() {
		PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)-> a.cost-b.cost);
		pq.add(new Pair(1,0));
		HashSet<Integer> vis=new HashSet<>();
		int sum=0;
		
		while(!pq.isEmpty()) {
			// 1. remove
			Pair rp=pq.poll();
			
			// 2.ignore if visited
			if(vis.contains(rp.vtx)) {
				continue;
			}
			
			// 3. marked visited
			vis.add(rp.vtx);
			
			// 4. self work
			sum+=rp.cost;
			
			// 5. add nbrs
			for(int nbrs=1; nbrs<=map.size(); nbrs++) {
				if(!vis.contains(nbrs)) {
					int cost=0;
					if(map.get(rp.vtx).contains(nbrs)) {
						cost++;
					}
					pq.add(new Pair(nbrs,cost));
				}
			}
		}
		
		return sum;
		
		
		
	}

}
