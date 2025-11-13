package springLifeCycle.libraryManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component("library")
public class Library {
	
	@Value("City Central library")
	private String libraryName;
	
	@Autowired
	private Book book;
	
	@PostConstruct
	public void libraryadded()
	{
		System.out.println("library added: " + libraryName);
		
	}
	
	
	@PreDestroy
	public void libraryremoved()
	{
		System.out.println("Library closed: " +libraryName);
	}


	public Library() {
		super();
	}


	@Override
	public String toString() {
		return "Library [libraryName=" + libraryName + ", book=" + book + "]";
	}
	
	

}
