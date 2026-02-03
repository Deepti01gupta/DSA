package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Maximum_Sum {
	
//	https://codeforces.com/problemset/problem/1832/B

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			int k=sc.nextInt();
			
			long[] arr=new long[n];
			for(int i=0; i<n; i++) {
				arr[i]=sc.nextLong();
			}
			
			Arrays.sort(arr);
			
			long[] pref = new long[n + 1];
            for (int i = 0; i < n; i++) {
                pref[i + 1] = pref[i] + arr[i];
            }

            long ans = 0;

            for (int x = 0; x <= k; x++) {
                int left = 2 * x;
                int right = n - (k - x);
                if (left >= right) continue;

                long sum = pref[right] - pref[left];
                ans = Math.max(ans, sum);
            }
            
            System.out.println(ans);
			
//			int i=0;
//			int j=n-1;
//			
//			while(k>0 && i<j) {
//				if(i+1<j && arr[i]+arr[i+1]<=arr[j]) {
//					i+=2;
//				}
//				else {
//					j--;
//				}
//				k--;
//			}
//			
//			long sum=0;
//			for(int x=i; x<=j; x++) {
//				sum+=arr[x];
//			}
//			
//			System.out.println(sum);
		}
		sc.close();

	}

}
