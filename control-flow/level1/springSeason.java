
public class springSeason {
  public static void main(String[] args) {
    // Check if two arguments are provided
    if (args.length < 2) {
      System.out.println("Please provide month and day as command line arguments.");
      return;
    }

    // Parse month and day from command line arguments
    int month = Integer.parseInt(args[0]);
    int day = Integer.parseInt(args[1]);

    // Check if the date is in Spring Season (March 20 to June 20)
    boolean isSpring = false;

    // March: Spring starts from 20th
    if (month == 3 && day >= 20 && day <= 31) {
      isSpring = true;
    }
    // April and May: Entire months are Spring
    else if ((month == 4 && day >= 1 && day <= 30) || (month == 5 && day >= 1 && day <= 31)) {
      isSpring = true;
    }
    // June: Spring ends at 20th
    else if (month == 6 && day >= 1 && day <= 20) {
      isSpring = true;
    }

    // Print result
    if (isSpring) {
      System.out.println("Its a Spring Season");
    } else {
      System.out.println("Not a Spring Season");
    }
  }
}
