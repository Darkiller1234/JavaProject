package test01;

import java.util.Scanner;

public class Play11 {
	public static void main(String[] args) {
		/*
		 * 컴퓨터와 가위바위보
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("당신의 이름을 입력해주세요 : ");
		String name = new String(sc.nextLine());
		
		String[] gameArr = {"가위", "바위", "보"};
		
		int win = 0, lose = 0, draw = 0;
		while(true) {
			System.out.print("가위바위보 : ");
			String str = new String(sc.nextLine());
			int player = str.equals("가위")?0:str.equals("바위")?1:str.equals("보")?2:3;
			if(str.equals("exit")) {
				System.out.printf("%d전 %d승 %d무 %d패", win+draw+lose, win, draw, lose);
				break;
			}
			int com = (int)(Math.random() * 3);
			System.out.println("컴퓨터 : " + gameArr[com]);
			System.out.println(name + " : " + str);
			if(com == player) {
				System.out.println("비겼습니다.");
				draw++;
			}
			else {
				int result = 0;
				switch((com+player) * (com-player)) {
				case -1:
				case -3:
				case 4:
					result = 1;
					break;
				case -4:
				case 3:
				case 1:
					result = 0;
					break;
				default:
					System.out.println("오류!!!");
					return;
				}
				if(result == 1) {
					System.out.println("이겼습니다.");
					win++;
				}
				else {
					System.out.println("졌습니다.");
					lose++;
				}
			}
			System.out.println();
			
			
			
		}
		
		
		sc.close();
	}
}
