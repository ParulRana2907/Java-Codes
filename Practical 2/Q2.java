//Experiment 2: to check vowel or consonant

import java.util.Scanner;

class VowelConsonant {
    public static void main(String[] args) {
        System.out.println("Parul Rana 24csu292");
        Scanner input = new Scanner(System.in);

        System.out.print("Enter any alphabet: ");
        char ch = input.next().charAt(0);

        switch(ch) {
            case 'a':
            case 'A':
                System.out.println("it's a vowel");
                break;
            case 'e':
            case 'E':
                System.out.println("it's a vowel");
                break;
            case 'i':
            case 'I':
                System.out.println("it's a vowel");
                break;
            case 'o':
            case 'O':
                System.out.println("it's a vowel");
                break;
            case 'u':
            case 'U':
                System.out.println("it's a vowel");
                break;
            default:
                System.out.println("it's a consonant.");
                break;
        }
    }
}
