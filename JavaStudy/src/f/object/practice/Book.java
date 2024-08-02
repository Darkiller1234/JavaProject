package f.object.practice;

public class Book {
	String name = "미정";
	String writer = "";
	int price = -1;
	String publisher = "";
	String pubDate = "";
	int stock = 0;
	int pages = 0;
	String category = "";
	public void info() {
		System.out.println("제목 : " + name);
		System.out.println("저자 : " + writer);
		System.out.println("장르 : " + category);
		System.out.println("출판사 : " + publisher);
		System.out.println("가격 : " + price);
		System.out.println("발행 : " + pubDate);
		System.out.println("재고 : " + stock);
		System.out.println("쪽수 : " + pages);

	}
	public void firstSetting(String str1, String str2, String str3, String str4, String str5, int num1, int num2, int num3) {
		name = str1;
		writer = str2;
		category = str3;
		publisher = str4;
		pubDate = str5;
		price = num1;
		stock = num2;
		pages = num3;
	}
	public Object bookModify(int index, String str) {
		return index+str;
	}
}
