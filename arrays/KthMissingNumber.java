package array;

public class KthMissingNumber {
	public static void main(String[] args) {
		int[] a = {2,3,4,7,11};
		int k=5;
		for(int i=0;i<a.length;i++) {
			if(k>=a[i]) {
				k++;
			}
		}
		System.out.println(k);
	}
}
