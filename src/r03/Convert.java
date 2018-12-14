package r03;

import java.util.Scanner;

public class Convert {
    public static void main(String[] args) {
        System.out.println("I'll convert temperature from C to F");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Gimmie your celcius: ");
        double userInput = scanner.nextDouble();
        double result = userInput * (9.0/5.0) + 32;

        System.out.println(userInput + "C = " + result + "F");

    }
}
