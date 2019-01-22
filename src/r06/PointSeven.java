package r06;

public class PointSeven {

    public static int oddSum(int n) {

        if( n > 0 ){
            if ( n % 2 == 0 ){
                return oddSum(n-1);
            } else{
                int recurse = oddSum(n-1);
                int result = recurse + n;
                System.out.println(result);
                return result;

            }
        }
        return n;
    }

    public static void main(String[] args) {
        oddSum(99);
    }
}