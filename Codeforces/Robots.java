package Codeforces;

import java.util.Scanner;

public class Robots {
	
//	https://codeforces.com/problemset/problem/1680/B

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			int m=sc.nextInt();
			sc.nextLine();

			
			char[][] arr=new char[n][m];
			
			int minRow=n;
            int minCol=m;
			
            for(int i=0; i<n; i++){
                String line=sc.nextLine();
                for(int j=0; j<m; j++){
                    arr[i][j]=line.charAt(j);

                    if(arr[i][j]=='R'){
                        minRow=Math.min(minRow, i);
                        minCol=Math.min(minCol, j);
                    }
                }
            }
            
            if (arr[minRow][minCol] == 'R') {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

		}
		sc.close();

	}

}
