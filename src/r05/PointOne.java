package r05;

import java.util.Scanner;

public class PointOne {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        if(x > 0 && x < 10){
            System.out.println("Dodatnia, jednocyfrowa");
        }
    }
}
