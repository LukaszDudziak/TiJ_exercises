package r07;

import static r07.PointFour.factorial;

public class PointFive {

    public static double myExp(int n, double x) {
        double result = 0;
        for (int i = 0; i <= n; i++) {
            result = result + Math.pow(x, i) / factorial(i);
        }
        return result;
    }

    public static void check(double x){
        System.out.println(x + "  "+ myExp(15,x) + "  "+ Math.exp(x));
    }

    public static void main(String[] args) {
        System.out.println(myExp(1,2));
        System.out.println("");
        check(1);
        System.out.println("");
        for (double i = 0.1; i <=100.0 ; i=10*i) {
            check(i);
        }
        System.out.println("");
        for (double i = -0.1; i >=-100 ; i=10*i) {
            check(i);
        }
    }
}

