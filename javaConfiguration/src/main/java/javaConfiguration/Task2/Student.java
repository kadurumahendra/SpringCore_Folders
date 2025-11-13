package javaConfiguration.Task2;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class Student {
	
	private int rollNo;
	
	private String name;
	
	private String courseCode;
	
	private int marks;
	
	private char grade;
	
	@Autowired
	private Professor professor;
	
	@PostConstruct
	public void init()
	{
		System.out.println("student name is : "+name+" is activated" );
		
	}
	
	@PreDestroy
	public void destroy()
	{
		System.out.println("Student name is : "+ name + "is de activated");
	}
	
	
	//functional methods
	
	public void meth1()
	{
		System.out.println("Student name is : "+name+" marks is : "+marks);
	}
	
	public void meth2()
	{
		System.out.println("Student roll no is : "+rollNo+ " is already on course "+ courseCode+ "i am attending this code");
	}

	public Student() {
		super();
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", courseCode=" + courseCode + ", marks=" + marks
				+ ", grade=" + grade + ", professor=" + professor + "]";
	}
	

}
