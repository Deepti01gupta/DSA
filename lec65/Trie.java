package lec65;

import java.util.*;

public class Trie {
	
//	https://leetcode.com/problems/implement-trie-prefix-tree/?envType=problem-list-v2&envId=trie
	
	class Node{
		char ch;
		boolean isterminal;
		HashMap<Character, Node> child;
		
		public Node(char ch) {
			this.ch=ch;
			child=new HashMap<>();
		}
	}
	
	private Node root;
	
	public Trie() {
		root=new Node('*');
	}
	
	
	// TC: O(word.length()) 
	public void insert(String word) {
		Node curr=root;
		for(int i=0; i<word.length(); i++) {
			char ch=word.charAt(i);
			if(curr.child.containsKey(ch)) {
				curr=curr.child.get(ch);
			}
			else {
				Node nn=new Node(ch);
				curr.child.put(ch, nn);
				curr=nn;
			}
		}
		curr.isterminal=true;
    }
	
	public boolean search(String word) {
		Node curr=root;
		for(int i=0; i<word.length(); i++) {
			char ch=word.charAt(i);
			if(curr.child.containsKey(ch)) {
				curr=curr.child.get(ch);
			}
			else {
				return false;
			}
		}
		return curr.isterminal;
    }
	
	public boolean startsWith(String prefix) {
		Node curr=root;
		for(int i=0; i<prefix.length(); i++) {
			char ch=prefix.charAt(i);
			if(curr.child.containsKey(ch)) {
				curr=curr.child.get(ch);
			}
			else {
				return false;
			}
		}
		return true;
    }
    

}
