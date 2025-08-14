
public class cmToFeet {
  public static void main(String[] args) {
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    System.out.print("Enter your height in cm: ");
    double heightCm = scanner.nextDouble();

    double totalInches = heightCm / 2.54;
    int feet = (int) (totalInches / 12);
    double inches = totalInches - (feet * 12);

    System.out.printf("Your Height in cm is %.2f while in feet is %d and inches is %.2f%n", heightCm, feet, inches);
    scanner.close();
  }
}
