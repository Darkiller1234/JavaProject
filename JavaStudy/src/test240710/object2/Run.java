package test240710.object2;

import java.util.Scanner;

import com.kh.example.practice2.model.vo.Product;

public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Product a = new Product();
		System.out.print("제품이름 : ");
		a.setBrand(sc.nextLine());
		System.out.print("제품가격 : ");
		a.setPrice(sc.nextInt());
		sc.nextLine();
		System.out.print("제품브랜드 : ");
		a.setpName(sc.nextLine());
		
		a.information();
		
		Product b = new Product("끼얏호우", 5000, "윤대한");
		b.information();
		sc.close();
		
		Product c = new Product();
		c.information();
	}
}
