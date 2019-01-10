package r03;
import java.util.Random;
import java.util.Scanner;

/**
 * Początkowy kod dla przykładu "Odgadnij moją liczbę".
 */
public class GuessStarter {

    public static void main(String[] args) {
        // wybierz losową liczbę
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        System.out.println(number);

        System.out.println("Wybierz liczbę pomiędzy 1 a 100:");
        Scanner scanner = new Scanner(System.in);
        int guess = scanner.nextInt();
        System.out.println("Wybrałeś: " + guess);
        if(number==guess){
            System.out.println("Zgadłeś");
        } else {
            int dif = number - guess;
            System.out.println("Moja liczba to "+ number);
            System.out.println("Nie zgadłeś, a różnica wynosi "+ dif);
        }



    }

}
