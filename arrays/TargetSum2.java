package array;

import java.util.Arrays;

public class TargetSum2 {
	public static void main(String[] args) {
		int[] a = {7,2,3,1,8};
		System.out.println(Arrays.toString(a));
		solve(a,10);
		
	}
	public static void solve(int[] a,int n) {
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]+a[j]==n) {
					System.out.print("("+a[i]+","+a[j]+")");
				}
			}
			System.out.println();
		}
		
	}
}
