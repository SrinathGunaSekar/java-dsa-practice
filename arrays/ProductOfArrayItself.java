package array;

import java.util.Arrays;

public class ProductOfArrayItself {
	public static void main(String[] args) {
		int[] a = {1,2,3,4};
		int[] res = solve(a);
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(res));
	}
	
	public static int[] solve(int[] a) {
		int[] pre = new int[a.length];
		pre[0]=1;
		for(int i=1;i<a.length;i++) {
			pre[i] = pre[i-1]*a[i-1]; 
		}
		
		int[] post = new int[a.length];
		post[a.length-1]=1;
		for(int i=a.length-2;i>=0;i--) {
			post[i]=post[i+1]*a[i+1];
		}
		
		int[] res=new int[a.length];
		for(int i=0;i<a.length;i++) {
			res[i]=pre[i]*post[i];
		}
		return res;
	}
}
