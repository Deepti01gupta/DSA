package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class The_New_Year_Meeting_Friends {

//	https://codeforces.com/problemset/problem/723/A
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int[] a=new int[3];

        a[0]=sc.nextInt();
        a[1]=sc.nextInt();
        a[2]=sc.nextInt();

        Arrays.sort(a);

        System.out.println(a[2]-a[0]);

        sc.close();
	}

}
