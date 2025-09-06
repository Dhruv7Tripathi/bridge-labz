import java.util.Scanner;

public class rewriteProgramTen {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int sum = 0;

    // Infinite loop to keep taking user input
    while (true) {
      System.out.print("Enter a positive number (0 or negative to stop): ");
      int num = scanner.nextInt();

      // Check if the user entered 0 or a negative number
      if (num <= 0) {
        // Break the loop if condition is met
        break;
      }

      // Add the entered number to sum
      sum += num;
    }

    System.out.println("Sum = " + sum);
    scanner.close();
  }
}
