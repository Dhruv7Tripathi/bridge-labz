import java.util.Scanner;

public class multiplicationTable {
  public static void main(String[] args) {
    // Create a Scanner object to take input from the user
    Scanner scanner = new Scanner(System.in);

    // Prompt the user to enter a number
    System.out.print("Enter a number: ");
    int number = scanner.nextInt();

    // Print the multiplication table from 6 to 9
    for (int i = 6; i <= 9; i++) {
      // Print in the format: number * i = result
      System.out.println(number + " * " + i + " = " + (number * i));
    }

    scanner.close();
  }
}
