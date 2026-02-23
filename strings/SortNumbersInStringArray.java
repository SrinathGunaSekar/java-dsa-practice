package Strings;

import java.util.Arrays;

public class SortNumbersInStringArray {
	public static void main(String[] args) {
		String[] s = {"92","54","483","53164","916"};
		System.out.println(Arrays.toString(s));
		for(int i=0;i<s.length-1;i++) {
			for(int j=0;j<s.length-1-i;j++) {
				if(s[j].compareTo(s[j+1])>0) {
					String temp = s[j];
					s[j]=s[j+1];
					s[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(s));
	}
}
