package test01;

import java.util.Scanner;

public class Play8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[30];
		for(int i = 0; i<30;i++) {
			arr[i] = 0;
		}
		for(int i = 0; i<28;i++) {
			arr[sc.nextInt()-1] = 1;
		}
		int num1 = 0, num2 = 0;
		for(int i = 0; i<30;i++) {
			if(arr[i] == 0) {
				if(num1 == 0) {
					num1 = i+1;
				}
				else {
					num2 = i+1;
				}
			}
		}
		System.out.print((num1>num2?num2:num1) + "\n" + (num1>num2?num1:num2));
		
		sc.close();
	}
}
