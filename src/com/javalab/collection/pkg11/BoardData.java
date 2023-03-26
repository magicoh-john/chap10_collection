package com.javalab.collection.pkg11;

import java.util.ArrayList;

public class BoardData {
	
	// 1. 멤버 변수
	// BoardMain과 패키지가 다르기 때문에 public으로 접근제한자를 낮춰줘야 함.
	public ArrayList<Board> boardList = new ArrayList<Board>();

	// 2. 기본생성자
	public BoardData() {
		this.initData();
	}

	// 3. 멤버변수에 값을 세팅해주는 메소드
	public void initData() {
//		this.boardList.add(new Board(11968, "2021 07 08 클래스연습데이터7 (student, takes)", "김광식", 25));
//		this.boardList.add(new Board(11967, "2021 07 08 클래스연습데이터5 (학과/학생)", "김정현", 62));
//		this.boardList.add(new Board(11965, "2021 07 07 클래스 연습 데이터 4 (부서/사원)", "김현정", 60));
//		this.boardList.add(new Board(11966, "2021 07 07 클래스 연습 데이터 4 ", "김성주", 34));
//		this.boardList.add(new Board(11964, "2021 07 07 클래스 연습 데이터 3 (도서) ", "이성주", 65));
//		this.boardList.add(new Board(11963, "2021 07 06 클래스 연습 데이터 2 (학생) ", "김현정", 44));
//		this.boardList.add(new Board(11962, "2021 07 06 클래스 연습 데이터 (교수) ", "백태성", 48));
//		this.boardList.add(new Board(11961, "2021 07 03 3가지 문제를 메서드 처리 ", "김광식", 58));
//		this.boardList.add(new Board(11960, "2021 07 03 split() 와 클래스 연습 데이터", "김정현", 54));
//		this.boardList.add(new Board(11959, "2021 07 02 마지막 3가지 문제 ", "박광수", 92));
//		this.boardList.add(new Board(11958, "2021 07 02 split test ", "김현정", 53));
//		this.boardList.add(new Board(11957, "2021 07 02 제어문 연습데이터 ", "김정현", 64));
//		this.boardList.add(new Board(11956, "코드를 엉망으로 작성하는 법 ", "박광수", 43));
//		this.boardList.add(new Board(11955, "유지 보수 어렵게 코딩하는 방법 ", "김광식", 59));
//		this.boardList.add(new Board(11954, "2021 07 01 Java Platform Standard Edition 8 Documentation ","Amor vincit omnia", 29));
//		this.boardList.add(new Board(11641, "2019 01 30 변수, 배열, 객체, 클래스 (기초 문법 간단 요약) ", "박광수", 91));
//		this.boardList.add(new Board(11640, "2019 01 30 변수, 배열, 객체, 클래스 (기초 문법 간단 요약) ", "김성주", 95));
//		this.boardList.add(new Board(11639, "2019 01 30 기본 지식 정리 ", "김성주", 70));
	}
}
