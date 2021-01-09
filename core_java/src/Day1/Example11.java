package Day1;

public class Example11 {
	public static void main(String[] args) {
		int fees= 10000;
		int semister=4;
		System.out.println("Semister : " + semister + " Of Degree B.E-Computer");
		
		switch(semister)
		{
		case 1:
		{
			System.out.println("Teacher: Ms.Smith\nSubjects: Maths I, Maths II, Chemistry, Physics ");
			break;
		}
		case 2:
		{
			System.out.println("Teacher: Ms.Shardha\nSubjects: OOP, DSA, ADS, ISEE ");
			break;
		}
		case 3:
		{
			System.out.println("Teacher: Mr.Neel\nSubjects: DBMS, C&N, SCOA, SAD ");
			break;
		}
		case 4:
		{
			System.out.println("Teacher: Mr.Josh\nSubjects: HCL, LAB 1, LAB 2  ");
			break;
		}
		default:
		{
			System.out.println("Invalid Input");
		}
		}
		
		if(semister==1)
		{
			System.out.println("Fees:" + Math.multiplyExact(fees, semister));
		}
		else if(semister==2)
		{
			System.out.println("Fees:" + Math.multiplyExact(fees, semister));
		}
		else if(semister==3)
		{
			System.out.println("Fees:" + Math.multiplyExact(fees, semister));
		}
		else
		{
			System.out.println("Fees:" + Math.multiplyExact(fees, semister));
		}
	}

}
