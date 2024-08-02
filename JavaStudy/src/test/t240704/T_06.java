package test.t240704;

import java.util.Scanner;

public class T_06 {
	public static void main(String[] args) {
		/*
		 * 입력받은 양의정수만큼 배열크기 할당
		 * 1부터 입력받은 값까지 배열에 입력 후 출력
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("양의 정수 : ");
		int[] arr = new int[sc.nextInt()];
		
		for(int i = 0;i < arr.length; i++) {
			arr[i] = i+1;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		
		sc.close();
	}
}
