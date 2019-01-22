package r06;

public class Multadd {

    public static double multadd(double a, double b, double c) {
        double result = a * b + c;
        return result;
    }

    public static double expSum(double x) {
        return x*Math.exp(-x) + Math.sqrt(1.0-Math.exp(-x));
    }

    public static void main(String[] args) {
        System.out.println(multadd(3.0, 2.0, 3.0));

        double x = Math.toRadians(45);
        double result = multadd(1.0, Math.sin(x), (Math.cos(x) / 2));
        System.out.println(result);

        System.out.println(multadd(1.0, Math.log(10.0), Math.log(20.0)));

        System.out.println(expSum(1.0));
    }
}
