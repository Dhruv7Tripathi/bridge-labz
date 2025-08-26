package Strings;

import java.util.Scanner;

public class illegalArgumentException {

  public static void generateException(String input) {
    System.out.println("Generating exception...");
    String sub = input.substring(5, 2);
    System.out.println("Substring: " + sub);
  }

  public static void handleException(String input) {
    try {
      System.out.println("Handling exception...");
      String sub = input.substring(5, 2);
      System.out.println("Substring: " + sub);
    } catch (IllegalArgumentException e) {
      System.out.println("Caught IllegalArgumentException: " + e.getMessage());
    } catch (RuntimeException e) {
      System.out.println("Caught RuntimeException: " + e.getMessage());
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String input = sc.nextLine();
    handleException(input);

    sc.close();
  }
}
