// 10. WAP to convert number of days into year, week & days [e.g. 375 days mean 1 year, 1
// week and 3 days].

import java.util.Scanner;

public class DayFormat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.print("Enter the number of days : ");
        int totalDays = scanner.nextInt();

        int daysInYear = 365;
        int daysInWeek = 7;

        int years = totalDays / daysInYear;
        int remainingDays = totalDays % daysInYear;

        int weeks = remainingDays / daysInWeek;
        int days = remainingDays % daysInWeek;

        System.out.println();
        System.out.println(totalDays + " : " + years + " year(s), " + weeks + " week(s), and " + days + " day(s).");
    }
}
