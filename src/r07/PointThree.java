package r07;

public class PointThree {

    public static int power(int x, int n) {

        int result = 1;

        if (n == 0) {
            result = 1;
        } else {

            for (int i = 0; i <= n; i++) {
                result = result * x;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(power(2, 0));
    }
}
