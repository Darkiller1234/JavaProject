package test.t240705;

import java.util.Scanner;

public class T_08 {
	public static void main(String[] args) {
//		정수 두개, 연산자 입력 알맞은 결과 출력
//		exit들어올때까지 무한반복
//		나누기면서 두번째정수가 0이 들어오면
//		0으로 나눌 수 없습니다. 다시 입력해주세요.
//		없는 연산자가 들어오면
//		없는 연산자입니다. 다시 입력해주세요.
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int num1, num2, num;
			System.out.print("연산자(+, -, *, /, %) : " );
			String str = new String(sc.nextLine());
			if(str.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				sc.close();
				return;
			}
			System.out.print("정수1 : ");
			num1 = sc.nextInt();
			sc.nextLine();
			System.out.print("정수2 : ");
			num2 = sc.nextInt();
			sc.nextLine();
			if(str.equals("/") && num2 == 0) {
				System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
				System.out.println();
				continue;
			}
			switch(str) {
			case "+":
				num = num1+num2;
				break;
			case "-":
				num = num1-num2;
				break;
			case "*":
				num = num1*num2;
				break;
			case "/":
				num = num1/num2;
				break;
			case "%":
				num = num1%num2;
				break;
			default:
				System.out.println("없는 연산자입니다. 다시 입력해주세요.");
				System.out.println();
				continue;
			}
			System.out.println(num1 + " " + str + " " + num + " = " + num);
			System.out.println();
		}
		
		
		
		
	}
}
