import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year (>= 1582): ");
        int year = sc.nextInt();

        if (year < 1582) {
            System.out.println("Invalid year. Must be >= 1582.");
            return;
        }

        
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " is a Leap Year");
                } else {
                    System.out.println(year + " is Not a Leap Year");
                }
            } else {
                System.out.println(year + " is a Leap Year");
            }
        } else {
            System.out.println(year + " is Not a Leap Year");
        }

       
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("(Logical op) " + year + " is a Leap Year");
        } else {
            System.out.println("(Logical op) " + year + " is Not a Leap Year");
        }
    }
}
