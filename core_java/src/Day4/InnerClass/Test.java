package Day4.InnerClass;

import Day4.InnerClass.Outerclass.Innerclass;

public class Test {
	
	public static void main(String[] args) {
		
		Outerclass outerclass = new Outerclass();
		System.out.println(outerclass.x);
		
		Innerclass innerclass = outerclass.new Innerclass();
		System.out.println(innerclass.y);
	}

}
