package Strings;

public class numberException {
  public static void generateNumberFormatException() {
    String input = "abc123";
    int number = Integer.parseInt(input);
    System.out.println("Parsed number: " + number);
  }

  public static void handleNumberFormatException() {
    String input = "xyz456";
    try {
      int number = Integer.parseInt(input);
      System.out.println("Parsed number: " + number);
    } catch (NumberFormatException e) {
      System.out.println("NumberFormatException caught: " + e.getMessage());
    } catch (RuntimeException e) {
      System.out.println("RuntimeException caught: " + e.getMessage());
    }
  }

  public static void main(String[] args) {
    handleNumberFormatException();
  }
}
