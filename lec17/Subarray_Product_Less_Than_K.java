package lec17;

public class Subarray_Product_Less_Than_K {

//	https://leetcode.com/problems/subarray-product-less-than-k/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,5,2,6};
		int k=100;
		System.out.println(numSubarrayProductLessThanK(arr,k));
	}
	
	public static int numSubarrayProductLessThanK(int[] arr, int k) {
		int ans=0;
		int p=1, si=0;
		for(int ei=0; ei<arr.length; ei++) {
			
			//grow
			p=p*arr[ei];
			
			// shrink
			while(p>=k && si<=ei) {
				p=p/arr[si];
				si++;
			}
			
			// calculate
			ans+=(ei-si+1);
		}
		return ans;
	}

}
