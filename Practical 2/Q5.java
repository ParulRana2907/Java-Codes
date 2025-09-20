//Experiment 2 : to print rhombus

import java.util.Scanner;
class Rhombus {
    public static void main(String[] args) {
        System.out.println("Parul Rana 24csu292");
        int rows = 4;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // Print stars with spaces
            for (int k = 1; k <= rows; k++) {
                System.out.print("* ");
            }

            System.out.println(); 
        }
    }
}
