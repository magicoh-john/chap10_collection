package com.javalab.collection.pkg15;

import java.util.ArrayList;
import java.util.List;

/**
 * 실행클래스
 * 
 */
public class BookMain {

	public static void main(String[] args) {

		// Book 객체를 생성해서 저장할 전담 객체 생성
		BookData bd = new BookData();	
		
		// 데이터 보관 전담 객체에서 ArrayList 갖고오기
		List<Book> bookList = bd.bookList;
		
		System.out.println("저장된 Book 데이터의 갯수는 : " + bookList.size() + "개입니다.");
		System.out.println();
		
		//1. 전체 책 리스트를 출력하는 메소드를 만드세요.(출력은 게터메소드로)
		System.out.println("[1]. 전체 책 목록");
		printAllBooks(bookList);
		System.out.println();
		System.out.println();
		
		//2. 책의 저자를 파라미터로 넘겨주면 해당 책을 찾아서 ArrayList로 반환해주는 메소드를 만드세요.
		System.out.println("[2]. 특정 저자가 쓴 책 목록 조회");
		String writer = ""; // 저자명 저장용 변수
		writer = "양용석";
		List<Book> bookList2 = getBookByWriter(bookList, writer);
		for (Book book : bookList2) {
			System.out.println(book.getTitle() + "\t" + book.getAuthor() + "\t" + book.getPress() + "\t" + book.getPrice() + "\t" + book.getDc());
		}
			

		
		
		/*

		
		System.out.println("[3]. 한빛미디어에서 출판한 모든 책의 리스트를 출력하시오");
		//3. 한빛미디어에서 출판한 모든 책의 리스트를 출력하시오.		
		for (Book book : bd.books) {
			if(book.getPress().contains("한빛미디어")) {
				System.out.println(book.getTitle() + "\t" + book.getAuthor() + "\t" + book.getPress() + "\t" + book.getPrice() + "\t" + book.getDc());
			}
		}
		System.out.println("[4]. 전체 책 가격을 합산하세요.");
		int totalPrice = 0;
		for (Book b : bd.books) {
			totalPrice = totalPrice + b.getPrice();
		}
		System.out.println("전체 책의 합계 금액은 : " + totalPrice);
	*/
	}

	/**
	 * 저자를 전달받아서 해당 저자가 쓴 책을 찾아서 ArrayList로 반환해주는 메소드
	 * @param bookList
	 * @param writer
	 * @return
	 */
	private static List<Book> getBookByWriter(List<Book> bookList, String writer) {
		List<Book> bookList2 = new ArrayList<Book>();
		for (Book book : bookList) {	
			if(book.getAuthor().equals(writer)) {
				bookList2.add(book);
			}
		}		
		return bookList2;
	}

	/**
	 * 모든 책 목록을 출력해주는 메소드
	 * @param bookList
	 */
	private static void printAllBooks(List<Book> bookList) {
		for (Book book : bookList) {	// BookData객체의 멤버 변수인 books
			System.out.println(book.getTitle() + "\t" + book.getAuthor() + "\t" + book.getPress() + "\t" + book.getPrice() + "\t" + book.getDc());
		}
		
	}
}