// Experiment 3: Search and print index of element in array

import java.util.Scanner;

public class ArraySearch {
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

        System.out.print("Enter the element to search for: ");
        int elementToFind = input.nextInt();
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == elementToFind) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("Element " + elementToFind + " found at index: " + index);
        } else {
            System.out.println("Element " + elementToFind + " not found in the array.");
        }
    }
}
