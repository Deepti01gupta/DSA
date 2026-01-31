package Codeforces;

import java.util.Scanner;

public class Number_of_Ways {
	
//	https://codeforces.com/problemset/problem/466/C

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long[] arr=new long[n];
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextLong();
		}
		
		long ans=fun(arr,n);
		System.out.println(ans);
		sc.close();

	}
	
	public static long fun(long[] arr, int n) {
		long total=0;
		for(long i:arr) {
			total+=i;
		}
		if(total%3!=0) {
			return 0;
		}
		
		long target=total/3;
		
		long c=0;
		long ans=0;
		long sum=0;
		
		for(int i=0; i<n-1; i++) {
			sum+=arr[i];
			
			if(sum==2*target) {
				ans+=c;
			}
			
			if(sum==target) {
				c++;
			}
		}
		
		return ans;
	}

}
