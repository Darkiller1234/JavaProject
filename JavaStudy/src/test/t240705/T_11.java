package test.t240705;

import java.util.Scanner;

public class T_11 {
	public static void main(String[] args) {
		/*
		 * 1~100 정수 중 난수 결정
		 * 사용자는 난수 맞추는데 몇번 걸리는지 출력
		 */
		
		Scanner sc = new Scanner(System.in);
		int num = (int)(Math.random() * 100 + 1);
		int count = 0;
		while(true) {
			System.out.print("1~100 사이의 임의의 난수를 맞춰보세요 : ");
			int ans = sc.nextInt();
			if(ans>100 || ans<1) {
				System.out.println("1~100 사이의 숫자를 입력해주세요.");
				continue;
			}
			count++;
			if(ans == num) {
				System.out.println("정답입니다 !!");
				System.out.println(count + "회만에 맞추셨습니다.");
				break;
			}
			else if(ans > num) {
				System.out.println("DOWN !");
			}
			else {
				System.out.println("UP !");
			}
		}
		
		
		sc.close();
	}
}
