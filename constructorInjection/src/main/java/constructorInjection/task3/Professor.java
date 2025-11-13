package constructorInjection.task3;

public class Professor {
	
	private String name;
	
	private String subject;

	public Professor(String name, String subject) {
		super();
		this.name = name;
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Pofessor [name=" + name + ", subject=" + subject + "]";
	}
	
	
	

}
