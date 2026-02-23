package Strings;

public class CountTheCharacters {
	public static void main(String[] args) {
		String str="aaabbaac";
		solve(str);
	}
	
	public static void solve(String str) {
		int count=1;
		char[] a= str.toCharArray();
		for(int i=0;i<a.length-1;i++) {
				if(a[i]==a[i+1]) {
					count++;
				}else {
					System.out.println("count of "+ a[i] + "is "+count);
					count=1;
				}
			
		}
		System.out.println(a[a.length-1]+ ":" +count);
		
	}
}
