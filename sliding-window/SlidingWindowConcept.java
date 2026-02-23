package dSALearningProgramsTimeComplexity;

public class SlidingWindowConcept {
	public static void main(String[] args) {
		int[] a = {2,1,5,1,3,2};
		int k=3;
		int res = solve(a,k);
		System.out.println(res);
	}
	
	public static int solve(int[]a ,int k) {
		int windowsum = 0;
		for(int i=0;i<k;i++) {
			windowsum+=a[i];
		}
		int maxsum=windowsum;
		for(int i=k;i<a.length;i++) {
			windowsum = maxsum - a[i-k] +a[i] ;
			maxsum=Math.max(maxsum, windowsum);
		}
		return maxsum;
	}
}
