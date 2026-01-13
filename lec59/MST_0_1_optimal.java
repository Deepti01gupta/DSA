//package lec59;
//import java.util.*;

//https://codeforces.com/problemset/problem/1242/B
//public class MST_0_1_optimal {
//
//	static TreeSet<Integer>[] map;
//	static HashSet<Integer> set;
//
//	@SuppressWarnings("unchecked")
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		int m=sc.nextInt();
//		
//		map = new TreeSet[n+1];
//		set=new HashSet<>();
//		
//		
//		for(int i=1; i<=n; i++) {
//			map[i]=new TreeSet<>();
//			set.add(i);
//		}
//		
//		for(int i=1; i<=m; i++) {
//			int a=sc.nextInt();
//			int b=sc.nextInt();
//			map[a].add(b);
//			map[b].add(a);
//		}
//		int ans=0;
//		for(int i=1; i<=n; i++) {
//			if(set.remove(i)) {
//				ans++;
//				// dfs
//				dfs(i);
//			}
//		}
//		System.out.println(ans-1);
//		
//		sc.close();
//
//	}
//	
//	public static void dfs(int i) {
//		Stack<Integer> st=new Stack<>();
//		for(int x:set) {
//			if(!map[i].contains(x)) {
//				st.push(x);
//			}
//		}
//		
//		while(!st.isEmpty()) {
//			int s=st.pop();
//			if(!set.contains(s)) {
//				continue;
//			}
//			set.remove(s);
//			for(int x:set) {
//				if(!map[s].contains(x)) {
//					st.push(x);
//				}
//			}
//		}
//	}
//}
 

package lec59;

import java.util.*;

//https://codeforces.com/problemset/problem/1242/B
public class MST_0_1_optimal {

	static TreeSet<Integer>[] arr;
	static TreeSet<Integer> set;

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		arr = new TreeSet[n];
		for (int i = 0; i < n; i++) {
			arr[i] = new TreeSet<>();
		}
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			arr[a].add(b);
			arr[b].add(a);
		}
		set = new TreeSet<>();
//		for (HashSet<Integer> a : arr) {
//			System.out.print(a + " ");
//		}
		for (int i = 0; i < n; i++) {
			set.add(i);
		}
		int ans = 0;
		for (int i = 0; i < n; i++) {
			if (set.remove(i)) {
				ans++;
				dfs(i);
			}
		}
		System.out.println(ans - 1);
		sc.close();

	}

	public static void dfs(int x) {
		List<Integer> ll = new ArrayList<Integer>();
		for (int i : set) {
			if (!arr[x].contains(i)) {
				ll.add(i);
			}
		}

		for (int i : ll) {
			set.remove(i);
		}
		for (int i : ll) {
			dfs(i);
		}

	}

}
