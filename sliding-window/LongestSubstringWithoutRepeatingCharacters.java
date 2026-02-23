package dSALearningProgramsTimeComplexity;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
	public static void main(String[] args) {
		String str = "abcdababb";
		int res = solve(str);
		System.out.println(res);
	}
	
//	public static int solve(String str) {
//		int start=0;
//		int maxLength = 0;
//		Set<Character> set = new HashSet<Character>();
//		
//		for(int i=0;i<str.length();i++) {
//			char current = str.charAt(i);
//			while(set.contains(current)) {
//				set.remove(str.charAt(start));
//				start++;
//			}
//			set.add(current);
//			maxLength = Math.max(maxLength, i-start+1);
//		}
//		return maxLength;
//	}
	
	public static int solve(String str) {
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		
		int start =0;
		int maxLength=0;
		for(int i=0;i<str.length();i++) {
			char current = str.charAt(i);
			
			if(map.containsKey(current)) {
				start=Math.max(maxLength,map.get(current)+1 );
			}
			map.put(current, i);
			
			maxLength=Math.max(maxLength, i-start+1);
		}
		return maxLength;
		
	}
}
