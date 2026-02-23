package Strings;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String s1= "race   ";
		String s2= "  care";
		if(isAnagram(s1,s2)) {
			System.out.println("Anagram");
		}else {
			System.out.println("Not");
		}
	}
	
	public static boolean isAnagram(String s1, String s2) {
		s1=s1.trim();
		s2=s2.trim();
		
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		
		char[] a=s1.toCharArray();
		char[] b= s2.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		return Arrays.equals(a, b);
	}
}
