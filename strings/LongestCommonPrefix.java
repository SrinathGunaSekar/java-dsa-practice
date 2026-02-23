package Strings;

public class LongestCommonPrefix {
	public static void main(String[] args) {
		String[] strs = {"flower","flow","flight"};
		String res  = solve(strs);
		System.out.println(res);
	}
	
	public static String solve(String[] strs) {
		if(strs==null || strs.length==0) {
			return "Bye";
		}
		String prefix = strs[0];
		for(int i=1;i<strs.length;i++) {
			while(!strs[i].startsWith(prefix)) {
				prefix = prefix.substring(0,prefix.length()-1);
			}
		}
		return prefix;
	}
}
