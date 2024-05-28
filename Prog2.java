public class Prog2 {
    public static void main(String[] args) {
        float x = 1.27f, y = 3.881f, z = 9.6f;
        int sum = (int) (x + y + z);
        System.out.println(sum);
        int sum1 = Math.round((x + y + z));
        System.out.println(sum1);
    }
}
