
import java.util.Scanner;

public class powercalculations {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      double base = scanner.nextDouble();
      double exponent = scanner.nextDouble();
      double result = Math.pow(base, exponent);
      System.out.println(result);
    }
  }
}
