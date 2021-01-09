package Day3.Beans;

public class Student {

	private int rollNo;
	private String studentName;
	private String course;
	
	public Student() {
		
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
	
	public Student(int rollNo, String studentName, String course) {
		super();
		this.rollNo = rollNo;
		this.studentName = studentName;
		this.course = course;
	}

	
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", studentName=" + studentName + ", course=" + course + "]";
	}
	
	
}
