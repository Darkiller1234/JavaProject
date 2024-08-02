package test01;

import java.util.Scanner;

public class Play7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[sc.nextInt()];
		for(int i = 1;i<=arr.length;i++) {
			arr[i-1] = i;
		}
		int num = sc.nextInt();
		
		for(int i = 0; i < num; i++) {
			int n1 = sc.nextInt() - 1;
			int n2 = sc.nextInt() - 1;
			int tmp = arr[n1];
			arr[n1] = arr[n2];
			arr[n2] = tmp;
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		
		
		sc.close();
	}
}
