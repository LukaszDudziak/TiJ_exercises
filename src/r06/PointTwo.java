package r06;

public class PointTwo {

    public static boolean isDivisible(int m, int n){
        if (n % m == 0){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int n = 4;
        int m = 2;
        System.out.println(isDivisible(m,n));
    }
}
