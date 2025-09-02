package oops.level1;

public class inventaryOfItem {
  private int itemCode;
  private String itemName;
  private double price;

  public inventaryOfItem(int itemCode, String itemName, double price) {
    this.itemCode = itemCode;
    this.itemName = itemName;
    this.price = price;
  }

  public void displayItemDetails() {
    System.out.println("Item Code: " + itemCode);
    System.out.println("Item Name: " + itemName);
    System.out.println("Price: " + price);
  }

  public double calculateTotalCost(int quantity) {
    return price * quantity;
  }
}
