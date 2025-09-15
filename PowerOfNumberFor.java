import java.util.Scanner;

public class PowerOfNumberFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base number: ");
        int number = sc.nextInt();
        System.out.print("Enter the power (positive integer): ");
        int power = sc.nextInt();

        if (power < 0) {
            System.out.println("Invalid input. Power must be a positive integer.");
            return;
        }

        int result = 1;
        for (int i = 1; i <= power; i++) {
            result *= number;
        }

        System.out.println(number + " raised to power " + power + " is " + result);
    }
}
