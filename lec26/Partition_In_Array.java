package lec26;

public class Partition_In_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {5,7,2,3,8,1,4};
		int k=arr.length-1;
		
		// agar koi or index pr data hoga to k hamara ye hoga
		// int temp=arr[arr.length-1];
//		arr[arr.length-1]=arr[k];
//		arr[k]=temp;
//		k=arr.length-1;
		
		int idx=partition(arr,0,k);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println(idx);
	}
	
	public static int partition(int[] arr, int si, int ei) {
		
		int item=arr[ei];
		int idx=si;
		for(int i=si; i<ei; i++) {
			if(arr[i]<item) {
				int temp=arr[i];
				arr[i]=arr[idx];
				arr[idx]=temp;
				idx++;
			}
		}
		int temp=arr[ei];
		arr[ei]=arr[idx];
		arr[idx]=temp;
		return idx;
	}
	
	

}
