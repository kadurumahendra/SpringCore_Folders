package javaConfiguration.Task3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
@Component
public class Company {
	
	private int regId;
	
	private String name;
	
	private int year;
	
	@Autowired
	private Department dept;
	
	@PostConstruct
	public void init()
	{
		System.out.println("company name is : "+name + "established in "+year+"under this id : "+regId);
	}

	@PreDestroy
	public void destroy()
	{
		System.out.println("company name : "+name + "is destroyed");
	}
	
	public void meth1()
	{
		System.out.println("Good company is : "+name+ " it is in good ratings");
	}

	public Company() {
		super();
	}

	public int getRegId() {
		return regId;
	}

	public void setRegId(int regId) {
		this.regId = regId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Company [regId=" + regId + ", name=" + name + ", year=" + year + ", dept=" + dept + "]";
	}
	
	
	
	
	
	

}
