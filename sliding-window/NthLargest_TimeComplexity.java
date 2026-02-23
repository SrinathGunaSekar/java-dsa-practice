package dSALearningProgramsTimeComplexity;

import java.util.PriorityQueue;

public class NthLargest_TimeComplexity {
	public static void main(String[] args) {
		int[] a= {10,3,20,8,5};
		int n=2;
		int res = solve(a,n);
		System.out.println(res);
	}
	
	public static int solve(int[]a,int n) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		for(int num:a) {
			pq.add(num);
			if(pq.size()>n) {
				pq.poll();
			}
		}
		return pq.peek();
	}
}
