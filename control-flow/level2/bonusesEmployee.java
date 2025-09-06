import java.util.Scanner;

public class bonusesEmployee {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Take salary input from user
    System.out.print("Enter employee salary: ");
    double salary = scanner.nextDouble();

    // Take years of service input from user
    System.out.print("Enter years of service: ");
    int yearsOfService = scanner.nextInt();

    double bonus = 0;

    // Check if years of service is more than 5
    if (yearsOfService > 5) {
      // Calculate 5% bonus
      bonus = salary * 0.05;
      System.out.println("Bonus amount: " + bonus);
    } else {
      System.out.println("No bonus for less than or equal to 5 years of service.");
    }

    scanner.close();
  }
}
