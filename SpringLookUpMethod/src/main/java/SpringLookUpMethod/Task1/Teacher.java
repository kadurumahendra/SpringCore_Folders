package SpringLookUpMethod.Task1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("teachers")
@Scope("prototype")
public class Teacher {
	@Value("${teacher.teacherName}")
	private String teacherName;
	
	@Value("${teacher.experince}")
	private int experince;
	
	@Autowired
	private Subject subject;
	
	
	public Subject newsubject()
	{
		return null;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public int getExperince() {
		return experince;
	}

	public void setExperince(int experince) {
		this.experince = experince;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public Teacher() {
		subject = newsubject();
	}

	
	@Override
	public String toString() {
		return "Teacher [teacherName=" + teacherName + ", experince=" + experince + ", subject=" + subject + "]";
	}
	
	
	
	

}
