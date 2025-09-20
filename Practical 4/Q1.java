//Experiment 4 : Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'
import java.util.Scanner;

class Student {
    String name;
    int roll_no;

    public static void main(String args[]) {
        System.out.println("Parul Rana 24CSU292");

        Student s = new Student();
        s.name = "John";
        s.roll_no = 2;

        System.out.println("Name: " + s.name);
        System.out.println("Roll No: " + s.roll_no);
    }
}
