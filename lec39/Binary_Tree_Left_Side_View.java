package lec39;

import java.util.ArrayList;
import java.util.List;


public class Binary_Tree_Left_Side_View {
	
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
	
	public List<Integer> leftSideView(TreeNode root){
		List<Integer> ll=new ArrayList<>();
		leftview(root, 1, ll);
		return ll;
	}
	
	int max_depth=0;
	
	public void leftview(TreeNode root, int cur_level, List<Integer> ll) {
		if(root==null) {
			return;
		}
		if(max_depth<cur_level) {
			ll.add(root.val);
			max_depth=cur_level;
		}
		leftview(root.left,cur_level+1,ll);
		leftview(root.right,cur_level+1,ll);
	}
}
