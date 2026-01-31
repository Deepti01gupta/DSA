package Codeforces;

import java.util.*;

//https://codeforces.com/problemset/problem/71/A
public class Way_Too_Long_Words {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String s=sc.next();
            if(s.length()<=10){
                System.out.println(s);
            }
            else{
                StringBuilder sb=new StringBuilder();
                sb.append(s.charAt(0));
                sb.append(s.length()-2);
                sb.append(s.charAt(s.length()-1));
                System.out.println(sb.toString());
            }
        }
        sc.close();
        
    }
	
}
