package r05;

public class PointFive {
    public static void main(String[] args) {
        allDemBottles(3);
    }

    public static void allDemBottles(int n) {

        if (n >= 1) {
            System.out.println(n + " bottles of beer on the wall, " + n + " bottles of beer.");
            System.out.println("Take one down and pass it around, " + (n - 1) + " bottles of beer on the wall");
        } else {
            System.out.println("Take one down and pass it around, no more bottles of beer on the wall");
        }
        if (n == 1) {
            System.out.println("No more bottles of beer on the wall, no more bottles of beer.\n" +
                    "Go to the store and buy some more");
        } else {
            allDemBottles(n - 1);
        }
    }
}
//99 bottles of beer on the wall, 99 bottles of beer.
//Take one down and pass it around, 98 bottles of beer on the wall.