import java.util.Scanner;

public class youngestFriend {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Take user input for age and height of Amar
    System.out.print("Enter age of Amar: ");
    int ageAmar = sc.nextInt();
    System.out.print("Enter height of Amar: ");
    double heightAmar = sc.nextDouble();

    // Take user input for age and height of Akbar
    System.out.print("Enter age of Akbar: ");
    int ageAkbar = sc.nextInt();
    System.out.print("Enter height of Akbar: ");
    double heightAkbar = sc.nextDouble();

    // Take user input for age and height of Anthony
    System.out.print("Enter age of Anthony: ");
    int ageAnthony = sc.nextInt();
    System.out.print("Enter height of Anthony: ");
    double heightAnthony = sc.nextDouble();

    // Find the youngest friend
    int minAge = ageAmar;
    String youngest = "Amar";
    if (ageAkbar < minAge) {
      minAge = ageAkbar;
      youngest = "Akbar";
    }
    if (ageAnthony < minAge) {
      minAge = ageAnthony;
      youngest = "Anthony";
    }

    // Find the tallest friend
    double maxHeight = heightAmar;
    String tallest = "Amar";
    if (heightAkbar > maxHeight) {
      maxHeight = heightAkbar;
      tallest = "Akbar";
    }
    if (heightAnthony > maxHeight) {
      maxHeight = heightAnthony;
      tallest = "Anthony";
    }

    // Display results
    System.out.println("The youngest friend is " + youngest + " with age " + minAge);
    System.out.println("The tallest friend is " + tallest + " with height " + maxHeight);

    sc.close();
  }
}
