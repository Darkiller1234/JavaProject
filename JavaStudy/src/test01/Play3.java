package test01;

import java.util.Scanner;

public class Play3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] numArr = new int[sc.nextInt()];
		int num2 = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i<numArr.length;i++) {
			numArr[i] = sc.nextInt();
		}
		sc.nextLine();
		for(int i = 0; i<numArr.length;i++) {
			if(numArr[i]<num2) {
				System.out.print(numArr[i] + " ");
			}
		}
		sc.close();
	}
}
