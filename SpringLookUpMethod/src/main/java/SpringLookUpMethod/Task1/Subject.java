package SpringLookUpMethod.Task1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("subjects")
@Scope("prototype")
public class Subject {
	
	@Value("${subject.subjectName}")
	private String SubjectName;
	
	@Value("${subject.code}")
	private String code;

	public Subject() {
		super();
	}

	public String getSubjectName() {
		return SubjectName;
	}

	public void setSubjectName(String subjectName) {
		SubjectName = subjectName;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Override
	public String toString() {
		return "Subject [SubjectName=" + SubjectName + ", code=" + code + "]";
	}
	
	
	
	
	

}
