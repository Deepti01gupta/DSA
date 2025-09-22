package lec39;


public class Diameter_Of_Binary_Tree {
	
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode() {}
		TreeNode(int val) { this.val = val; }
		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
            this.left = left;
            this.right = right;
		 }
	}
	
//	https://leetcode.com/problems/diameter-of-binary-tree/
	public int diameterOfBinaryTree(TreeNode root) {
//		 return diameter(root);
		
		return diameter2(root).dia;
	}
	
	class DiaPair{
		int dia=0;
		int ht=-1;
	}
	
	
	public DiaPair diameter2(TreeNode root) {
		if(root==null) {
			return new DiaPair();
		}
		DiaPair ldp=diameter2(root.left);
		DiaPair rdp=diameter2(root.right);
		DiaPair sdp=new DiaPair();
		sdp.ht=Math.max(ldp.ht,rdp.ht)+1;
		int sd=ldp.ht+rdp.ht+2;
		sdp.dia=Math.max(sd,Math.max(ldp.dia, rdp.dia));
		return sdp;
	}
	
	 
	
	// O(N^2)
	public int diameter(TreeNode root) {
		if(root==null) {
			return 0;
		}
		
		int ld=diameter(root.left);
		int rd=diameter(root.right);
		int sd=ht(root.left) + ht(root.right) +2;
		return Math.max(ld, Math.max(rd, sd));
	}
	
	public int ht(TreeNode root) {
		if(root==null) {
			return -1;
		}
		int lh=ht(root.left);
		int rh=ht(root.right);
		return Math.max(lh, rh)+1;
	}
}
