package test01;

import java.util.Scanner;

public class Play5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max, num;
		int[] arr = new int[9];
		for(int i = 0; i<arr.length;i++) {
			arr[i] = sc.nextInt();
			sc.nextLine();
		}
		max = arr[0];
		num = 1;
		for(int i = 1; i<arr.length;i++) {
			num = max<arr[i]?i+1:num;
			max = max<arr[i]?arr[i]:max;
			
		}
		System.out.println(max + "\n" + num);
		
		
		sc.close();
	}
}
