package lec22;

public class Queen_Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		int q=2;
		boolean[] visited=new boolean[n];
		permutation(n,q,visited,"",0);
	}
	
	// qpsf = queen placed so far
	public static void permutation(int n, int q, boolean[] visited, String ans, int qpsf) {
		if(qpsf==q) {
			System.out.println(ans);
			return;
		}
		
		for(int i=0; i<n; i++) {
			if(visited[i]==false) {
				visited[i]=true;
				permutation(n,q,visited,ans+"b"+i+"q"+qpsf,qpsf+1);
				visited[i]=false;
	 		}
			
		}
	}
}
