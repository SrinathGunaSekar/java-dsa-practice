package array;

import java.util.Arrays;

public class TargetOfSum3 {
	public static void main(String[] args) {
		int[] a= {1,2,4,3,6,7};
//		for(int i=0;i<a.length;i++) {
//			for(int j=i+1;j<a.length;j++) {
//				for(int k=j+1;k<a.length;k++) {
//					if(a[i]+a[j]+a[k]==10) {
//						System.out.print("("+a[i]+","+a[j]+","+a[k]+")");
//					}
//				}
//			}
//			System.out.println();
//		}
		
		Arrays.sort(a);
		for(int i=0;i<a.length;i++) {
			int l=i+1,r=a.length-1;
			while(l<r) {
				if(a[i]+a[l]+a[r]==10) {
					System.out.print("("+a[i]+a[l]+a[r]+")");
					l++;
					r--;
				}
				if(a[i]+a[l]+a[r]<10) {
					l++;
				}else if(a[i]+a[l]+a[r]>10) {
					r--;
				}
			}
			
		}
	}
}
