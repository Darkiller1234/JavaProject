package objcetOrientedProgramming;

import java.util.Scanner;

public class Run2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String kind, name, flavor;
		Snack s = new Snack();
		int numOf, price;
		System.out.println("스낵류를 입력하세요.");
		System.out.print("종류 : ");
		kind = sc.nextLine();
		System.out.print("이름 : ");
		name = sc.nextLine();
		System.out.print("맛 : ");
		flavor = sc.nextLine();
		System.out.print("개수 : ");
		numOf = sc.nextInt();
		System.out.print("가격 : ");
		price = sc.nextInt();
		sc.nextLine();
		s.setKind(kind);
		s.setName(name);
		s.setFlavor(flavor);
		s.setNumOf(numOf);
		s.setPrice(price);
		System.out.print("저장한 정보를 확인하시겠습니까?(y/n) : ");
		if(sc.next().charAt(0) == 'y') {
			System.out.println(s.information()); 
			sc.close();
		}
		else {
			sc.close();
		}
	}
	
}
