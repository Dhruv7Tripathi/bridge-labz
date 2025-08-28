import java.util.Scanner;

public class onlineShoppingCart {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    boolean moreCustomers = true;

    while (moreCustomers) {
      int total = 0;

      System.out.println("Welcome to Online Shopping System!");

      int itemsCount;
      do {
        System.out.print("Enter number of items you want to buy (at least 1): ");
        itemsCount = sc.nextInt();
      } while (itemsCount < 1);

      for (int i = 1; i <= itemsCount; i++) {
        System.out.println("\nSelect product " + i + ":");
        System.out.println("1. Laptop - Rs. 40000");
        System.out.println("2. Mobile - Rs. 20000");
        System.out.println("3. Headphones - Rs. 2000");
        System.out.println("4. Book - Rs. 500");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        switch (choice) {
          case 1:
            total += 40000;
            break;
          case 2:
            total += 20000;
            break;
          case 3:
            total += 2000;
            break;
          case 4:
            total += 500;
            break;
          default:
            System.out.println("Invalid choice, no item added.");
        }
      }

      if (total > 5000) {
        System.out.println("\nYou are eligible for 10% discount!");
        total = total - (total / 10);
      }

      System.out.println("Final Bill Amount: Rs. " + total);

      System.out.print("\nIs there another customer? (yes/no): ");
      String ans = sc.next();
      if (ans.equalsIgnoreCase("no")) {
        moreCustomers = false;
      }
    }

    System.out.println("\nThank you for shopping!");
    sc.close();
  }
}
