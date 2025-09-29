package lec44;

import java.util.*;

public class Intersection_of_Two_Arrays_II {

//	https://leetcode.com/problems/intersection-of-two-arrays-ii/
	public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> mp=new HashMap<>();
        for(int i:nums1) {
        	mp.put(i, mp.getOrDefault(i, 0)+1);
        }
        List<Integer> ll=new ArrayList<>();
        for(int i:nums2) {
        	if(mp.containsKey(i) && mp.get(i)>0) {
        		ll.add(i);
        		mp.put(i, mp.get(i)-1);
        	}
        }
        int[] ans=new int[ll.size()];
        for(int i=0; i<ll.size(); i++){
        	ans[i]=ll.get(i);
        }
        return ans;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
