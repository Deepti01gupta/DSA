package lec42;

public class Notes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


// 1. https://leetcode.com/problems/maximum-width-of-binary-tree/description/
// 2. https://leetcode.com/problems/serialize-and-deserialize-binary-tree/description/
// 3. https://leetcode.ca/all/285.html


//solution of question 3 because it is of premium part :

//class Solution {
//	TreeNode successor_node=null;
//    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
//        return successor(root,p);   
//    }
//    
//    public TreeNode successor(TreeNode root, TreeNode p) {
//    	if(root==null) {
//    		return null;
//    	}
//    	
//    	if(root.val>p.val) {
//    		successor_node=root;
//    		successor(root.left,p);
//    	}
//    	else {
//    		successor(root.right,p);
//    	}
//    	return successor_node;
//    }
//}