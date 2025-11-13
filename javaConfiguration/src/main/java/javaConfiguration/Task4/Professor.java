package javaConfiguration.Task4;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class Professor {
	
	private String profName;
	
	private String subject;
	
	@PostConstruct
	public void init()
	{
		System.out.println("Professor details: Name = Dr. " +profName+", Subject = " +subject);
	}
	
	@PreDestroy
	
	public void destroy()
	{
		System.out.println("Professor bean destroyed");
	}

	public Professor() {
		super();
	}

	public String getProfName() {
		return profName;
	}

	public void setProfName(String profName) {
		this.profName = profName;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Professor [profName=" + profName + ", subject=" + subject + "]";
	}
	
	
	
	
	

}
