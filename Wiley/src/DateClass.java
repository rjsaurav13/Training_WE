import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateClass {
	public static void main(String[] args) {
		LocalDate mydate = LocalDate.now();
		System.out.println(mydate);
		LocalTime mytime=LocalTime.now();
		System.out.println(mytime);
		LocalDateTime mydt=LocalDateTime.now();
		System.out.println(mydt);
		DateTimeFormatter mfdt=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		System.out.println(mfdt);
	}

}
