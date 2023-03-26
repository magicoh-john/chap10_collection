package com.javalab.collection.pkg16;
/**
 * Person 클래스를 상속한 학생  클래스(하위클래스)
 */
public class Student extends Person {
    private String studentId;
    
    public Student(String name, int age, String email, String department, String studentId) {
        super(name, age, email, department);
        this.studentId = studentId;
    }
    
    public String getStudentId() {
        return studentId;
    }
    
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	@Override
	public String toString() {
		return this.getName() + "\t" + this.getAge() + "\t" + this.getEmail() + "\t" + this.getDepartment() + "\t" + this.studentId;
	}


}