package TestPackage;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PalindromeTest {
    @Test
    public void test1(){
        boolean exp = PalindromeClass.isNumberPalidrome(1221);
        boolean act = true;
        assertEquals(exp, act);
    }

    @Test
    public void test2(){
        boolean exp = PalindromeClass.isNumberPalidrome(12321);
        boolean act = true;
        assertEquals(exp, act);
    }

    @Test
    public void test3(){
        boolean exp = PalindromeClass.isNumberPalidrome(123456);
        boolean act = false;
        assertEquals(exp, act);
    }

    @Test
    public void test4(){
        boolean exp = PalindromeClass.isNumberPalidrome(1);
        boolean act = true;
        assertEquals(exp, act);
    }

    @Test
    public void test5(){
        boolean exp = PalindromeClass.isNumberPalidrome(22);
        boolean act = true;
        assertEquals(exp, act);
    }

    @Test
    public void test6(){
        boolean exp = PalindromeClass.isNumberPalidrome(1234321);
        boolean act = true;
        assertEquals(exp, act);
    }

    @Test
    public void test7(){
        boolean exp = PalindromeClass.isNumberPalidrome(1001);
        boolean act = true;
        assertEquals(exp, act);
    }

    @Test
    public void test8(){
        boolean exp = PalindromeClass.isNumberPalidrome(12345);
        boolean act = false;
        assertEquals(exp, act);
    }

    @Test
    public void test9(){
        boolean exp = PalindromeClass.isNumberPalidrome(0);
        boolean act = true;
        assertEquals(exp, act);
    }

    @Test
    public void test10(){
        boolean exp = PalindromeClass.isNumberPalidrome(12211221);
        boolean act = true;
        assertEquals(exp, act);
    }

    @Test
    public void test11(){
        boolean exp = PalindromeClass.isNumberPalidrome(2147483647); // largest 32-bit integer
        boolean act = false;
        assertEquals(exp, act);
    }
}
