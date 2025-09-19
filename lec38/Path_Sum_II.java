package lec38;

import java.util.*;

public class Path_Sum_II {
	
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

//	https://leetcode.com/problems/path-sum-ii/description/
	public List<List<Integer>> hasPathSum(TreeNode root, int targetSum) {
		List<List<Integer>> ll=new ArrayList<>();
		if(root==null) {
			return ll;
		}
		pathSum(root, targetSum, new ArrayList<>(), ll);
		return ll;
		
	}
	
	public void pathSum(TreeNode root, int target,List<Integer> path, List<List<Integer>> ll) {
		if(root==null) {
			return;
		}
		path.add(root.val);
		
		if(root.left==null && root.right==null && target==root.val) {
			ll.add(new ArrayList<>(path));
		}
		else {
			pathSum(root.left, target-root.val, path,ll);
			pathSum(root.right, target-root.val, path,ll);
		}
		path.remove(path.size()-1);
	}
	
	
}
