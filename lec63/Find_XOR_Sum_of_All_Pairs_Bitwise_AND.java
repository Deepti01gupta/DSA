package lec63;

import java.util.*;

public class Find_XOR_Sum_of_All_Pairs_Bitwise_AND {
	
//	https://leetcode.com/problems/find-xor-sum-of-all-pairs-bitwise-and/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr1=new int[n];
		for(int i=0; i<n; i++) {
			arr1[i]=sc.nextInt();
		}
		
		int m=sc.nextInt();
		int[] arr2=new int[n];
		for(int i=0; i<m; i++) {
			arr2[i]=sc.nextInt();
		}
		
		int ans=getXORSum(arr1, arr2);
		
		System.out.println(ans);
		sc.close();

	}
	
	public static int getXORSum(int[] arr1, int[] arr2) {
        int xor1=0;
        for(int i:arr1) {
        	xor1^=i;
        }
        
        int xor2=0;
        for(int i:arr2) {
        	xor2^=i;
        }
        
        return xor1 & xor2;
    }

}
