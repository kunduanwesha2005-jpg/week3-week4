import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter salary: ");
        double salary = scanner.nextDouble();

        System.out.print("Enter years of service: ");
        int yearsOfService = scanner.nextInt();

        if (yearsOfService > 5) {
            double bonus = salary * 5 / 100;
            System.out.println(
                "The bonus amount for " + yearsOfService +
                " years of service is " + bonus
            );
        } else {
            System.out.println(
                "No bonus for " + yearsOfService +
                " years of service. Minimum 5 years required."
            );
        }

        scanner.close();
    }
}