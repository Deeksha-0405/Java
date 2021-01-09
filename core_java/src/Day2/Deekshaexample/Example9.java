package Day2.Deekshaexample;

public class Example9 {

	public String[] country() {
				String[] country1= {"India", "Uk","USA","Africa"};
				for(int i=0;i<country1.length;i++) {
				System.out.println(country1[i]);
				}
				return country1;
	}
	
	public String[] India() {
		
		System.out.println("Welcome!!!!");
		String[] Ename= {"Arjun","Dev","lisa","Careen"};
		int[] Eid= {201,202,203,204};
		for(int i=0;i<Ename.length;i++) {
		System.out.println("Employee Name : " +Ename[i]+ " || Employee ID : " +Eid[i]);
		}
		System.out.println("Helpline: 100");
		return Ename;
	}
	
	// same as USA,UK and Africa
}
