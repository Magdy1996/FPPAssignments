import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Lesson2Prog3 {
    private static final String defaultTimeZone = "America/Chicago";
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Event Name : ");
        String userName = sc.nextLine();
        System.out.print("Enter Event Date and time in (yyyy-MM-dd HH:mm) : ");
        String input = sc.nextLine();
        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime eventDate = LocalDateTime.parse(input, inputFormatter);
        Event event = new Event(eventDate);
        System.out.println("Day of week of the event is " + event.dayOfWeek());
        System.out.println("Number of days from current date to event date is  " + event.getNumberOfDays());
        if(event.checkLeapYear()){
            System.out.println("Event date is a leap year");
        }else{
            System.out.println("Event date is not a leap year");
        }
        System.out.println("Event datetime in default time zone is "+  event.eventDetails(defaultTimeZone));;
        String newTimeZone = "America/Santiago";
        System.out.println("Event datetime in  " + newTimeZone+ " is " + event.eventDetails(newTimeZone));
    }
}
