package array;

public class PrintSubArray {
	public static void main(String[] args) {
		int[] a= {8,4,2,6};
		for(int i=0;i<a.length;i++) {
			for(int j=i;j<a.length;j++) {
				for(int k=i;k<=j;k++) {
					System.out.print(a[k]+" ");
				}
				System.out.print("\t");
			}
			System.out.println();
		}
	}
}
