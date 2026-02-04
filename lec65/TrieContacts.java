package lec65;

import java.io.*;
import java.util.*;

public class TrieContacts {
    class node{
        
        char ch;
        boolean isterminal;
        int count=1;//default 1 as jese hi us char ki nyi node bnegi 
        HashMap<Character,node> child;
        public node(char ch){
            this.ch=ch;
            child=new HashMap<>();
        }
    }
    private node root;
    public TrieContacts(){
        root=new node('*');
    }
    public void insert(String word) {
        node cur=root;
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(cur.child.containsKey(ch)){
                cur=cur.child.get(ch);
                cur.count++;
            }else{
                node nn=new node(ch);
                cur.child.put(ch,nn);
                cur=nn;
            }
        }
        cur.isterminal=true;
        
    }
    
    public int startsWith(String prefix) {
        node cur=root;
        for(int i=0;i<prefix.length();i++){
            char ch=prefix.charAt(i);
            if(cur.child.containsKey(ch)){
                cur=cur.child.get(ch);
            }else{
                return 0;
            }
        }
        return cur.count;
    }

    public static void main(String[] args) throws IOException {

    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    TrieContacts trie = new TrieContacts();

    int n = Integer.parseInt(bufferedReader.readLine().trim());

    for (int i = 0; i < n; i++) {
        String[] input = bufferedReader.readLine().split(" ");
        String op = input[0];
        String word = input[1];

        if (op.equals("add")) {
            trie.insert(word);
        } 
        else if (op.equals("find")) {
            System.out.println(trie.startsWith(word));
        }
    }

    bufferedReader.close();
}

}