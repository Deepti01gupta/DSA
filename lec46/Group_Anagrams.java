package lec46;

import java.util.*;

public class Group_Anagrams {

//	https://leetcode.com/problems/group-anagrams/
	public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> mpp=new HashMap<>();
        for(String word:strs){
            char[] ch=word.toCharArray();
            Arrays.sort(ch);
            String sortedword=new String(ch);
            mpp.putIfAbsent(sortedword, new ArrayList<>());
            mpp.get(sortedword).add(word);
        }
        return new ArrayList<>(mpp.values());
    }
	
}
