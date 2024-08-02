package f.object.ex3;

public class Book {
	/*
	 * 접근제한자 : 해당구조에 접근할 수 있는 범위를 제한한다.
	 * public > protected > default > private
	 * 
	 * 클래스에 사용 가능한 접근제한자
	 * default, public
	 * 
	 * 필드와 메소드에 사용할 수 있는 접근제한자 4가지
	 * public : 어디서든(같은패키지, 다른패키지 모두) 접근 가능
	 * protected : 같은패키지 + 다른패키지일 경우 상속관계에서만 접근가능
	 * default : 같은패키지일때만 접근가능
	 * private : 오직 해당 클래스에서만 가능
	 */
	//필드
	private String title;
	private String genre;
	private String author;
	private int maxPage;
	
	//매소드
	public String toString() {
		/*
		 * this -> 인스턴스 객체(메모리를 사용중인 객체) 자기 자신을 의미
		 * 1. 자기 자신의 메모리를 가르킨다.
		 * 2. 생성자에서 다른 생성자를 호출할 수 있다.
		 * 3. 자기 자신의 주소를 반환할 수 있다.
		 */
		return "제목 : " + this.title + "\n장르 : " + this.genre + "\n저자 : " 
		 + this.author + "\n페이지수 : " + this.maxPage;
	}
	
//	public void init(String title, String genre, String author, int maxPage) {
//		this.title = title;
//		this.genre = genre;
//		this.author = author;
//		this.maxPage = maxPage;
//	}
	/*
	 * 생성자
	 * - 클래스의 이름과 동일한 매소드로 반환형이 없다
	 * - 필드 데이터의 초기화를 위한 특수목적의 메소드이다.
	 * - 매개변수가 하나도 없는 생성자를 기본생성자
	 * 
	 * - 생성자를 개발자가 직접 만들지 않는다면 컴파일러는 기본생성자를 만들어준다.
	 * - 개발자가 직접 생성자를 작성하면 기본생성자를 만들어주지 않는다.
	 * - 매소드의 매개변수의 갯수 똔느 타입에 따라서 메소드를 구분하는 메소드 오버로딩은 생성자에도 적용이 된다.
	 * 
	 */
	public Book() {
		System.out.println("기본생성자 호출");
	}
	public Book(String title, String genre, String author) {
		this.title = title;
		this.genre = genre;
		this.author = author;
	}
	public Book(String title, String genre, String author, int maxPage) {
		this.title = title;
		this.genre = genre;
		this.author = author;
		this.maxPage = maxPage;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return this.title;
	}
}
