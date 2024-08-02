package test240711.object1;

import java.util.Scanner;

public class T_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int[] arr = new int[sc.nextInt()];
		for (int i = 0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 100) + 1;
		}
		int sum = 0;
		for(int i = 0; i<arr.length;i++) {
			if(i%2==1) {
				System.out.print(arr[i] + " ");
				sum += arr[i];
			}
		}
		System.out.println();
		System.out.println("홀수index의 합 : " + sum);
		
		sc.close();
	}
}
