package Strings;

public class ReverseCharactersNotExpressions {
	public static void main(String[] args) {
		String s = "hi @ how # are ?";
		solve(s);
	}
	
	public static boolean isItLetter(char a) {
		return ((a>='a'&& a<='z')||
				(a>='A'&& a<='Z'));
	}
	public static void solve(String s) {
		char[] a=s.toCharArray();
		int l=0,r=a.length-1;
		while(l<r) {
			if(isItLetter(a[l]) && isItLetter(a[r])) {
				char temp = a[l];
				a[l]=a[r];
				a[r]=temp;
				l++;
				r--;
			}
			if(!isItLetter(a[l])) {
				l++;
			}
			if(!isItLetter(a[r])) {
				r--;
			}
			
		}
		System.out.println(s);
		System.out.println(new String(a));
	}
}
