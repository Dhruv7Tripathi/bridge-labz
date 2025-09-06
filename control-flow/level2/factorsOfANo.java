import java.util.Scanner;

public class factorsOfANo {
  public static void main(String[] args) {
    // Create Scanner object to take user input
    Scanner scanner = new Scanner(System.in);

    // Prompt user to enter a positive integer
    System.out.print("Enter a positive integer: ");
    int number = scanner.nextInt();

    // Check if the input is a positive integer
    if (number <= 0) {
      System.out.println("Please enter a positive integer.");
      return;
    }

    // Print factors of the number
    System.out.println("Factors of " + number + " are:");
    for (int i = 1; i <= number; i++) {
      // Check if number is perfectly divisible by i
      if (number % i == 0) {
        System.out.println(i); // Print the factor
      }
    }

    // Close the scanner
    scanner.close();
  }
}
