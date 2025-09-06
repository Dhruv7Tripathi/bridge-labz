import java.util.Scanner;

public class calculator {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Get input for first number
    System.out.print("Enter first number: ");
    double first = sc.nextDouble();

    // Get input for second number
    System.out.print("Enter second number: ");
    double second = sc.nextDouble();

    // Get input for operator
    System.out.print("Enter operator (+, -, *, /): ");
    String op = sc.next();

    // Get input for number of times to run the loop
    System.out.print("Enter number of times to run the operation: ");
    int number = sc.nextInt();

    // Run the operation in a loop
    for (int i = 1; i < number; i++) {
      double result;
      switch (op) {
        case "+":
          result = first + second;
          System.out.println("Result (" + i + "): " + result);
          break;
        case "-":
          result = first - second;
          System.out.println("Result (" + i + "): " + result);
          break;
        case "*":
          result = first * second;
          System.out.println("Result (" + i + "): " + result);
          break;
        case "/":
          if (second != 0) {
            result = first / second;
            System.out.println("Result (" + i + "): " + result);
          } else {
            System.out.println("Division by zero error.");
          }
          break;
        default:
          System.out.println("Invalid Operator");
      }
    }

    sc.close();
  }
}
