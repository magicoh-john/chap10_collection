package com.javalab.collection.pkg12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * main()메소드를 간결하게 하기 위해서 모듈화 시행
 *  - 모든 로직을 메소드로 분리함.
 */
public class StudentCollectionMain {

	public static void main(String[] args) {

		// Data 생성		
		Student stu1 = new Student(1, "John", 87);
		Student stu2 = new Student(2, "Mary", 90);
		Student stu3 = new Student(3, "Bob", 85);
		
		// ArrayList 컬렉션 객체 생성 및 학생 객체 저장(add)
		List<Student> studentList = new ArrayList<>();
		studentList.add(stu1);
		studentList.add(stu2);
		studentList.add(stu3);
		//studentList.add(stu3); // 중복되어도 들어감
		
		// 1. ArrayLIst를 전달해서 출력해주는 메소드 호출
		System.out.println("1. ArrayLIst를 전달해서 출력해주는 메소드 호출");
		printStudent(studentList);
		System.out.println();
		System.out.println();
		
		// 2. HashSet 컬렉션 객체 생성 및 학생 객체 저장(출력 순서 없음)
		Set<Student> studentSet = new HashSet<>();
		studentSet.add(stu1);
		studentSet.add(stu2);
		studentSet.add(stu3); //stu3 == stu3
		studentSet.add(stu3); //추가 안됨(Object의 hascode(), equals()) 사용
		//Object의 hascode(), equals()) @Override하면 추가 안됨(안하면 추가되버림)
		studentSet.add(new Student(3, "Bob", 85)); 

		System.out.println("2. HashSet을 전달해서 출력해주는 메소드 호출");
		printSetStudent(studentSet);
		System.out.println();
		System.out.println();
		
		// 3. HashMap<Key, Value> 컬렉션 객체 생성 및 학생 객체 저장
		Map<Integer, Student> map = new HashMap<>();
		map.put(stu1.getStudentId(), stu1);
		map.put(stu2.getStudentId(), stu2);
		map.put(stu3.getStudentId(), stu3);
		map.put(stu3.getStudentId(), stu3); // 안들어감 왜냐하면 getStudentId()의 반환값이 Integer로 그 안에 hashcode()와 equals()구현되어 있음.
		
		System.out.println("3. HashMap를 전달해서 출력해주는 메소드 호출");
		printMapStudent(map);
		System.out.println();
		
		// 4. Student 객체를 key Object로 넣을 경우에는 hashcode(), equals()를 재정의해야함.
		Map<Student, Student> map2 = new HashMap<>();
		map2.put(stu1, stu1);
		map2.put(stu2, stu2);
		map2.put(stu3, stu3);
		// Student클래스에 hashcode()와 equals()를 구현하면 저장 안됨.
		// 구현 안하면 중복으로 저장되버림
		map2.put(stu3, stu3); 
		for (Student student : studentSet) {
			System.out.println(student);			
		}
	} // end main

	//HashMap을 전달받아서 출력하는 메소드
	private static void printMapStudent(Map<Integer, Student> map) {
		// 방법.1
		for (Integer key : map.keySet()) {	// key를 담고 있는 Set반환
			System.out.println(map.get(key).getStudentId() + "\t" + map.get(key).getName()  + "\t" +  map.get(key).getScore());
		}
		
		// 방법.2
		Set<Integer> key = map.keySet();
		Iterator<Integer> sIter = key.iterator();
		while (sIter.hasNext()) {
			Integer k = sIter.next();	// key
			System.out.println(k + " - " + map.get(k).getStudentId() + "\t" + map.get(k).getName() + "\t" + map.get(k).getScore());
		}
		
	}

	//HashSet을 전달받아서 출력하는 메소드
	private static void printSetStudent(Set<Student> studentSet) {
		// 1. 향상된 for문으로 출력
		for (Student student : studentSet) {
			System.out.println(student.toString());
		}		
		
		// 2. 반복자를 통한 출력
		/*
		Iterator<Student> iter = studentSet.iterator();
		while(iter.hasNext()){
			Student stu = iter.next();
			System.out.println(stu.getStudentId() + "\t" +stu.getName() + "\t" + stu.getScore());
		}
		*/		
	}

	// ArrayList를 전달받아서 출력하는 메소드
	private static void printStudent(List<Student> studentList) {
		for (Student student : studentList) {
			System.out.println(student.getStudentId() + "\t" +student.getName() + "\t" + student.getScore());
		}
		
	}

}