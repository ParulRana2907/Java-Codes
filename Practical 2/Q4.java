//experiment - 2

import java.util.Scanner;
class Pattern {
    public static void main(String[] args) {
        System.out.println("Parul Rana 24csu292");
        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // Print stars with spaces
            for (int k = 1; k <= 2*i- 1; k++) {
                System.out.print("* ");
            }

            System.out.println(); 
        }
    }
}
