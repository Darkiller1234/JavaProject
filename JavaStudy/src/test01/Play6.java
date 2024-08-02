package test01;

import java.util.Scanner;

public class Play6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[sc.nextInt()];
		int num2 = sc.nextInt();
		
		
		
		for (int i = 0; i < num2; i++) {
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			int n3 = sc.nextInt();
			for(int j = n1; j <= n2;j++) {
				arr[j-1] = n3;
			}
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		sc.close();
	}
}
