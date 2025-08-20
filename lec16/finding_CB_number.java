package lec16;

public class finding_CB_number {

//	https://codeskiller.codingblocks.com/problems/165
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="81615";
		System.out.println(cb_number(str));
	}
	
	public static int cb_number(String str) {
		int ans=0;
		boolean[] visited=new boolean[str.length()];
		for(int len=1; len<=str.length(); len++) {
			for(int j=len; j<=str.length(); j++) {
				int i=j-len;
				String s=str.substring(i,j);
				if(is_cb_number(Long.parseLong(s))==true && is_visited(visited,i,j)==true) {
					ans++;
					for(int x=i; x<j;x++) {
						visited[x]=true;
					}
				}
			}
		}
		return ans;
	}
	
	public static boolean is_visited(boolean[] visited, int i, int j) {
		for(int x=i; x<j; x++) {
			if(visited[x]==true) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean is_cb_number(long num) {
		if(num==0 || num==1) {
			return false;
		}
		
		int[] arr= {2,3,5,7,11,13,17,19,23,29};
		for(int i:arr) {
			if(num==i){
				return true;
			}
		}
		
		for(int i:arr) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
	
	

}
