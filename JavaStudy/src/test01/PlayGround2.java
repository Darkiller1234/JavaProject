package test01;

import java.util.ArrayList;
import java.util.Scanner;

public class PlayGround2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		ArrayList<int[][]> arrays = new ArrayList<>(num);
		for (int i = 0; i<num;i++) {
			int num2 = sc.nextInt();
			int[][] num3 = new int[num2][2];
			arrays.add(num3);
			for(int j = 0; j<num2;j++) {
				arrays.get(i)[j][0] = sc.nextInt();
				arrays.get(i)[j][1] = sc.nextInt();
			}
		}
		
		for(int i = 0;i<num;i++) {
			int num1_x, num1_y, num2_x, num2_y;
			num1_x = arrays.get(i)[0][0];
			num1_y = arrays.get(i)[0][1];
			num2_x = arrays.get(i)[1][0];
			num2_y = arrays.get(i)[1][1];
			for(int j = 0; j < arrays.get(i).length;j++) {
				for(int k = j+1; k < arrays.get(i).length;k++) {
					int numX_1 = arrays.get(i)[j][0];
					int numX_2 = arrays.get(i)[k][0];
					int numY_1 = arrays.get(i)[j][1];
					int numY_2 = arrays.get(i)[k][1];
					if(((num1_x - num2_x)*(num1_x - num2_x) + ((num1_y - num2_y) * (num1_y - num2_y)))
							<((numX_1-numX_2)*(numX_1-numX_2)) + ((numY_1-numY_2) * (numY_1-numY_2))) {
						num1_x = numX_1;
						num1_y = numY_1;
						num2_x = numX_2;
						num2_y = numY_2;
					}
				}
			}
			System.out.printf("%d %d %d %d", num1_x, num1_y, num2_x, num2_y);
			System.out.println();
		}
		sc.close();
	}
}
