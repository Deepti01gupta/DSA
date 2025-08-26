package lec22;

import java.util.*;
 
public class Coin_Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] coins= {2,3,8};
		int n=8;
		 List<List<Integer>> ll=new ArrayList<>();
		permutation(n,coins,ll,new ArrayList<>(),0);
		System.out.println(ll);
	}
	public static void permutation(int n, int[] coins, List<List<Integer>> ll, List<Integer> ans, int sum) {
		if(sum==n) {
			ll.add(new ArrayList<>(ans));
			return;
		}
		if(sum>n) {
			return;
		}
		
		for(int i=0; i<coins.length; i++) {
			ans.add(coins[i]);
			permutation(n,coins,ll,ans, sum+coins[i]);
			ans.remove(ans.size()-1);
		}
	}

}
