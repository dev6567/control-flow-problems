import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int m = sc.nextInt();
        System.out.print("Enter day (1-31): ");
        int d = sc.nextInt();
        System.out.print("Enter year (e.g., 2023): ");
        int y = sc.nextInt();

        if (m < 3) {
            m += 12;
            y -= 1;
        }

        int K = y % 100;
        int J = y / 100;

        int f = d + (13 * (m + 1)) / 5 + K + K / 4 + J / 4 + 5 * J;
        int dayOfWeek = f % 7;

        System.out.println("Day of the week (0 = Saturday, 1 = Sunday, ..., 6 = Friday): " + dayOfWeek);
    }
}
