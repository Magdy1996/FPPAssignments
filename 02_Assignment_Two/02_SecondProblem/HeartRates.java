import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class HeartRates {
    String firstName ;
    String lastName;
    LocalDate dateOfBirth ;
    final public double restingHeartRate = 70.0 ;
    final public double lowerBoundary = 0.5 ;
    final public double upperBoundary = 0.85 ;


    // this is the constructor
    public HeartRates(String first , String last , LocalDate birthDate){

        this.firstName = first;
        this.lastName = last;
        this.dateOfBirth = birthDate;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int calculateAge(LocalDate birthDate){
        AgeCalculator ageCalculator = new AgeCalculator();
        Period age = ageCalculator.calculateAge(birthDate);
        return age.getYears();

    }

    public int calculateMaxHeartRate(){

        return 220 - this.calculateAge(this.dateOfBirth);
    }


    public  double calculateAverageHeartRate(){
        return calculateMaxHeartRate() - restingHeartRate ;
    }


    public void calculateTargetHeartRate(){
            double LBTHR = this.calculateAverageHeartRate() * lowerBoundary + restingHeartRate ;
            double UBTHR = this.calculateAverageHeartRate() * upperBoundary + restingHeartRate ;
        System.out.println("The Target Heart Rate Range is between " + LBTHR + " and " + UBTHR );

    }


    @Override
    public String toString() {
        // Ensure target heart rate is calculated if necessary
        this.calculateTargetHeartRate();

        // Format the output string
        String result = "First Name: " + this.getFirstName() + "\n" +
                "Last Name: " + this.getLastName() + "\n" +
                "Age: " + this.calculateAge(this.dateOfBirth) + "\n" +
                "Date of Birth: " + this.getDateOfBirth() + "\n" +
                "Maximum Heart Rate: " + this.calculateMaxHeartRate();

        // Return the formatted string
        return result;
    }



    public static void main(String[] args) {


        System.out.println("Please, Enter your first name ");
        Scanner input = new Scanner(System.in);
        String firstname =  input.next();

        System.out.println("Please, Enter your last name ");
        String lastname = input.next();

        AgeCalculator agecal = new AgeCalculator();
        LocalDate dateofbithe = agecal.getBirthday();

        HeartRates heartobject = new HeartRates( firstname, lastname, dateofbithe);

        System.out.printf( heartobject.toString());




    }
}
