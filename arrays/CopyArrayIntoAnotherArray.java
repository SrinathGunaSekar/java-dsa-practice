package array;

import java.util.Arrays;

public class CopyArrayIntoAnotherArray {
	public static void main(String[] args) {
		int a[] = {1,2,3,45,56};
		int res[]= solve(a);
		System.out.println(Arrays.toString(res));
	}
	
	public static int[] solve(int[] a) {
		int[] x = new int[a.length];
		int m=0;
		for(int i=0;i<a.length;i++) {
			x[i] = a[m++];
		}
		return x;
	}
}
