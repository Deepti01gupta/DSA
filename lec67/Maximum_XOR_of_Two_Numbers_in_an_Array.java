package lec67;

public class Maximum_XOR_of_Two_Numbers_in_an_Array {
	
	static class Trie{
		class Node{
			Node zero;
			Node one;
			
		}
		
		private Node root=new Node();
		
		public void add(int val) {
			Node cur=root;
			
			for(int i=31; i>=0; i--) {
				int bit=val & (1<<i);
				if(bit==0) {
					if(cur.zero!=null) {
						cur=cur.zero;
					}
					else {
						Node nn=new Node();
						cur.zero=nn;
						cur=nn;
					}
				}
				else {
					if(cur.one!=null) {
						cur=cur.one;
					}
					else {
						Node nn=new Node();
						cur.one=nn;
						cur=nn;
					}
				}
			}
		}
		
		public int getMaxXor(int x) {
			int ans=0;
			Node cur=root;
			for(int i=31; i>=0; i--) {
				int bit=x & (i<<i);
				if(bit==0) {
					if(cur.one!=null) {
						ans=ans | (1<<i);
						cur=cur.one;
					}
					else {
						cur=cur.zero;
					}
				}
				else {
					if(cur.zero!=null) {
						ans=ans | (1<<i);
						cur=cur.zero;
					}
					else {
						cur=cur.one;
					}
				}
			}
			return ans;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {3,10,5,25,2,8};
		Trie t=new Trie();
		for(int x:arr) {
			t.add(x);
		}
		
		int ans=0;
		for(int x:arr) {
			ans=Math.max(ans, t.getMaxXor(x));
		}
		System.out.println(ans);
		

	}

}
