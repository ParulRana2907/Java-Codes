//Experiment 1 : Minutes into years, months and days

import java.util.Scanner;

public class TimeConverter {
    public static void main(String[] args) {
        System.out.println("Parul Rana 24csu292");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of minutes: ");
        long minutes = input.nextLong();

        long years = minutes / (60 * 24 * 365);
        long remainingMinutes = minutes % (60 * 24 * 365);
        long days = remainingMinutes / (60 * 24);

        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days.");
    }
}
