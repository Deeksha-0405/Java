package Day3.Polymorphisum;

public class TestCanteen {

	public static void main(String[] args) {
		
		Canteen can = new Canteen();
		
		can.food();
		
		CanteenA can1 = new CanteenA();
		 can1.food();
		 can1.Bill(24,25);
	}
}
