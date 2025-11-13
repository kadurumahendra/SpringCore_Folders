package javaConfiguration.Task3;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component("dept")
public class Department {
	
	public String dept;
	
	public int seminars;
	
	
	@PostConstruct
	public void init()
	{
		System.out.println("department of company is :"+dept);
	}
	
	@PreDestroy
	
	public void destroy()
	{
		System.out.println("dept of this company is destroyed "+dept);
	}
	
	public void meth1()
	{
		System.out.println("dept name is : "+dept+ "and seminars will attend the "+seminars);
	}
	
	

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getSeminars() {
		return seminars;
	}

	public void setSeminars(int seminars) {
		this.seminars = seminars;
	}

	public Department() {
		super();
	}

	@Override
	public String toString() {
		return "Department [dept=" + dept + ", seminars=" + seminars + "]";
	}

	

}
