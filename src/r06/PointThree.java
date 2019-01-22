package r06;

public class PointThree {
    public static boolean isTriangle(int a, int b, int c) {
        if (a + b < c || a + c < b || b + c < a) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = 10;

        System.out.println(isTriangle(a,b,c));
    }
}
