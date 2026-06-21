package Codeforces;

import java.util.*;

public class Insomnia_cure {

//	https://codeforces.com/problemset/problem/148/A
	
	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			int k=sc.nextInt();
			int l=sc.nextInt();
			int m=sc.nextInt();
			int n=sc.nextInt();
			int d=sc.nextInt();
			
			boolean[] arr = new boolean[d + 1];
			Arrays.fill(arr, true);
			
			int i=1;
			while(i*k<=d) {
				arr[i*k]=false;
				i++;
			}
			
			i=1;
			while(i*l<=d) {
				arr[i*l]=false;
				i++;
			}
			
			i=1;
			while(i*m<=d) {
				arr[i*m]=false;
				i++;
			}
			
			i=1;
			while(i*n<=d) {
				arr[i*n]=false;
				i++;
			}
			
			int ans=0;
			for(i=1; i<=d; i++) {
				if(arr[i]==false) {
					ans++;
				}
			}
			
			sc.close();
			
			System.out.println(ans);
		}
	}

}
