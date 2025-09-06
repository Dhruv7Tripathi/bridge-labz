
public class countDownNo {
  public static void main(String[] args) {
    java.util.Scanner scanner = new java.util.Scanner(System.in);

    // Ask user for the countdown start value
    System.out.print("Enter countdown start value: ");
    int counter = scanner.nextInt();

    // While loop to count down to 1
    while (counter >= 1) {
      // Print the current value of counter
      System.out.println(counter);

      // Decrement the counter
      counter--;
    }

    // Print rocket launch message
    System.out.println("Rocket Launched!");
  }
}
