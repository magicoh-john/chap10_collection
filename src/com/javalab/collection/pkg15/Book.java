package com.javalab.collection.pkg15;

/**
 * Book (도메인)클래스, VO(Value Object)클래스
 */
public class Book {
	// 필드
	private String title;  	// 제목
	private String author; 	// 저자
	private String press;	// 출판사
	private int price;		// 가격
	private int dc;			// 할인율
	
	// 기본 생성자
	public Book() {
	}
	
	// 오버로딩 생성자
	public Book(String title, String author, String press, int price, int dc) {
		this.title = title;
		this.author = author;
		this.press = press;
		this.price = price;
		this.dc = dc;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPress() {
		return press;
	}
	public void setPress(String press) {
		this.press = press;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getDc() {
		return dc;
	}
	public void setDc(int dc) {
		this.dc = dc;
	}
	
	@Override
	public String toString() {
		return title + "\t" + author + "\t" + press + "\t" + price + "\t" + dc;
	}
	
}
