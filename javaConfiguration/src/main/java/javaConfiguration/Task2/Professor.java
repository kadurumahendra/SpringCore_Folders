package javaConfiguration.Task2;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component("prof")
public class Professor {
	
	private int profId;
	
	private String profName;
	
	private String gender;
	
	@PostConstruct
	public void init()
	{
		System.out.println("Professor is newly added name is : "+profName);
	}
	
	@PreDestroy
	public void destroy()
	{
		System.out.println("professor is resigning from ur college");
	}

	@Override
	public String toString() {
		return "Professor [profId=" + profId + ", profName=" + profName + ", gender=" + gender + "]";
	}

	public Professor() {
		super();
	}

	public int getProfId() {
		return profId;
	}

	public void setProfId(int profId) {
		this.profId = profId;
	}

	public String getProfName() {
		return profName;
	}

	public void setProfName(String profName) {
		this.profName = profName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	

}
