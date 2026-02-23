package array;

public class MissingNumber {
	public static void main(String[] args) {
		int[] a= {2,4,6,8,10};
		for(int i=0,m=0;i<a.length;i++,m++) {
			if(m!=a[i]) {
				System.out.print(m+" ");
				i--;
			}
		}
	}
}
