package test01;

import java.util.Scanner;

public class Play2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.nextLine();
		int[] numArr = new int[num];
		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = sc.nextInt();
		}
		sc.nextLine();
		num = sc.nextInt();
		int count = 0;
		for(int i = 0; i < numArr.length; i++) {
			if(numArr[i] == num) {
				count++;
			}
		}
		System.out.println(count);
		
		sc.close();
	}
}
