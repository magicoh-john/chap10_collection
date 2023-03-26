package com.javalab.collection.pkg10;

import java.util.ArrayList;

public class ArrayListMain {

	public static void main(String[] args) {
		// 1. 자료 생성
		ArrayList<Integer> intArrayList = new ArrayList<Integer>();		
		for (int i = 0; i < 10; i++) {
			intArrayList.add(i);
		}
		// 출력
		for (int i = 0; i < intArrayList.size(); i++) {
			System.out.print(intArrayList.get(i) + "\t");
		}
		System.out.println();
		
		// 2. String type 객체 생성해서 ArrayList에 저장
		ArrayList<String> carList = new ArrayList<String>();
		carList.add("Volvo");
		carList.add("Benz");
		carList.add("BMW");
		carList.add("Hyundai");
		for (String str : carList) {
			System.out.println(str);
			
		}
	}
}
