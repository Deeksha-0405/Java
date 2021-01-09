package Day2.Deekshaexample;

public class Example1 {
	
		
	public String[] Fname() {
		
		String[] firstname= {"Alex","Danial", "Cole", "Sam"};
		return firstname;
	}

   public String[] Lname() {
		
		String[] lastname= {"ais","ial", "le", "uam"};
		return lastname;
	}
   
   public void Display(String[] firstname, String[] lastname) {
		int n=firstname.length;
	    for(int i=0;i<n;i++) {
		   System.out.println("Full name : " +firstname[i]+ " " +lastname[i]);
	   }
			
	}
  
   
}
