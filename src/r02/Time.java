package r02;

public class Time {
    public static void main(String[] args) {
        double hour = 12.0;
        double minute = 24.0;
        double second = 49.0;

        System.out.println("Hours from midnight: " + (((hour * 60) + minute) * 60 + second));
        System.out.println("Hours till midnight: " + ((24 * 60 * 60) - (hour * 60 + minute) * 60 + second));
        System.out.println("Day's time passed: " + (((hour * 60 + minute) * 60 + second) / (24 * 60 * 60)) * 100 + "%");

        double nHour = 12.0;
        double nMinute = 35.0;
        double nSecond = 21.0;

        double result = ((nHour - hour) * 60 + nMinute - minute) * 60 + nSecond - second;
        System.out.println("Time passed: " + result + " seconds");

    }
}
