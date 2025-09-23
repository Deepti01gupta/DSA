package lec40;

public class Binary_Search_Tree {
	
	class Node{ 
		int val;
		Node left;
		Node right;
	}
	
	private Node root;
	
	public Binary_Search_Tree(int[] in) {
		root=Create_Tree(in,0,in.length-1);
	}
	
	private Node Create_Tree(int[] in, int si, int ei) {
		if(si>ei) {
			return null;
		}
		int mid=(si+ei)/2;
		Node nn=new Node();
		nn.val=in[mid];
		nn.left=Create_Tree(in,si,mid-1);
		nn.right=Create_Tree(in,mid+1,ei);
		return nn;
	}

}


//  inorder traversal of bst in sorted array of data
// agar kisse binary tree k inorder sorted hai to usko ham bst bolenge


//BST = Binary Search Tree
//BT = Binary Tree
//All BST is BT but all BT is not BST
//in BST inorder traversal is sorted
//Single node is always BST