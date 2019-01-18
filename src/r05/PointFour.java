package r05;

public class PointFour {
    public static void main(String[] args) {

        checkFermat(1.0,1.0,1.0,3.0);
    }

    public static void checkFermat(double a, double b, double c, double n) {
        if (n > 2) {
            if (Math.pow(a, n) + Math.pow(b, n) == Math.pow(c, n)) {
                System.out.println("He was wrooooong");
            } else {
                System.out.println("Nah, it doesn't work");
            }
        } else {
            System.out.println("It's normal");
        }
    }
}
