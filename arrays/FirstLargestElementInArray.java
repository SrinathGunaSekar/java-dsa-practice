package array;

public class FirstLargestElementInArray {
	public static void main(String[] args) {
		int[] a = {232,5434,8763,3222,54423};
		int num = solve(a);
		System.out.println(num);
	}
	public static int solve(int[] a) {
		int max= Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		return max;
	}
}
