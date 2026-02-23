package array;

import java.util.Arrays;

public class MergeTwoArrays {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5};
		int[] b= {6,7,8,9,100};
		solve(a,b);
	}
	public static void solve(int[] a,int[] b) {
		int[] x= new int[a.length+b.length];
		int m=0,n=0;
		for(int i=0;i<x.length;i++) {
			if(m<a.length) {
				x[i]=a[m++];
			}else if(n<b.length) {
				x[i]=b[n++];
			}
		}
		System.out.println(Arrays.toString(x));
	}
}
