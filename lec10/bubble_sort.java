package lec10;

import java.util.Scanner;

public class bubble_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);;
		int n=sc.nextInt();
		int[] nums=new int[n];
		for(int i=0; i<n; i++) {
			nums[i]=sc.nextInt();
		}
		bubblesort(nums);
		for(int i=0; i<n; i++) {
			System.out.print(nums[i]+" ");
		}
		sc.close();
	} 
	
	// bade data ko ek ek krke peeche kar dete hai isme
	// O(N^2)
	public static void bubblesort(int[] arr) {
		for(int turn=1; turn<arr.length; turn++) {
			for(int i=0; i<arr.length-turn;i++) {
				if(arr[i]>arr[i+1]) {
					int temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
			}
		}
	}

}
