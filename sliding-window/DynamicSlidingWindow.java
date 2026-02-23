package dSALearningProgramsTimeComplexity;

public class DynamicSlidingWindow {
	public static void main(String[] args) {
		int[] a = {4, 2, 1, 7, 8, 1, 2, 8, 1, 0};
		int k=8;
		
		int res = solve(a,k);
		System.out.println(res);
	}
	
	public static int solve(int[] a,int k) {
		int start=0;
		int sum=0;
		int maxLength=0;
		
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
			
			while(sum>=k) {
				sum-=a[start];
				start++;
			}
			
			maxLength = Math.max(maxLength, i-start+1);
			
		}
		return maxLength;	
				
	}
}
