package test.t240704;

public class T_10 {
	public static void main(String[] args) {
		/*
		 * 4행4열
		 * 16~1 저장
		 */
		int value = 16;
		int[][] arr = new int[4][4];
		for(int i = 0;i<arr.length;i++) {
			for(int j = 0;j<arr[i].length;j++) {
//				arr[i][j] = 16-(i*4+j);
				arr[i][j] = value--;
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
