package TestPackage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ExponentialTest {
    @Test
    public void test1(){
        double exp =  Exponential.getExponential(4,2);
        double act = 16.0 ;
        assertEquals(exp, act);
    }

    @Test
    public void test2(){
        double exp =  Exponential.getExponential(0,2);
        double act = 0.0 ;
        assertEquals(exp, act);
    }

    @Test
    public void test3(){
        double exp = Exponential.getExponential(2,3);
        double act = 8.0;
        assertEquals(exp, act);
    }

    @Test
    public void test4(){
        double exp = Exponential.getExponential(5,0);
        double act = 1.0;
        assertEquals(exp, act);
    }

    @Test
    public void test5(){
        double exp = Exponential.getExponential(1,5);
        double act = 1.0;
        assertEquals(exp, act);
    }

    @Test
    public void test6(){
        double exp = Exponential.getExponential(3,3);
        double act = 27.0;
        assertEquals(exp, act);
    }

    @Test
    public void test7(){
        double exp = Exponential.getExponential(10,2);
        double act = 100.0;
        assertEquals(exp, act);
    }

    @Test
    public void test8(){
        double exp = Exponential.getExponential(2,10);
        double act = 1024.0;
        assertEquals(exp, act);
    }

    @Test
    public void test9(){
        double exp = Exponential.getExponential(7,2);
        double act = 49.0;
        assertEquals(exp, act);
    }

}
