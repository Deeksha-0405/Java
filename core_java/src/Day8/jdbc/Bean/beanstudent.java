package Day8.jdbc.Bean;

public class beanstudent {
	private int studentroll;
	private String studentname;
	private String studentcourse;
	private int courseduration;
	private int studentage;
	
	public beanstudent()
	{
		
	}
	
	public int getStudentroll() {
		return studentroll;
	}
	public void setStudentroll(int studentroll) {
		this.studentroll = studentroll;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public String getStudentcourse() {
		return studentcourse;
	}
	public void setStudentcourse(String studentcourse) {
		this.studentcourse = studentcourse;
	}
	public int getCourseduration() {
		return courseduration;
	}
	public void setCourseduration(int courseduration) {
		this.courseduration = courseduration;
	}
	public int getStudentage() {
		return studentage;
	}
	public void setStudentage(int studentage) {
		this.studentage = studentage;
	}
	public beanstudent(int studentroll, String studentname, String studentcourse, int courseduration, int studentage) {
		super();
		this.studentroll = studentroll;
		this.studentname = studentname;
		this.studentcourse = studentcourse;
		this.courseduration = courseduration;
		this.studentage = studentage;
	}
	@Override
	public String toString() {
		return "beanstudent [studentroll=" + studentroll + ", studentname=" + studentname + ", studentcourse="
				+ studentcourse + ", courseduration=" + courseduration + ", studentage=" + studentage + "]";
	}
	

}
