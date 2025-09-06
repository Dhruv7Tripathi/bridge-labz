import java.util.Scanner;

public class rewriteGreatestFactor {
  public static void main(String[] args) {
    // Get integer input from user
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number = scanner.nextInt();

    int greatestFactor = 1; // Initialize greatestFactor to 1
    int counter = number - 1; // Start checking from number - 1

    // Loop until counter is greater than 1
    while (counter >= 1) {
      // Check if number is divisible by counter
      if (number % counter == 0) {
        greatestFactor = counter; // Assign counter to greatestFactor
        break; // Exit loop after finding the greatest factor
      }
      counter--; // Decrement counter
    }

    // Display the greatest factor beside the number
    System.out.println("Greatest factor of " + number + " is " + greatestFactor);

    scanner.close();
  }
}
