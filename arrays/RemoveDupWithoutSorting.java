package array;

import java.util.Arrays;

public class RemoveDupWithoutSorting {
	public static void main(String[] args) {
		int[] a= {2,1,34,2,1,56,7};
		solve(a);
	}
	
	public static void solve(int[] a) {
		
		int dup=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==Integer.MIN_VALUE)
				continue;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					dup++;
					a[j]=Integer.MIN_VALUE;
				}
			}
		}
		int b[] = new int[a.length-dup];
		int m=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]!=Integer.MIN_VALUE)
			 b[m++]=a[i];
		}
		System.out.println(Arrays.toString(b));
 	}
}
