import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Event {
    private final LocalDateTime eventDate;

    public Event(LocalDateTime eventDate){
        this.eventDate = eventDate;
    }

    public DayOfWeek dayOfWeek(){
        return this.eventDate.getDayOfWeek();
    }

    public boolean checkLeapYear(){
        return Year.of(eventDate.getYear()).isLeap();
    }

    public String eventDetails(String timeZone) {
        ZoneId zoneId = ZoneId.of(timeZone);
        ZonedDateTime zonedDateTime = eventDate.atZone(zoneId);
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy @ HH:mm [VV]");
        return zonedDateTime.format(outputFormatter);
    }

    public Long getNumberOfDays(){
        LocalDateTime today = LocalDateTime.now();
        return ChronoUnit.DAYS.between(today.toLocalDate(),eventDate.toLocalDate());
    }
}
