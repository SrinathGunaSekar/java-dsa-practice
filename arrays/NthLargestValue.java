package array;

public class NthLargestValue {
 public static void main(String[] args) {
	int[] a = {1,2,3,4,5};
	int n = 2;
	int res=solve(a,n);
	System.out.println(res);
 }
 
  public static int solve(int[] a,int n){
	int max= Integer.MIN_VALUE;
	for(int k=1;k<=n;k++) {
		max= Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++) {
			if(a[i]==Integer.MIN_VALUE)
				continue;
			if(a[i]>max)
				max=a[i];
		}
		for(int j=0;j<a.length;j++) {
			if(a[j]==max)
				a[j]=Integer.MIN_VALUE;
		}
	}
	return max;
  }
}
