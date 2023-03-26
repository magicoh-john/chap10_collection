package com.javalab.collection.pkg14;

/**
 * [역할] 데이터 생성/저장 전담 클래스
 * 본 클래스는 Product 클래스를 객체로 만들어서 여러개를 담고 있기 위해서 임시로 필요한 클래스이다.
 * Product 객체 10개 담을 수 있는 배열 선언한다. 이 배열은 인스턴스 변수이다.
 * 이 배열은 전역변수로서 이 클래스를 객체화 한 다음에 "객체.배열이름"으로 다른 클래스에서 접근할 수 있다.
 * 기본 생성자에서  객체 10개를 만들어서 각각의 배열에 저장한다.
 */
public class ProductData {
	//멤버 변수(전역변수)
	//객체 배열(객체 10개 담을수 있는)을 멤버 변수로 갖고 있음.
	//객체가 생성되면서 메모리 공간 확보, 생성자에 의해서 초기화됨
	public Product[] products = new Product[10];	

	// 기본 생성자
	public ProductData() {
		products[0] = new Product(1, "자전거", 250000);
		products[1] = new Product(2, "노트북", 1250000);
		products[2] = new Product(3, "쌀", 150000);
		products[3] = new Product(4, "세탁기", 800000);
		products[4] = new Product(5, "시금치", 2500);
		products[5] = new Product(6, "대파", 10000);
		products[6] = new Product(7, "에어컨", 3500000);
		products[7] = new Product(8, "쇼파", 3000000);
		products[8] = new Product(9, "우유", 2500);
		products[9] = new Product(10, "운동화", 600000);
	}
}