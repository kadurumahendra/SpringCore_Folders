package javaConfiguration.Task4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component("department")
public class Department {
	
	private String department;
	
	private int professors;
	
	@Autowired
	private Professor professor;
	
	@PostConstruct
	public void init()
	{
		System.out.println("Department details: Name = Dr. " +department+", Total Professors = " +professors);
	}
	
	@PreDestroy
	
	public void destroy()
	{
		System.out.println("Department bean destroyed");
	}

	public Department() {
		super();
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getProfessors() {
		return professors;
	}

	public void setProfessors(int professors) {
		this.professors = professors;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	@Override
	public String toString() {
		return "Department [department=" + department + ", professors=" + professors + ", professor=" + professor + "]";
	}
	
	

}
