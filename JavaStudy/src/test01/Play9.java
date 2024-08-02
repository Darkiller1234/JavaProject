package test01;

import java.util.Scanner;

public class Play9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		int count = 0;
		for (int i = 0; i<10;i++) {
			int num = (sc.nextInt()%42) + 1;
			for(int j = 0; j < 10; j++) {
				if(arr[j] == num) {
					break;
				}
				else if(arr[j] == 0) {
					arr[j] = num;
					count++;
					break;
				}
			}
		}
		System.out.print(count);
		sc.close();
	}
}
