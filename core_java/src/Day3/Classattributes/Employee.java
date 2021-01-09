package Day3.Classattributes;

public class Employee {
	
	private String EmpName;
	private int EmpId;
	
	public Employee() {
		
	}
	
	public Employee(String empName, int empId) {
		super();
		EmpName = empName;
		EmpId = empId;
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int empId) {
		EmpId = empId;
	}

	@Override
	public String toString() {
		return "Employee [EmpName=" + EmpName + ", EmpId=" + EmpId + "]";
	}
	
	

}
