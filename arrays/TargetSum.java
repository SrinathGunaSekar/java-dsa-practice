package array;

import java.util.Arrays;

public class TargetSum {
 public static void main(String[] args) {
	int[] a= {3,4,2};
	int[] res = solve(a,7);
	System.out.println(Arrays.toString(res));
}
 
 public static int[] solve(int[] a,int n) {
	
	 for(int i=0;i<a.length;i++) {
		 for(int j=i+1;j<a.length;j++) {
			 if(a[i]+a[j]==n) {
				 return new int[] {i,j};
			 }
		 }
	 }
	 return new int[]{};
 }
}
