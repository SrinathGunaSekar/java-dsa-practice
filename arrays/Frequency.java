package array;

import java.util.Arrays;

public class Frequency {
	public static void main(String[] args) {
		int[] a = {8,6,8,4,5,6,5,5,8};
		System.out.println(Arrays.toString(a));
		solve(a);
	}
	
	public static void solve(int[] a) {
		int count=0;
		for(int i=0;i<a.length;i++) {
			count=1;
			if(a[i]==Integer.MIN_VALUE)
				continue;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					count++;
					a[j]=Integer.MIN_VALUE;
				}
				
			}
			System.out.print(count);
			
		}
	}
}
