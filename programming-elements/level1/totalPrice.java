
public class totalPrice {
  public static void main(String[] args) {
    java.util.Scanner scanner = new java.util.Scanner(System.in);

    System.out.print("Enter unit price: ");
    double unitPrice = scanner.nextDouble();

    System.out.print("Enter quantity: ");
    int quantity = scanner.nextInt();

    double total = unitPrice * quantity;

    System.out.printf("The total purchase price is INR %.2f if the quantity %d and unit price is INR %.2f\n", total,
        quantity, unitPrice);

    scanner.close();
  }
}
