package TestPackage;

public class PalindromeClass {
    public static void main(String[] args) {

        System.out.println(isNumberPalidrome(12444421));
    }

    public static boolean isNumberPalidrome(int number){
        int result =  isPalinderHelper(number , 0);
        return result == number ;

    }



    private static int  isPalinderHelper(int number , int reversed){
        if(number == 0 ){
            return  reversed ;

        }
        int lastDigit = number % 10 ;
        reversed = reversed * 10 + lastDigit;
        number = number / 10 ;

        return isPalinderHelper(number, reversed);
    }

}
