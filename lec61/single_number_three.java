package lec61;

public class single_number_three {

//	https://leetcode.com/problems/single-number-iii/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,1,3,2,5};
		int[] ans=single_number(arr);
		System.out.println(ans[0]+" "+ans[1]);

	}
	
	private static int[] single_number(int[] arr) {
		int xor=0;
		for(int i=0; i<arr.length; i++) {
			xor=xor^arr[i];
		}
		
		int mask=(xor & (-1*xor));  // (xor & (~(xor-1))
		int a=0;
		for(int i=0; i<arr.length; i++) {
			if((mask & arr[i]) !=0) {
				a=a^arr[i];
			}
		}
		int b=xor^a;
		return new int[] {a,b};
	}

}
