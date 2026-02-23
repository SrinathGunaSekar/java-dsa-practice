package array;

public class AddArrayElements {
	public static void main(String[] args) {
		int[] a= {2,3,4,5,6};
		solve(a);
	}
	public static void solve(int[] a) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		System.out.println(sum);
	}
}
