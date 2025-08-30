package lec26;

public class Merge_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {7,5,1,4,3};
		int[] ans=sort(arr,0,arr.length-1);
		for(int i=0; i<ans.length; i++) {
			System.out.print(ans[i]+" ");
		}
	}
	
	// TC: O(N *log N) 
	public static int[] sort(int[] arr, int si, int ei) {
		if(si==ei) {
			int[] bs=new int[1];
			bs[0]=arr[si];
			return bs;
		}
		
		int mid=(si+ei)/2;
		int[] fa=sort(arr,si,mid);
		int[] sa=sort(arr,mid+1,ei);
		return merge(fa,sa);
	}
	
	public static int[] merge(int[] arr1, int[] arr2) {
		int i=0;
		int j=0;
		int[] ans=new int[arr1.length+arr2.length];
		int k=0;
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i]<arr2[j]) {
				ans[k]=arr1[i];
				i++;
				k++;
			}
			else {
				ans[k]=arr2[j];
				j++;
				k++;
			}
		}
		while(i<arr1.length) {
			ans[k]=arr1[i];
			i++;
			k++;
		}
		while(j<arr2.length) {
			ans[k]=arr2[j];
			j++;
			k++;
		}
		return ans;
	}

}
