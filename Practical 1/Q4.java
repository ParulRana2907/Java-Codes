// Experiment 1: Fahrenheit to Celsius

import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        System.out.println("Parul Rana 24csu292");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println(fahrenheit + " F is equal to " + celsius + " C.");
    }
}
