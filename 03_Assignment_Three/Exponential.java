public class ExponenetialClass {

    public static void main(String[] args) {
        System.out.println(getExponential(3,4));
    }

    public static double getExponential(double x , int n ){
        if(n == 0 )
             return 1;
        return x * getExponential(x, n -1 );
    }

}
