import java.util.Scanner;

public class rewriteFindAllMultiple {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Get input from user
    System.out.print("Enter a positive integer less than 100: ");
    int number = scanner.nextInt();

    // Check if number is valid
    if (number <= 0 || number >= 100) {
      System.out.println("Invalid input. Number must be positive and less than 100.");
      return;
    }

    // Initialize counter to number - 1
    int counter = number - 1;

    // Loop while counter > 1
    while (counter > 1) {
      // Check if number is perfectly divisible by counter
      if (number % counter == 0) {
        // Print the multiple
        System.out.println(counter + " is a multiple of " + number);
      }
      counter--;
    }
  }
}
