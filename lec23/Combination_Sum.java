package lec23;

import java.util.ArrayList;
import java.util.List;

public class Combination_Sum {

//	https://leetcode.com/problems/combination-sum/description/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] coins= {2,3,5};
		int n=8;
		List<List<Integer>> ll=new ArrayList<>();
		permutation(n,coins,ll,new ArrayList<>(),0,0);
		System.out.println(ll);
	}
	
	public static void permutation(int n, int[] coins, List<List<Integer>> ll, List<Integer> ans, int sum, int idx) {
		if(sum==n) {
			ll.add(new ArrayList<>(ans));
			return;
		}
		if(sum>n) {
			return;
		}
		
		for(int i=idx; i<coins.length; i++) {
			if(sum+coins[i]<=n) {
				ans.add(coins[i]);
				permutation(n,coins,ll,ans, sum+coins[i],i);
				ans.remove(ans.size()-1);
			}
		}
	}

}
