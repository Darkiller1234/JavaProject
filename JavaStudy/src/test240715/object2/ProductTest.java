package test240715.object2;

import java.util.Scanner;

public class ProductTest {
	public static void main(String[] args) {
		String name;
		int price, quantity;
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("상품명 : ");
		name = sc.nextLine();
		System.out.print("가격 : ");
		price = sc.nextInt();
		sc.nextLine();
		System.out.print("수량 : ");
		quantity = sc.nextInt();
		sc.nextLine();
		
		Product pd = new Product(name,price,quantity);
		System.out.println(pd.information());
		System.out.println("총 구매 가격 : " + pd.getPrice()*pd.getQuantity() + " 원");
		
		sc.close();
	}	
}
