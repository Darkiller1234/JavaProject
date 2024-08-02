package test01;

import java.util.Scanner;

public class Play4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int max, min;
		
		int[] arr = new int[sc.nextInt()];
		sc.nextLine();
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		max = min = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			max = max<arr[i]?arr[i]:max;
			min = min>arr[i]?arr[i]:min;
		}
		System.out.println(min + " " + max);
		
		sc.close();
	}
}
