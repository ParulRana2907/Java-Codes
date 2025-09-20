
// Experiment 2: Fibonacci Series

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Parul Rana 24csu292");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int terms = input.nextInt();

        int firstTerm = 0, secondTerm = 1;
        System.out.print("Fibonacci Series: " + firstTerm + ", " + secondTerm);

        for (int i = 2; i < terms; i++) {
            int nextTerm = firstTerm + secondTerm;
            System.out.print(", " + nextTerm);
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
