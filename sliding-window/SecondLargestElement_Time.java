package dSALearningProgramsTimeComplexity;

public class SecondLargestElement_Time {
	public static void main(String[] args) {
		int[] a= {10,3,20,8};
		int n=2;
		int res = solve(a,n);
		System.out.println(res);
	}
	
	public static int solve(int[]a,int n) {
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]>first) {
				second=first;
				first=a[i];
			}
			if(a[i]>second && a[i]!=first) {
				second=a[i];
			}
		}
		return second;
	}
}
