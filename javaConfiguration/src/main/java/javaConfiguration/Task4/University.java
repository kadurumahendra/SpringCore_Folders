package javaConfiguration.Task4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
@Component("university")
public class University {
	
	private String univName;
	
	private int year;
	
	@Autowired

	private Department dept;
	
	@PostConstruct
	public void init()
	{
		System.out.println("University details: Name =  " +univName+", Estalished = " +year);
	}
	
	@PreDestroy
	
	public void destroy()
	{
		System.out.println("University bean destroyed");
	}
	
	
	public void meth1(int stars)
	{
		
		System.out.println("it is university ratings: "+stars);
	}

	public University() {
		super();
	}

	public String getUnivName() {
		return univName;
	}

	public void setUnivName(String univName) {
		this.univName = univName;
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
		return "University [univName=" + univName + ", year=" + year + ", dept=" + dept + "]";
	}
	
	
	

}
