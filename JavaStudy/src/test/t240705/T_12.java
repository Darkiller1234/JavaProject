package test.t240705;

import java.util.Scanner;

public class T_12 {
	public static void main(String[] args) {
		/*
		 * 컴퓨터와 가위바위보
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("당신의 이름을 입력해주세요 : ");
		String name = new String(sc.nextLine());
		
		int win = 0, lose = 0, draw = 0, game = 0;
		while(true) {
			System.out.print("가위바위보 : ");
			String str = new String(sc.nextLine());
			if(str.equals("exit")) {
				System.out.printf("%d전 %d승 %d무 %d패", game, win, draw, lose);
				break;
			}
			int com = (int)(Math.random() * 3);
			switch(com) {
			case 0:
				System.out.println("컴퓨터 : 가위");
				System.out.println(name + " : " + str);
				switch(str) {
				case "가위":
					System.out.println("비겼습니다.");
					System.out.println();
					draw++;
					break;
				case "바위":
					System.out.println("이겼습니다!");
					System.out.println();
					win++;
					break;
				case "보":
					System.out.println("졌습니다 ㅠㅠ");
					System.out.println();
					lose++;
					break;
				default:
					System.out.println("다시 입력하세요.");
					continue;
				}
				break;
			case 1:
				System.out.println("컴퓨터 : 바위");
				System.out.println(name + " : " + str);
				switch(str) {
				case "바위":
					System.out.println("비겼습니다.");
					System.out.println();
					draw++;
					break;
				case "보":
					System.out.println("이겼습니다!");
					System.out.println();
					win++;
					break;
				case "가위":
					System.out.println("졌습니다 ㅠㅠ");
					System.out.println();
					lose++;
					break;
				default:
					System.out.println("다시 입력하세요.");
					continue;
				}
				break;
			case 2:
				System.out.println("컴퓨터 : 보");
				System.out.println(name + " : " + str);
				switch(str) {
				case "보":
					System.out.println("비겼습니다.");
					System.out.println();
					draw++;
					break;
				case "가위":
					System.out.println("이겼습니다!");
					System.out.println();
					win++;
					break;
				case "바위":
					System.out.println("졌습니다 ㅠㅠ");
					System.out.println();
					lose++;
					break;
				default:
					System.out.println("다시 입력하세요.");
					continue;
				}
				break;
			}
			System.out.print(name + " : " + str);
			
		}
		
		
		sc.close();
	}
}
