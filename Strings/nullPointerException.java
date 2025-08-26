package Strings;

public class nullPointerException {

  public static void generateNullPointerException() {
    String text = null;
    // This will throw NullPointerException
    System.out.println(text.length());
  }

  public static void handleNullPointerException() {
    String text = null;
    try {
      System.out.println(text.length());
    } catch (NullPointerException e) {
      System.out.println("Caught NullPointerException: " + e.getMessage());
    }
  }

  public static void main(String[] args) {
    // This will throw an exception
    // generateNullPointerException();

    // This will handle the exception
    handleNullPointerException();
  }
}