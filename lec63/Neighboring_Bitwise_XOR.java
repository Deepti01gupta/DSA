package lec63;
import java.util.*;

public class Neighboring_Bitwise_XOR {

//	https://leetcode.com/problems/neighboring-bitwise-xor/description/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		
		boolean ans=doesValidArrayExist(arr);
		
		System.out.println(ans);
		sc.close();

	}
	
	public static boolean doesValidArrayExist(int[] derived) {
        int xor=0;
        for(int i:derived){
            xor^=i;
        }
        return xor==0;
    }

}
