package com.javalab.collection.pkg07;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class StudentCollectionMain {

	public static void main(String[] args) {

		// Data 생성		
		Student stu1 = new Student(1, "John", 87);
		Student stu2 = new Student(2, "Mary", 90);
		Student stu3 = new Student(3, "Bob", 85);
		
		// 1. ArrayList
		List<Student> studentList = new ArrayList<>();
		studentList.add(stu1);
		studentList.add(stu2);
		studentList.add(stu3);
		
		for (Student student : studentList) {
			System.out.println(student.getStudentId() + "\t" +student.getName() + "\t" + student.getScore());
		}
		System.out.println();
		
		// 2. HashSet(출력 순서 없음)
		Set<Student> studentSet = new HashSet<>();
		studentSet.add(stu1);
		studentSet.add(stu2);
		studentSet.add(stu3);
		studentSet.add(stu3);
		// 향상된 for문으로 출력
		for (Student student : studentSet) {
			System.out.println(student.toString());
		}
		System.out.println();
		
		// 반복자를 통한 출력
		Iterator<Student> iter = studentSet.iterator();
		while(iter.hasNext()){
			Student stu = iter.next();
			System.out.println(stu.getStudentId() + "\t" +stu.getName() + "\t" + stu.getScore());
		}
		System.out.println();
		
		// 3. HashMap<Key, Value>
		Map<Integer, Student> map = new HashMap<>();
		map.put(stu1.getStudentId(), stu1);
		map.put(stu2.getStudentId(), stu2);
		map.put(stu3.getStudentId(), stu3);
		for (Integer key : map.keySet()) {	// key를 담고 있는 Set반환
			System.out.println(map.get(key).getStudentId() + "\t" + map.get(key).getName()  + "\t" +  map.get(key).getScore());
		}
		System.out.println();
		
		Set<Integer> key = map.keySet();
		Iterator<Integer> sIter = key.iterator();
		while (sIter.hasNext()) {
			Integer k = sIter.next();	// key
			System.out.println(k + " - " + map.get(k).getStudentId() + "\t" + map.get(k).getName() + "\t" + map.get(k).getScore());
		}
		
	}

}