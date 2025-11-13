package springCoreProperties.Task3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;



@Component
public class Menu {
	
	@Value("${menu.menu}")
	private String menu;
	
	
	@PostConstruct
	public void init()
	{
		System.out.println("init method for menu");
	}
	
	@PreDestroy
	public void destroy()
	{
		System.out.println("destroy method for menu");
	}

	public Menu() {
		super();
	}

	public String getMenu() {
		return menu;
	}

	public void setMenu(String menu) {
		this.menu = menu;
	}

	@Override
	public String toString() {
		return "Menu [menu=" + menu + "]";
	}
	
	

}
