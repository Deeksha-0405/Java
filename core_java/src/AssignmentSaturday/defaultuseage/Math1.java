package AssignmentSaturday.defaultuseage;

public interface Math1 {
	
	public abstract void add();
	 default void print()
	 {
		 System.out.println("It is default");
	 }


}
