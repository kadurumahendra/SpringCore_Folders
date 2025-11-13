package course;

public class Course {
    private String coursename;
    private String coursecode;

    public Course() {
        super();
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public String getCoursecode() {
        return coursecode;
    }

    public void setCoursecode(String coursecode) {
        this.coursecode = coursecode;
    }

    @Override
    public String toString() {
        return "Course [coursename=" + coursename + ", coursecode=" + coursecode + "]";
    }
}
