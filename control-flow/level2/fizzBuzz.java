import java.util.Scanner;

public class fizzBuzz {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Prompt user for input
    System.out.print("Enter a positive integer: ");
    int n = scanner.nextInt();

    // Check if input is a positive integer
    if (n <= 0) {
      System.out.println("Please enter a positive integer.");
      return;
    }

    // Loop from 1 to n
    for (int i = 1; i <= n; i++) {
      // Check for multiples of both 3 and 5
      if (i % 3 == 0 && i % 5 == 0) {
        System.out.println("FizzBuzz");
      }
      // Check for multiples of 3
      else if (i % 3 == 0) {
        System.out.println("Fizz");
      }
      // Check for multiples of 5
      else if (i % 5 == 0) {
        System.out.println("Buzz");
      }
      // Print the number if not a multiple of 3 or 5
      else {
        System.out.println(i);
      }
    }

    scanner.close();
  }
}
