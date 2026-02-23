package Strings;

import java.util.HashSet;
import java.util.Set;

public class Pangram {
	public static void main(String[] args) {
		String s1 = "	The quick brown fox jumps over the lazy dog	";
		if(pangram(s1)) {
			System.out.println("Pangram");
		}else {
			System.out.println("Not");
		}
	}
	
	public static boolean pangram(String s1) {
		s1 = s1.toLowerCase();
		s1=s1.trim();
		Set<Character> set = new HashSet<>() ;
		for(char c :s1.toCharArray()) {
			if(c>='a' && c<='z') {
				set.add(c);
			}
		}
		return set.size()==26;
	}
}
