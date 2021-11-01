package JavaClass5;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTimeImport {
	
	public static void main(String[] args) {
		
		// Creating instance of LocalDate class
        // using now() method
		LocalDate presentDate =LocalDate.now();
		System.out.println(presentDate);
		
		// Creating instance of LocalTime class
        // using now() method
		LocalTime currentTime =LocalTime.now();
		System.out.println(currentTime);
		
		// Creating instance of LocalTime class
        // again using now() method
		 LocalDateTime present = LocalDateTime.now();
	        System.out.println(present);
	}

}
