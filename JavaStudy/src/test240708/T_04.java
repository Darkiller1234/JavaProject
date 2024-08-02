package test240708;

import java.util.Scanner;

public class T_04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[2];
		arr[0] = sc.nextInt();
		arr[1] = sc.nextInt();
		System.out.println("합 : " + (arr[0] + arr[1]));
		System.out.println("차 : " + (arr[0] - arr[1]));
		System.out.println("곱 : " + (arr[0] * arr[1]));
		System.out.println("나누기 : " + (arr[0] / arr[1]));

		sc.close();
	}
}
