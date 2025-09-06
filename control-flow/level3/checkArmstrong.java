import java.util.Scanner;

public class checkArmstrong {
  public static void main(String[] args) {
    // Get integer input from user
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number = sc.nextInt();

    int sum = 0;
    int originalNumber = number;

    // While loop to process each digit
    while (originalNumber != 0) {
      int digit = originalNumber % 10; // Get last digit
      sum += digit * digit * digit; // Add cube of digit to sum
      originalNumber = originalNumber / 10; // Remove last digit
    }

    // Check if sum equals the original number
    if (sum == number) {
      System.out.println(number + " is an Armstrong number.");
    } else {
      System.out.println(number + " is not an Armstrong number.");
    }
  }
}
