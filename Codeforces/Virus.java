package Codeforces;

import java.util.*;

public class Virus {
	
//	https://codeforces.com/problemset/problem/1704/C

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			int m=sc.nextInt();
			
			long[] arr=new long[m];
			for(int i=0; i<m; i++) {
				arr[i]=sc.nextLong();
			}
			
			Arrays.sort(arr);
			
			List<Long> ll=new ArrayList<>();
			for(int i=0; i<m; i++) {
				long dif;
				if(i==m-1) {
					dif=n+arr[0]-arr[m-1]-1;
				}
				else {
					dif=arr[i+1]-arr[i]-1;
				}
				
				if(dif>0) {
					ll.add(dif);
				}
			}
			
			ll.sort(Collections.reverseOrder());
			
			int days=0;
			long save=0;
			for(long gap:ll) {
				long val=gap-2*days;
				
				if(val<=0) {
					continue;
				}
				
				if(val==1) {
					save+=1;
				}
				else {
					save+=val-1;
				}
				
				days+=2;
			}
			
			System.out.println(n-save);
		}
		sc.close();
	}

}
