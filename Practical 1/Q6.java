// Experiment 1: Reverse a 3-digit number
// if we enter a number having more than 3 digits then it will take the last 3 digits to reverse.

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println("Parul Rana 24csu292");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a 3-digit number: ");
        int number = input.nextInt();

        int reversed = 0;
        int temp = number;

        reversed = reversed * 10 + temp % 10;
        temp /= 10;
        reversed = reversed * 10 + temp % 10;
        temp /= 10;
        reversed = reversed * 10 + temp % 10;

        System.out.println("The reversed number is: " + reversed);
    }
}

