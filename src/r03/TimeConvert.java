package r03;

import java.util.Scanner;

public class TimeConvert {
    public static void main(String[] args) {

        System.out.println("I'll convert your seconds to hours, minutes and seconds ");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Gimmie that seconds!");
        int userSeconds = scanner.nextInt();

        int seconds = userSeconds % 60;
        int minutes = userSeconds/60;
        int resultMinutes = minutes % 60;
        int hours = minutes/60;

        System.out.println(userSeconds + " to: " +hours+" hours, " + resultMinutes + " minutes " + seconds +" seconds " );
    }
}
