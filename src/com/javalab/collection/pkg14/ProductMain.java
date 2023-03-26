package com.javalab.collection.pkg14;

import java.util.ArrayList;
import java.util.List;

/**
 * [기본데이터 raw data]
	new Product(1, "자전거", 250000); 
	new Product(2, "노트북", 1250000);
	new Product(3, "쌀", 150000);   
	new Product(4, "세탁기", 800000); 
	new Product(5, "시금치", 2500);   
	new Product(6, "대파", 10000);   
	new Product(7, "에어컨", 3500000);
	new Product(8, "쇼파", 3000000); 
	new Product(9, "우유", 2500);    
	new Product(10, "운동화", 600000);
 */
public class ProductMain {

	public static void main(String[] args) {

		// 데이터를 저장할 ArrayList 객체 생성
		List<Product> productList = new ArrayList<>();
		productList.add(new Product(1, "자전거", 250000));
		productList.add(new Product(2, "노트북", 1250000));
		productList.add(new Product(3, "쌀", 150000));
		productList.add(new Product(4, "세탁기", 800000));
		productList.add(new Product(5, "시금치", 2500));
		productList.add(new Product(6, "대파", 10000));
		productList.add(new Product(7, "에어컨", 3500000));
		productList.add(new Product(8, "쇼파", 3000000));
		productList.add(new Product(9, "우유", 2500));
		productList.add(new Product(10, "운동화", 600000));
		
		// 데이터를 생성해주는 객체 생성
		ProductData pd = new ProductData(); // Product 객체 10개 담을 수 있는 배열 선언하고 그 배열에 객를 만들어서 넣음
		Product[] products = pd.products;

		// [문제.1] 전체 상품 목록 출력
		for (Product product : products) {
			System.out.println(product.getId() + "\t" + product.getName() + "\t" + product.getPrice());
			// System.out.println(product.toString());
		}
		System.out.println();

		/**
		 * [문제.2] 세탁기의 가격을 조회하시오.
		 */
		String tempStr = "세탁기";
		int tempPrice = 0;
		for (Product p : products) {
			if (p.getName().equals(tempStr)) {
				tempPrice = p.getPrice();
			}
		}
		System.out.println("2. " + tempStr + " 제품의 가격은 " + tempPrice + "원입니다.");
		System.out.println("");

		/**
		 * [문제.3] 구매한 모든 제품의 총액과 평균 가격은 얼마입니까?
		 */
		int sum = 0;
		double avg = 0.0;

		// [문제.2] 구매 급액 합계 구하기
		sum = 0;
		for (int i = 0; i < products.length; i++) {
			sum = sum + pd.products[i].getPrice();
		}
		avg = (sum * 1.0) / products.length;
		System.out.printf("3. 구매하신 제품의 총액은 %d 원이며 평균 구매 가격은 %.2f 원입니다.\n", sum, avg);
		System.out.println("");

		/*
		 * [문제.3] 제품 중에서 100만원이 넘는 제품의 모든 정보(id, name, price)를 출력하시오.
		 */
		int count = 0;
		sum = 0;
		System.out.println("4. 100만원이 넘는 고가의 제품은 다음과 같습니다.\n");
		for (int i = 0; i < pd.products.length; i++) {
			if (pd.products[i].getPrice() >= 1000000) {
				System.out.println("--------------------------------------------------------");
				System.out.println(
						pd.products[i].getId() + "\t" + pd.products[i].getName() + "\t" + pd.products[i].getPrice());
				System.out.println(products[i].toString());
				sum += pd.products[i].getPrice(); // 100만원이 넘는 구매 제품의 금액 합산
				count++; // 100만원 넘는 구매 제품 갯수 합산
			}
		}

		System.out.println("--------------------------------------------------------");
		System.out.println();
		System.out.println("5. 100만원이 넘는 제품의 수량은 : " + count + "개 이며 합계 금액은 : " + sum + "입니다.");
	}

}
