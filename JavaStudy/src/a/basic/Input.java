package a.basic;

import java.util.Scanner;
//1) Scanner를 사용하기 위해 외부로부터 가져온다.



public class Input {
	/*
	 * 키보드 Input
	 * Scanner를 사용
	 * (java.util.Scanner 클래스를 이용.)
	 * 
	 * [사용법]
	 * Scanner 이름 = new Scanner(System.in);
	 * ex) Scanner sc = new Scanner(System.in);
	 * sc.next() : 사용자가 입력한 값중 공백이 있을 경우 공백 이전까지 값만 가져온다.
	 * sc.nextLine() : 사용자가 (중략) \n(개행문자)를 포함한 한 라인을 읽고 
	 *                 \n을 버린 나머지 값만 가져온다. 
	 *                 한 줄을 가져온다.
	 *                 
	 * sc.nextByte(), sc.nextShort(), sc.nextInt(), sc.nextLong()
	 * sc.nextFloat(), sc.nextDouble()
	 * 위처럼 정수나 실수를 입력받는 코드를 작성했을 때 \n 토큰이 함께 들어오기 때문에
	 * 비워주는 코드를 작성해야 한다. (sc.nextLine())
	 * 
	 * 
	 * 
	 * 
	 * 
	 * sc.close() // scanner 종료
	 * close 이후 다시 생성 불가능
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		String str1, str2;
//		str1 = sc.next();
//		sc.nextLine();			// 버퍼에서 \n(엔터값)을 비워주는 의도
//		str2 = sc.nextLine();
//		
//		
//		System.out.println(str1);
//		System.out.println(str2);
		
		System.out.println("===============================================");
		String name, address;
		int age;
		float height;
		
		System.out.print("이릅을 입력해주세요 : ");
		name = sc.nextLine();
		
		System.out.print("나이를 입력해주세요 : ");
		age = sc.nextInt();
		sc.nextLine();
		
		System.out.print("키를 입력해주세요 : ");
		height = sc.nextFloat();
		sc.nextLine();
		
		System.out.print("주소를 입력해주세요 : ");
		address = sc.nextLine();
		
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("키 : " + height);
		System.out.println("주소 : " + address);
		
		System.out.println("===============================================");
		
		
		
		sc.close();
	}
}
