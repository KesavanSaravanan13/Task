import java.time.LocalDate;
import java.time.LocalTime;

public class DateAndTime {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        LocalDate date = LocalDate.now();
        System.out.println("Current Date : "+date);
        System.out.println("Current Time : "+time);
    }
}
