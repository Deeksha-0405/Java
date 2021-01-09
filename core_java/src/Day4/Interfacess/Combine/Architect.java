package Day4.Interfacess.Combine;

public class Architect extends Human implements Mathgeni, Artist{

	@Override
	public void draw() {
		System.out.println("Draw...");
		
	}

	@Override
	public void math() {
		System.out.println("Math....");
		
	}

	
	
}
