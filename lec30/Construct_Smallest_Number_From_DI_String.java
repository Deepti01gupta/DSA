package lec30;

import java.util.*;

public class Construct_Smallest_Number_From_DI_String {

//	https://leetcode.com/problems/construct-smallest-number-from-di-string/description/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pattern = "IIIDIDDD";
		System.out.println(smallestNumber(pattern));
	}
	public static String smallestNumber(String pattern) {
        if(pattern.length()>9){
            return "";
        }
        int[] arr=new int[pattern.length()+1];
        
        Stack<Integer> st=new Stack<>();
        int c=1;
        for(int i=0; i<=pattern.length(); i++){
            if(i==pattern.length() || pattern.charAt(i)=='I'){
                arr[i]=c;
                c++;
                while(!st.isEmpty()){
                    int x=st.pop();
                    arr[x]=c;
                    c++;
                }
            }
            else{
                st.push(i);
            }
        }

        String ans="";
        for(int i=0; i<arr.length; i++){
            ans+=arr[i];
        }
        return ans;


    }

}
