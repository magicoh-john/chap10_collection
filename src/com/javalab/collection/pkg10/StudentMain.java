package com.javalab.collection.pkg10;

import java.util.ArrayList;

public class StudentMain {

	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<Student>(); //타입설정 Student 객체만 저장 가능
		
		//[4] 값 추가(기존 값의 맨뒤에 추가됨)
		students.add(new Student("1234", "123456-1234567", "홍길동", 3, "천안", 210));
		students.add(new Student("5678", "987456-2334567", "김길동", 4, "대전", 220));
		students.add(new Student("8970", "357556-2334789", "이길동", 1, "서울", 230));
		
		for (Student student : students) {
			System.out.println(student.toString());
			
		}
	}

}
