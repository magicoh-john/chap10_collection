package com.javalab.collection.pkg16;
/**
 * Person 클래스를 상속한 교수 클래스(하위클래스)
 */
public class Professor extends Person {
	private String professorId;

	public Professor(String name, int age, String email, String department, String professorId) {
		super(name, age, email, department);
		this.professorId = professorId;
	}

	public String getProfessorId() {
		return professorId;
	}

	public void setProfessorId(String professorId) {
		this.professorId = professorId;
	}

	@Override
	public String toString() {
		return this.getName() + "\t" + this.getAge() + "\t" + this.getEmail() + "\t" + this.getDepartment() + "\t" + this.professorId;
	}


}