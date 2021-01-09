package Day4.JavaDate;
import java.time.*;
import java.time.format.DateTimeFormatter;
public class Example2 {
	
	// date formatter
	
	public static void main(String[] args) {
		
		LocalDateTime myDateObj = LocalDateTime.now();
		System.out.println("Before formatting: " + myDateObj);
		
		
			
		DateTimeFormatter my = DateTimeFormatter.ofPattern("dd-mm-yyyy hh:mm:ss");
		
		String format = myDateObj.format(my);
		
		System.out.println(format);
	}

}
