// Experiment 3: Sum of all and alternate elements of array

import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
    System.out.println("Parul Rana 24csu292");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }

        int totalSum = 0;
        int alternateSum = 0;

        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
            if (i % 2 == 0) {
                alternateSum += arr[i];
            }
        }

        System.out.println("Sum of all elements: " + totalSum);
        System.out.println("Sum of alternate elements (at even indices): " + alternateSum);
    }
}
