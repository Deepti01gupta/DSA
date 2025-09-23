package lec40;


public class Delete_Node_in_a_BST {
	
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
	
//	https://leetcode.com/problems/delete-node-in-a-bst/description/
	public TreeNode deleteNode(TreeNode root, int key) {
		
		if(root.val<key) {
			root.right=deleteNode(root.right,key);
		}
		else if(root.val>key) {
			root.left=deleteNode(root.left,key);
		}
		else {
			
			// 0 child
			// 1 child
			if(root.left==null) {
				return root.right;
			}
			else if(root.right==null) {
				return root.left;
			}
			// 2 child
			else {
				int min=find_min(root);
				root.right=deleteNode(root.right,min);
				root.val=min;
			}
		}
		return root;
	}
	
	public int find_min(TreeNode root) {
		if(root==null) {
			return Integer.MAX_VALUE;
		}
		int l=find_min(root.left);
		return Math.min(l, root.val);
	}
}
