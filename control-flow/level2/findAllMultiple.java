import java.util.Scanner;

public class findAllMultiple {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Get user input for the number
    System.out.print("Enter a positive integer less than 100: ");
    int number = scanner.nextInt();

    // Check if the input is valid
    if (number <= 0 || number >= 100) {
      System.out.println("Invalid input! Number must be positive and less than 100.");
      return;
    }

    // Loop backward from 100 to 1
    for (int i = 100; i >= 1; i--) {
      // Check if i is a multiple of the number
      if (i % number == 0) {
        System.out.println(i); // Print the multiple
      }
    }
  }
}
