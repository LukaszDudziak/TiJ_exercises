package r04;

public class PointThree {
    public static void main(String[] args) {
        System.out.println("No hej");

        String day = "friday";
        int date = 14;
        String month = "december";
        int year = 2018;

        System.out.println(day);
        System.out.println(date);
        System.out.println(month);
        System.out.println(year);

        printAmerican(day,date,month,year);
        printEuropean(day,date,month,year);
    }

    public static void printAmerican(String day, int date, String month, int year){
        System.out.println(day +", "+ month +" "+ date + ", "+ year);
    }

    public static void printEuropean(String day, int date, String month, int year){
        System.out.println(day+", "+ date+ " " + month+ " "+ year);
    }
}
