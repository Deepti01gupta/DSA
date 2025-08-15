package lec10;

import java.util.Scanner;

public class Insertion_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);;
		int n=sc.nextInt();
		int[] nums=new int[n];
		for(int i=0; i<n; i++) {
			nums[i]=sc.nextInt();
		}
		insertionsort(nums);
		for(int i=0; i<n; i++) {
			System.out.print(nums[i]+" ");
		}
		sc.close();
	}
	
	// ek range leke last elemet ko sahi position pr set krte hai
	// O(N^2)
	public static void insertionsort(int[] nums) {
		for(int i=1; i<nums.length; i++) {
			insert_last_element(nums,i);
		}
	}
	public static void insert_last_element(int[] nums, int i) {
		int item=nums[i];
		int j=i-1;
		while(j>=0 && nums[j]>item) {
			nums[j+1]=nums[j];
			j--;
		}
		nums[j+1]=item;
	}

}
