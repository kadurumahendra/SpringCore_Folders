package course;

public class Student {
    private int studentid;
    private String studentname;
    private Course course; // Has-A relationship

    public Student() {
        super();
    }

    public int getStudentid() {
        return studentid;
    }

    public void setStudentid(int studentid) {
        this.studentid = studentid;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student [studentid=" + studentid + ", studentname=" + studentname + ", course=" + course + "]";
    }
}
