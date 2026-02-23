package Strings;

public class CheckStringAndReverse {
	public static void main(String[] args) {
		
		
		String s1 = "test";
		String s2 = "test";
		String rev="";
		boolean same = true;
		if(s1.length()!=s2.length()) {
			same=false;
		}else {
			for(int i=0;i<s1.length();i++) {
				if(s1.charAt(i)!=s2.charAt(i)) {
					same=false;
					break;
				}
			}
		}
		if(same) {
			for(int i=s1.length()-1;i>=0;i--) {
				rev=rev + s1.charAt(i);
			}
		}else {
			for(int i=s2.length()-1;i>=0;i--) {
				rev= rev+s2.charAt(i);
			}
		}
		System.out.println(rev);
	}
}
