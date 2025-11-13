package springCoreProperties.Task4;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Teacher {

	@Value("${teacher.teacherId}")
	private int teacherId;
	
	@Value("${teacher.teacherName}")
	private String teacherName;
	
	@Value("${teacher.experince}")
	private int experince;

	public Teacher() {
		super();
	}

	public int getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
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

	@Override
	public String toString() {
		return "Teacher [teacherId=" + teacherId + ", teacherName=" + teacherName + ", experince=" + experince + "]";
	}
	
	
}
