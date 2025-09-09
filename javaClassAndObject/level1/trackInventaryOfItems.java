package javaClassAndObject.level1;

class Item {
  private String itemCode;
  private String itemName;
  private double price;

  public Item(String itemCode, String itemName, double price) {
    this.itemCode = itemCode;
    this.itemName = itemName;
    this.price = price;
  }

  public void displayDetails() {
    System.out.println("Item Code: " + itemCode);
    System.out.println("Item Name: " + itemName);
    System.out.println("Price: " + price);
  }

  public double calculateTotalCost(int quantity) {
    return price * quantity;
  }
}

public class trackInventaryOfItems {
  public static void main(String[] args) {
    Item item = new Item("A101", "Notebook", 50.0);
    item.displayDetails();
    int quantity = 5;
    double totalCost = item.calculateTotalCost(quantity);
    System.out.println("Total cost for quantity " + quantity + ": " + totalCost);
  }
}
