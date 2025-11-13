package springCoreProperties.Task3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class Manager {
	
	@Value("${manager.managerName}")
	private String managerName;
	
	@Autowired
	private Menu menu;
	
	@PostConstruct
	public void init()
	{
		System.out.println("init method for Manager");
	}
	
	@PreDestroy
	public void destroy()
	{
		System.out.println("destroy method for Manager");
	}

	public Manager() {
		super();
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}

	@Override
	public String toString() {
		return "Manager [managerName=" + managerName + ", menu=" + menu + "]";
	}
	
	

}
