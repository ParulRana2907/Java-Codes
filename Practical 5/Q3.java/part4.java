//q3....part 4
// VehicleApp.java
import java.util.Scanner;

public class VehicleApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Parul Rana 24csu292");
        System.out.print("Enter the number of tires: ");
        int n = scanner.nextInt();
        scanner.close();

        Vehicle v;
        switch (n) {
            case 2:
                v = new Bike();
                break;
            case 4:
                v = new Car();
                break;
            default:
                v = new Vehicle();
                break;
        }
        v.display();
    }
}
