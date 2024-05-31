
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class AgeCalculator {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-M-d");

    public Period calculateAge(LocalDate birthday) {
        LocalDate today = LocalDate.now();
        //  Period res = Period.between(birthday, today);
        //System.out.println(res);
        return Period.between(birthday, today); // Return periods as Year, Month and Days
    }

    public  LocalDate getBirthday() {
        Scanner scanner = new Scanner(System.in);
        LocalDate birthday;
        while (true) {
            System.out.println("Please enter your birthday "
                    + "in yyyy-MM-dd format (e.g. 1980-9-28): ");
            String input = scanner.nextLine();
            try {
                birthday = LocalDate.parse(input, formatter);

                return birthday;

            } catch(DateTimeParseException e) {
                System.out.println("Error! Please try again");
            }
        }
    }


}