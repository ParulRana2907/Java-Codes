// Experiment 3: Remove duplicates from array

import java.util.Scanner;
import java.util.Arrays;

public class RemoveDuplicates {
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

        // Sort the array to easily find duplicates
        Arrays.sort(arr);

        // Create a new array to store unique elements
        int[] temp = new int[arr.length];
        int j = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[arr.length - 1];

        // Create the final array with the correct size
        int[] uniqueArray = new int[j];
        for (int i = 0; i < j; i++) {
            uniqueArray[i] = temp[i];
        }

        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < uniqueArray.length; i++) {
            System.out.print(uniqueArray[i] + " ");
        }
    }
}
