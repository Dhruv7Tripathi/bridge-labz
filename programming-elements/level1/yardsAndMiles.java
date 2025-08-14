import java.util.Scanner;

public class yardsAndMiles {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter distance in feet: ");
    int distanceInFeet = scanner.nextInt();

    int yards = distanceInFeet / 3;
    int miles = yards / 1760;

    System.out.println("Distance in yards: " + yards);
    System.out.println("Distance in miles: " + miles);
  }

}
