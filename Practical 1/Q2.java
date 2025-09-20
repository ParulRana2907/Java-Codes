//Experiment 1: Basic Operators 

import java.util.Scanner;
class Calculator {
    public static void main(String [] args) {
    	System.out.println("Parul Rana 24csu292");
        Scanner sc = new Scanner(System.in);
        int a , b , Addition , Subtraction , Multiplication , Division , Remainder;
        System.out.println("Enter two numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();

        Addition = a + b ;
        Subtraction = a - b ;
        Multiplication = a * b ;
        Division = a / b ;
        Remainder = a % b ;

        System.out.println(
            "Sum of two numbers: " + Addition + "\n" +
            "Subtraction of two numbers: " + Subtraction + "\n" +"Multiplication of two numbers: " + Multiplication +
             "\n" +"Division of two numbers: " + Division + "\n" +"Remainder of two numbers: " + Remainder + "\n" +"Program Ended"
        );
    }
}
