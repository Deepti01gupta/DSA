package lec22;

public class Queen_Combination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		int q=2;
		boolean[] visited=new boolean[n];
		combination(n,q,visited,"",0,0);
	}
	
	// qpsf = queen placed so far
	public static void combination(int n, int q, boolean[] visited, String ans, int qpsf, int idx) {
		if(qpsf==q) {
			System.out.println(ans);
			return;
		}
		
		for(int i=idx; i<n; i++) {
			if(visited[i]==false) {
				visited[i]=true;
				combination(n,q,visited,ans+"b"+i+"q"+qpsf,qpsf+1,i+1);
				visited[i]=false;
	 		}
			
		}
	}
}
