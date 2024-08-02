package game.java;

import java.util.Scanner;

public class GameManager {
	GameController gc = new GameController();
	
	
	Scanner sc = new Scanner(System.in);
	
	
	public void StartGame() {
		while(true) {
			String str = sc.nextLine();
			if(str.equals("exit")){
				break;
			}
			int[] arr = gc.Analyze(str);
			if(arr[0] != -1) {
				System.out.print(gc.getLocation()[arr[0]]);
			}
			if(arr[1] != -1) {
				System.out.println(gc.getObject()[arr[1]]);
			}
			if(arr[2] != -1) {
				System.out.print(gc.getPredicate()[arr[2]][0]);
			}

			System.out.println();
		}
	}
}
