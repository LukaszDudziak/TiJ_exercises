package r05;

import java.util.Random;
import java.util.Scanner;

public class PointSeven {

    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        System.out.println(number);

        guess(number);
    }

    public static void guess(int number) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess my number");
        int guess = scanner.nextInt();

        if (guess == number) {
            System.out.println("Correct! You guessed it!");
        } else {
            if (guess > number) {
                System.out.println("You fly too high");
                guess(number);
            } else {
                System.out.println("You go to low");
                guess(number);
            }
        }


    }
}
