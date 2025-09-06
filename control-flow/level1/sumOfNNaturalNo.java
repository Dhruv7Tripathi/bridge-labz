import java.util.Scanner;

public class sumOfNNaturalNo {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Prompt user for input
    System.out.print("Enter a number: ");
    int number = scanner.nextInt();

    // Check if the number is a natural number (positive integer)
    if (number > 0) {
      // Calculate the sum using the formula n * (n + 1) / 2
      int sum = number * (number + 1) / 2;
      System.out.println("The sum of " + number + " natural numbers is " + sum);
    } else {
      // If not a natural number, print appropriate message
      System.out.println("The number " + number + " is not a natural number");
    }

    scanner.close();
  }
}
