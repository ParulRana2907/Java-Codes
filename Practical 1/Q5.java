// Experiment 1: Sum of a 3-digit number

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println("Parul Rana 24csu292");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a 3-digit number: ");
        int number = input.nextInt();

        int sum = 0;
        int temp = number;

        sum += temp % 10;
        temp /= 10;
        sum += temp % 10;
        temp /= 10;
        sum += temp % 10;

        System.out.println("The sum of the digits is: " + sum);
    }
}
