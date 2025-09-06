import java.util.Scanner;

public class programNoTwelve {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Take user input
    System.out.print("Enter a number: ");
    int n = sc.nextInt();

    // Check if the number is a natural number
    if (n <= 0) {
      System.out.println("Please enter a natural number (greater than 0).");
      return;
    }

    // Compute sum using formula: sum = n * (n + 1) / 2
    int sumFormula = n * (n + 1) / 2;

    // Compute sum using for loop
    int sumLoop = 0;
    for (int i = 1; i <= n; i++) {
      sumLoop += i;
    }

    // Print both results
    System.out.println("Sum using formula: " + sumFormula);
    System.out.println("Sum using for loop: " + sumLoop);

    // Compare the results
    if (sumFormula == sumLoop) {
      System.out.println("Both results are equal.");
    } else {
      System.out.println("Results are not equal.");
    }
  }
}