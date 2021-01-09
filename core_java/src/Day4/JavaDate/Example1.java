package Day4.JavaDate;
import java.time.*;

public class Example1 {

	public static void main(String[] args) {
	LocalDate localDate = LocalDate.now();
	System.out.println(localDate);
	
	LocalTime localTime = LocalTime.now();
	System.out.println(localTime);
	
	//Date as well as time
	
		LocalDateTime localdatetime= LocalDateTime.now();
		System.out.println(localdatetime);
	
	}
	
	
}
