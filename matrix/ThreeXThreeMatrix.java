package multiDimensionalArray;

import java.util.Scanner;

public class ThreeXThreeMatrix {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Enter the size1");
		int size1= sc.nextInt();
		
		System.out.println("Enter the size 2");
		int size2 = sc.nextInt();
		
		int[][] a =new int[size1][size2];
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.println("Enter the Elements");
				a[i][j]=sc.nextInt();
			}
			System.out.println();
		}
		
		System.out.println("thread processing...");
		Thread.sleep(2000);
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
}
