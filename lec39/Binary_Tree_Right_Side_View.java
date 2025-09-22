package lec39;

import java.util.*;

public class Binary_Tree_Right_Side_View {
	
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
	
//	https://leetcode.com/problems/binary-tree-right-side-view/
	public List<Integer> rightSideView(TreeNode root){
		List<Integer> ll=new ArrayList<>();
		rightview(root, 1, ll);
		return ll;
	}
	
	int max_depth=0;
	
	public void rightview(TreeNode root, int cur_level, List<Integer> ll) {
		if(root==null) {
			return;
		}
		if(max_depth<cur_level) {
			ll.add(root.val);
			max_depth=cur_level;
		}
		rightview(root.right,cur_level+1,ll);
		rightview(root.left,cur_level+1,ll);
	}
	
}
