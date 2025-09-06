import java.util.Scanner;

public class greatestFactor {
  public static void main(String[] args) {
    // Get integer input from user
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number = scanner.nextInt();

    // Initialize greatestFactor to 1
    int greatestFactor = 1;

    // Loop from number - 1 down to 1
    for (int i = number - 1; i >= 1; i--) {
      // Check if i is a factor of number
      if (number % i == 0) {
        greatestFactor = i; // Assign i to greatestFactor
        break; // Exit loop after finding the greatest factor
      }
    }

    // Display the greatest factor
    System.out.println("Greatest factor (besides itself): " + greatestFactor);
  }
}
