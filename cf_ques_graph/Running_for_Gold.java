package cf_ques_graph;

import java.util.*;

public class Running_for_Gold {
	
	// https://codeforces.com/group/ibNhxWfOek/contest/341358/problem/B

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n=sc.nextInt();
            int[][] arr=new int[n][5];
            Stack<Integer> st=new Stack<>();
            
            for(int i=0; i<n; i++){
                for(int j=0; j<5; j++){
                    arr[i][j]=sc.nextInt();
                }
                st.push(i);
            }
            if(n==1){
                System.out.println(1);
                continue;
            }
            
            
            while(st.size()>1){
                int a=st.pop();
                int b=st.pop();
                
                int c1=0, c2=0;
                for(int i=0; i<5; i++){
                    if(arr[a][i]<arr[b][i]){
                        c1++;
                    }
                    else if(arr[a][i]>arr[b][i]){
                        c2++;
                    }
                }
                
                if(c1>=3){
                    st.push(a);
                }
                else{
                    st.push(b);
                }
            }
            int ele=st.pop();
            boolean flag=true;
            for(int i=0; i<n; i++){
                if(i==ele){
                    continue;
                }
                int c=0;
                for(int j=0; j<5; j++){
                    if(arr[ele][j]<arr[i][j]){
                        c++;
                    }
                }
                if(c<3){
                    flag=false;
                    break;
                }
            }
            if(flag){
                System.out.println(ele+1);
            }
            else{
                System.out.println(-1);
            }
            sc.close();
        }
    }
}
