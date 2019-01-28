package r07;

public class PointTwo {

    public static double squareRoot( double x ){

        double i;
        double squareRoot = x/2.0;
        do {
            i = squareRoot;
            squareRoot = (i + (x/i))/2.0;
            System.out.println(i);
            System.out.println(squareRoot);
        } while ((i - squareRoot) != 0.0001);
        return squareRoot;
    }

    public static void main(String[] args) {
        System.out.println(squareRoot(15));
    }
}
