package lec40;


public class Insert_into_a_Binary_Search_Tree {

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
	
//	https://leetcode.com/problems/insert-into-a-binary-search-tree/description/
	public TreeNode insertIntoBST(TreeNode root, int val) {
		if(root==null) {
			return new TreeNode(val);
		}
		if(val<root.val) {
			root.left=insertIntoBST(root.left,val);
		}
		else {
			root.right=insertIntoBST(root.right,val);
		}
		return root;
	}
}
