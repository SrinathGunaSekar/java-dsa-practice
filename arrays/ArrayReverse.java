package array;

import java.util.Arrays;

public class ArrayReverse {
	public static void main(String[] args) {
		int[] a= {54,89,21,15,44};
		solve(a);
	}
	public static void solve(int[] a) {
		int l=0,r=a.length-1;
		while(l<r) {
			int temp=a[l];
			a[l]=a[r];
			a[r]=temp;
			l++;
			r--;
		}
		System.out.println(Arrays.toString(a));
	}
}
