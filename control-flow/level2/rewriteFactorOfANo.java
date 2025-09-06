import java.util.Scanner;

public class rewriteFactorOfANo {
  public static void main(String[] args) {
    // Create Scanner object to get user input
    Scanner scanner = new Scanner(System.in);

    // Prompt user to enter a positive integer
    System.out.print("Enter a positive integer: ");
    int number = scanner.nextInt();

    // Check if the input is a positive integer
    if (number <= 0) {
      System.out.println("Please enter a positive integer.");
      return;
    }

    // Initialize counter variable
    int counter = 1;

    System.out.println("Factors of " + number + " are:");

    // Run while loop till counter is less than or equal to number
    while (counter <= number) {
      // Check if number is perfectly divisible by counter
      if (number % counter == 0) {
        // Print the counter as a factor
        System.out.println(counter);
      }
      // Increment counter
      counter++;
    }
  }
}
