import java.util.Scanner;

public class SumNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        if (n >= 1) {
            int sumFormula = n * (n + 1) / 2;

            int sumWhile = 0;
            int i = 1;
            while (i <= n) {
                sumWhile += i;
                i++;
            }

            System.out.println("Sum using formula: " + sumFormula);
            System.out.println("Sum using while loop: " + sumWhile);
            System.out.println("Both results are equal: " + (sumFormula == sumWhile));
        } else {
            System.out.println("The number is not a natural number");
        }
    }
}
