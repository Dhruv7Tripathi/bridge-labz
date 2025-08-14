
public class yardsAndMiles {
  public static void main(String[] args) {
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    System.out.print("Enter distance in feet: ");
    int distanceInFeet = scanner.nextInt();

    double distanceInYards = distanceInFeet / 3.0;
    double distanceInMiles = distanceInYards / 1760.0;

    System.out.printf("The distance in yards is %.2f while the distance in miles is %.4f%n", distanceInYards,
        distanceInMiles);
    scanner.close();
  }
}
