package lec66;

import java.util.*;

public class Replace_Words {
	
//	https://leetcode.com/problems/replace-words/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> Dictionary = Arrays.asList("cat", "bat", "rat");
		
		Trie t=new Trie();
		for(String s:Dictionary) {
			t.insert(s);
		}
		String sentence="the cattle was rattled by the battery";
		String[] arr=sentence.split(" ");
		
		StringBuilder sb=new StringBuilder();
		for(int i=0; i<arr.length; i++) {
			String get=t.search(arr[i]);
			sb.append(get+" ");
		}
		System.out.println(sb.toString().trim());

	}
	
	static class Trie{
		class Node{
			char ch;
			String isterminal;
			HashMap<Character, Node> child;
			public Node(char ch) {
				this.ch=ch;
				child=new HashMap<>();
			}
		}
		
		private Node root=new Node('*');
		
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
			curr.isterminal=word;
	    }
		
		public String search(String word) {
			Node cur=root;
			for(int i=0; i<word.length(); i++) {
				char ch=word.charAt(i);
				if(cur.child.containsKey(ch)) {
					cur=cur.child.get(ch);
					if(cur.isterminal!=null) {
						return cur.isterminal;
					}
				}
				else {
					return word;
				}
			}
			return word;
		}
	}

}
