
public class quotientAndRemainder {
  public static void main(String[] args) {
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    System.out.print("Enter first number: ");
    int number1 = scanner.nextInt();
    System.out.print("Enter second number: ");
    int number2 = scanner.nextInt();

    int quotient = number1 / number2;
    int remainder = number1 % number2;

    System.out.println("The Quotient is " + quotient + " and Reminder is " + remainder +
        " of two number " + number1 + " and " + number2);
    scanner.close();
  }
}
