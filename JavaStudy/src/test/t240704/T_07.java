package test.t240704;

import java.util.Scanner;

public class T_07 {
	public static void main(String[] args) {
		/*
		 * 문자열 입력받음
		 * 문자 하나나를 배열에 넣음
		 * 검색할 문자가 문자열에 몇개 있는지의 개수, 몇번째에 위치하는지 출력
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String str = new String(sc.nextLine());
		char[] chArr = new char[str.length()];
		
		
		for(int i = 0; i < str.length(); i++) {
			chArr[i] = str.charAt(i);
		}
		
		int count = 0;
		
		System.out.print("문자 : ");
		char ch = sc.next().charAt(0);
		System.out.print(str + "에 " + ch + "가 존재하는 위치(인덱스) : ");
		for(int i = 0; i < chArr.length; i++) {
			if(ch == chArr[i]) {
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println();
		System.out.println(ch + "의 개수 : " + count);
		sc.close();
	}
}
