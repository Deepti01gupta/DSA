package lec63;
import java.util.*;

public class Bitwise_XOR_of_All_Pairings {

//	https://leetcode.com/problems/bitwise-xor-of-all-pairings/description/
	
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
		
		int ans=xorAllNums(arr1, arr2);
		
		System.out.println(ans);
		sc.close();

	}
	
	public static int xorAllNums(int[] nums1, int[] nums2) {
		int n=nums1.length;
        int m=nums2.length;

        int ans=0;
        if(n%2==0 && m%2==0){
            ans=0;
        }
        else if(n%2!=0 && m%2!=0){
            for(int i:nums1){
                ans^=i;
            }
            for(int i:nums2){
                ans^=i;
            }
        }
        else if(n%2==0){
            for(int i:nums1){
                ans^=i;
            }
        }
        else if(m%2==0){
            for(int i:nums2){
                ans^=i;
            }
        }
        return ans;
    }

}
