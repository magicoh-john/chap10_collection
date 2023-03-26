package com.javalab.collection.pkg07_01;

/**
 * 박스 객체를 사용할 실행클래스
 */
public class HashMapMain {

	public static void main(String[] args) {
		// 1. 과일 객체 생성
		Fruit apple = new Fruit("Apple", 3000);
		Fruit banna = new Fruit("Banna", 3500);
		Fruit orange = new Fruit("Orange", 4000);
		
		// 2. 과일 객체를 담을 박스 객체 생성
		Box<Fruit> box = new Box<>(); // 과일을 담을 제네릭 클래스 Box 객체 생성
		box.addItem(apple); // 박스 객체에 과일 추가
		box.addItem(banna);
		box.addItem(orange);
		
		// 3. 박스의 내용 확인
		for (Fruit fruit : box.getItems()) {
			System.out.println(fruit.getName() + "\t" + fruit.getPrice());
		}		
		System.out.println();
		
		// 4. 야채 객체 생성
		Vegitable 시금치 = new Vegitable("시금치", 1500);
		Vegitable 양배추 = new Vegitable("양배추", 2500);
		Vegitable 대파 = new Vegitable("대파", 3500);
		
		// 5. 야채를 담을 박스 객체 생성
		Box<Vegitable> vBox = new Box<>();
		vBox.addItem(시금치);
		vBox.addItem(양배추);
		vBox.addItem(대파);
		
		// 6. 박스에서 야채 조회/출력
		for (Vegitable vegitable : vBox.getItems()) {
			System.out.println(vegitable.getName() + "\t" + vegitable.getPrice());
			//System.out.println(vegitable.toString());
		}		
		
	}
}
