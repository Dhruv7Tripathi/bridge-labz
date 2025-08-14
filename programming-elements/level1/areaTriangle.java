import java.util.Scanner;

public class areaTriangle {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter base of triangle (in inches): ");
    double base = scanner.nextDouble();

    System.out.print("Enter height of triangle (in inches): ");
    double height = scanner.nextDouble();

    double areaInInches = 0.5 * base * height;
    double areaInCm = areaInInches * 6.4516;

    double heightInCm = height * 2.54;
    double heightInFeet = height / 12.0;

    System.out.printf("Area of triangle: %.2f square inches\n", areaInInches);
    System.out.printf("Area of triangle: %.2f square centimeters\n", areaInCm);
    System.out.printf("Your Height in cm is %.2f while in feet is %.2f and inches is %.2f\n",
        heightInCm, heightInFeet, height);

    scanner.close();
  }
}
