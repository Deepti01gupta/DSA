package lec4;
import java.util.*;
public class general_conversion {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int mul=1;
        int sb=sc.nextInt();
        int db=sc.nextInt();
        while(n>0){
            int rem=n%db;
            sum=sum+rem*mul;
            n=n/db;
            mul=mul*sb;
        }
        System.out.println(sum);
	}
}