package com.javalab.collection.pkg06;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {
		//Map 컬렉션 생성
		Map<String, Integer> map = new HashMap< >();

		//객체 저장
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95);
		
		System.out.println("총 Entry 수: " + map.size());
		System.out.println();

		//키로 값 얻기
		String key = "홍길동";
		int value = map.get(key);
		System.out.println(key + ": " + value);
		System.out.println();

		//키 Set 컬렉션을 얻고, 반복해서 키와 값을 얻기
		Set<String> keySet = map.keySet(); //모든 키를 Set 컬렉션에 담아서 반환
		Iterator<String> keyIterator = keySet.iterator(); // keySet.iterator() 반복자 리턴
		System.out.println("keyIterator.getClass().getSimpleName() : " + keyIterator.getClass().getSimpleName());
		while (keyIterator.hasNext()) {
			String k = keyIterator.next();	// k의 type은 String(이름) k:신용권
			Integer v = map.get(k);	// 점수 80
			System.out.println(k + " : " + v);
		}
		System.out.println("----------------");

		for (String name : map.keySet()) {
            System.out.println(name + " - " + map.get(name));
        }
		
		
		//키로 엔트리 삭제
		Integer score = map.remove("홍길동"); // 삭제된 키와 매핑되는 값을 반환
		System.out.println("score : " + score);
		System.out.println("총 Entry 수: " + map.size());
		System.out.println();
	}
}