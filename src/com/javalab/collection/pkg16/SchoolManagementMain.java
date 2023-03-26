package com.javalab.collection.pkg16;

import java.util.ArrayList;
import java.util.List;

public class SchoolManagementMain {
	public static void main(String[] args) {

	    // raw data를 가공해서 저장할 부모 타입 Array 선언
	    
		List<Person> personList = new ArrayList<>();
	    
		// ArrayList에 학생과 교수 정보 저장
		personList.add(new Student("김보희", 20, "alice@example.com", "컴퓨터공학과", "72345678"));
		personList.add(new Student("미정이", 19, "bob@hotmail.com", "문헌정보학과", "87654321"));
		personList.add(new Student("채필립", 22, "marine@google.com", "영문학과", "6587658"));
		personList.add(new Professor("김명룡", 45, "charlie@example.com", "문헌정보학과", "13265872"));
		personList.add(new Professor("이덕임", 50, "diana@example.com", "컴퓨터공학과", "23456789"));
		
		// 1. 교수와 학생 목록 출력
		printAllPersons(personList);
		
		Person[] persons = new Person[5];
	    persons[0] = new Student("김보희", 20, "alice@example.com", "컴퓨터공학과", "72345678");
	    persons[1] = new Student("미정이", 19, "bob@hotmail.com", "문헌정보학과", "87654321");
	    persons[2] = new Student("채필립", 22, "marine@google.com", "영문학과", "6587658");
	    persons[3] = new Professor("김명룡", 45, "charlie@example.com", "문헌정보학과", "13265872");
	    persons[4] = new Professor("이덕임", 50, "diana@example.com", "컴퓨터공학과", "23456789");
	    
	    // 다형성을 이용하여 학생과 교수 정보 출력
	    System.out.println("============학생 & 교수===========");
	    for (Person person : persons) {
	        person.toString();
	        System.out.println("------------------------------");
	    }
	    System.out.println("===============================");
	}

	private static void printAllPersons(List<Person> personList) {
		for (Person person : personList) {
			person.toString();
			
		}
		
	}
}