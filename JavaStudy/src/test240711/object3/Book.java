package test240711.object3;

public class Book {
	private String title;
	private String genre;
	private String author;
	private int bookNum;
	public Book(String title, String genre, String author, int bookNum) {
		super();
		this.title = title;
		this.genre = genre;
		this.author = author;
		this.bookNum = bookNum;
	}
	public Book() {
		super();
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getBookNum() {
		return bookNum;
	}
	public void setBookNum(int bookNum) {
		this.bookNum = bookNum;
	}
	
	
	public String toString() {
		return "제목 : " + this.title + "\n장르 : " + this.genre + "\n저자 : " + this.author + "\n번호 : " + this.bookNum;
	}
}
