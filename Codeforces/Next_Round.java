package Codeforces;

import java.util.*;

//https://codeforces.com/problemset/problem/158/A
public class Next_Round {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] arr=new int[n];
        int f=0;
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
            if(arr[i]!=0){
                f=1;
            }
        }
        if(f==0){
            System.out.println(0);
            sc.close();
            return;
        }
        int t=arr[k];
        int ans=0;
        for(int i=0; i<n; i++){
            if(arr[i]>=t){
                ans++;
            }
        }
        System.out.println(ans);
        sc.close();
    }
	
}
