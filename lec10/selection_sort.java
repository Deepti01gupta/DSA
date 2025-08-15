package lec10;

import java.util.Scanner;

public class selection_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);;
		int n=sc.nextInt();
		int[] nums=new int[n];
		for(int i=0; i<n; i++) {
			nums[i]=sc.nextInt();
		}
		selectionsort(nums);
		for(int i=0; i<n; i++) {
			System.out.print(nums[i]+" ");
		}
		sc.close();
	}
	
	// sabse minimum dhundenge ko usko aage krte jayenge
	// O(N^2)
	public static void selectionsort(int[] nums) {
		for(int i=0; i<nums.length; i++) {
			int idx=minidx(nums,i);
			int temp=nums[i];
			nums[i]=nums[idx];
			nums[idx]=temp;
		}
	}
	public static int minidx(int[] nums, int i) {
		int min=i;
		for(int j=i+1; j<nums.length; j++) {
			if(nums[j]<nums[min]) {
				min=j;
			}
		}
		return min;
	}

}
