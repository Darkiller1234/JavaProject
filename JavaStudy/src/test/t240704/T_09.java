package test.t240704;

public class T_09 {
	public static void main(String[] args) {
		/*
		 * 4행 4열짜리 정수형 배열
		 * 1~16까지 차례대로 저장
		 * 저장된 값들을 차례대로 출력
		 */
		int value = 1;
		int[][] arr = new int[4][4];
		for(int i = 0;i<arr.length;i++) {
			for(int j = 0;j<arr[i].length;j++) {
				//arr[i][j] = i*4+j+1;
				arr[i][j] = value++;
			}
		}
		for(int i = 0;i<arr.length;i++) {
			for(int j = 0;j<arr[i].length;j++) {
				if(arr[i][j] < 10) {
					//System.out.print(" ");
				}
				//System.out.print(arr[i][j] + " ");
				System.out.printf("%2d ",arr[i][j]);
			}
			System.out.println();
		}
	}
}
