package lec17;

public class Maximum_Sub_Array_Sum_of_Size_k {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,1,3,4,5,6,7,8,9,4,5};
		int k=3;
		System.out.println(find_subarray(arr,k));
	}
	
	public static int find_subarray(int[] arr, int k) {
		int sum=0;
		for(int i=0; i<k; i++) {
			sum+=arr[i];
		}
		int ans=sum;
		for(int i=k; i<arr.length; i++) {
			sum=sum+arr[i]-arr[i-k];
			ans=Math.max(ans, sum);
		}
		return ans;
	}
	
}
