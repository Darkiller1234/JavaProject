package e.array;

import java.util.Scanner;

public class A_array3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1. 크기가 10인 정수형 배열 생성 후
//		int[] arr1 = new int[10];
		// 2. 반복문을 통해서 0번인덱스부터 마지막 인덱스까지 모든값을 1로 초기화
//		for(int i = 0; i < arr1.length;i++) {
//			arr1[i] = 1;
//		}
		// 3. 반복문을 통해서 0~마지막인덱스 까지 전부 출력
//		for(int i = 0; i < arr1.length; i++) {
//			System.out.print(arr1[i] + " ");
//		}
		
		
		
		//4. 사용자에게 배열의 길이를 입력받아 해당크기의 문자열배열을 생성해라.
		// 길이 입력 : x
//		int size;
//		
//		System.out.print("길이 입력 : ");
//		size = sc.nextInt();
//		sc.nextLine();
//		
//		String[] strArr = new String[size];
//		
		//5. 반복문을 활용해서 매번 사용자에게 과일명을 입력받아 그 값을 strArr에 대입(0~마지막인덱스)
		//좋아하는 과일을 입력 : 바나나(반복)
		
//		for (int i = 0; i < strArr.length; i++) {
//			System.out.print("좋아하는 과일을 입력 : ");
//			String str = new String(sc.nextLine());
//			strArr[i] = str;
//		}
		
		//6. 반복문을 이용해서 strArr에 있는 모든 값을 출력
//		for (int i = 0; i < strArr.length; i++) {
//			System.out.print(strArr[i] + " ");
//		}
		
		// 사용자에게 문자열 하나 입력받은 후(ex : system, fruit 등등)
		// 각각의 인덱스에 있는 문자들을 char배열에 옮겨담기
		
		
//		System.out.print("문자열 입력 : ");
//		String str = new String(sc.nextLine());
//		char[] chArr = new char[str.length()];
//		
//		for(int i = 0;i<chArr.length;i++) {
//			chArr[i] = str.charAt(i);
//		}
//		for(int i = 0; i < chArr.length; i++) {
//			System.out.print(chArr[i] + " ");
//		}
		
		
		// 사용자에게 배열의 길이를 입력받아 해당 길이의 정수형배열 arr을 생성한다.
		// arr에 모든 인덱스값에 1~100사이의 랜덤값을 할당해주고
		// arr에 모든 값을 출력한 후
		// 이중 짝수인 값의 총 합을 구해라
		
		int sum = 0;
		System.out.print("정수입력 : ");
		int[] arr = new int[sc.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 100) + 1;
			if(arr[i] % 2 == 0) {
				sum += arr[i];
			}
			System.out.print(arr[i] + " ");
		}
		System.out.print("\n짝수 총 합 : " + sum);
		
		
		sc.close();
	}
}
