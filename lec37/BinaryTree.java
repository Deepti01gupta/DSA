package lec37;

import java.util.*;

public class BinaryTree {

	class Node{
		int val;
		Node left;
		Node right;
	}
	
	private Node root;
	Scanner sc=new Scanner(System.in);
	
	public BinaryTree() {
		root=CreateTree();
	}
	
	private Node CreateTree() {
		int item=sc.nextInt();
		Node nn=new Node();
		nn.val=item;
		boolean hlc=sc.nextBoolean();
		if(hlc) {
			nn.left=CreateTree();
		}
		boolean hrc=sc.nextBoolean();
		if(hrc) {
			nn.right=CreateTree();
		}
		return nn;
	}
	
	public void Display() {
		Display(root);
	}
	
	private void Display(Node root) {
		if(root==null) {
			return;
		}
		String s="";
		s = "<--" + root.val + "-->";
		if(root.left!=null) {
			s = root.left.val + s;
		}
		else {
			s = "."+s;
		}
		if(root.right!=null) {
			s = s + root.right.val;
		}
		else {
			s = s+".";
		}
		System.out.println(s);
		Display(root.left);
		Display(root.right);
	}
	
	
	public int max() {
		return max(root);
	}
	
	private int max(Node root) {
		if(root==null) {
			return Integer.MIN_VALUE;
		}
		int lmax=max(root.left);
		int rmax=max(root.right);
		return Math.max(root.val , (Math.max(lmax, rmax)));
	}
	
	public boolean find(int item) {
		return find(root,item);
	}
	
	private boolean find(Node root, int item) {
		if(root==null) {
			return false;
		}
		if(root.val==item) {
			return true;
		}
		return find(root.left,item) || find (root.right,item);
	}
	
	
	public int height() {
		return height(root);
	}
	
	private int height(Node root) {
		if(root==null) {
			return 0;
		}
		int lh=height(root.left);
		int rh=height(root.right);
		return Math.max(lh, rh)+1;
	}
	
	public void preOrder() {
		preOrder(root);
		System.out.println();
	}
	
	private void preOrder(Node root) {
		if(root==null) {
			return;
		}
		System.out.print(root.val+" ");
		preOrder(root.left);
		preOrder(root.right);
	}
	
	public void inOrder() {
		inOrder(root);
		System.out.println();
	}
	
	private void inOrder(Node root) {
		if(root==null) {
			return;
		}
		inOrder(root.left);
		System.out.print(root.val+" ");
		inOrder(root.right);
	}
	
	
	public void postOrder() {
		postOrder(root);
		System.out.println();
	}
	
	private void postOrder(Node root) {
		if(root==null) {
			return;
		}
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.val+" ");
	}
	
	public void levelOrder() {
		levelOrder(root);
	}
	
	private void levelOrder(Node root) {
		Queue<Node> q=new LinkedList<>();
		q.add(root);
		while(!q.isEmpty()) {
			int n=q.size();
			for(int i=0; i<n; i++) {
				Node nn=q.remove();
				System.out.print(nn.val+" ");
				if(nn.left!=null) {
					q.add(nn.left);
				}
				if(nn.right!=null) {
					q.add(nn.right);
				}
			}
		}
	}
	
	
}
