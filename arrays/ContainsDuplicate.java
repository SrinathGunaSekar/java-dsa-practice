package array;

public class ContainsDuplicate {
 public static void main(String[] args) {
	int[] a= {2,3,4,56,3};
	boolean b = solve(a);
	System.out.println(b);
}
 public static boolean solve(int[] a) {
	 for(int i=0;i<a.length;i++) {
		 for(int j=i+1;j<a.length;j++) {
			 if(a[i]==a[j])
				 return false;
		 }
	 }
	 return true;
 }
}
