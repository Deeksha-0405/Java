package Day3.Classattributes;

public class TestEmployee {

	public static void main(String[] args) {
		Employee employee=new Employee();
		System.out.println(employee.getEmpName());
		System.out.println(employee.getEmpId());
		
		employee.setEmpId(12320);
		employee.setEmpName("Gargi");
		
		System.out.println(employee.getEmpName());
		System.out.println(employee.getEmpId());
		
		System.out.println("Creating parametrise one: ");
		Employee employee1 = new Employee("David",2320);
		
		System.out.println(employee1.getEmpName());
		System.out.println(employee1.getEmpId());
		
		// impliment ToString method in Employee class
		
		System.out.println(employee1);
	}
	
}
