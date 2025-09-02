package oops.level2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class CartItem {
  private String itemName;
  private double price;
  private int quantity;

  public CartItem(String itemName, double price, int quantity) {
    this.itemName = itemName;
    this.price = price;
    this.quantity = quantity;
  }

  public String getItemName() {
    return itemName;
  }

  public double getPrice() {
    return price;
  }

  public int getQuantity() {
    return quantity;
  }

  public double getTotalPrice() {
    return price * quantity;
  }
}

public class shoppingCart {
  private List<CartItem> items = new ArrayList<>();

  public void addItem(String itemName, double price, int quantity) {
    items.add(new CartItem(itemName, price, quantity));
  }

  public void removeItem(String itemName) {
    Iterator<CartItem> iterator = items.iterator();
    while (iterator.hasNext()) {
      CartItem item = iterator.next();
      if (item.getItemName().equalsIgnoreCase(itemName)) {
        iterator.remove();
        break;
      }
    }
  }

  public double getTotalCost() {
    double total = 0;
    for (CartItem item : items) {
      total += item.getTotalPrice();
    }
    return total;
  }

  public void displayCart() {
    for (CartItem item : items) {
      System.out.println(item.getItemName() + " - " + item.getQuantity() + " x " + item.getPrice());
    }
    System.out.println("Total Cost: " + getTotalCost());
  }
}
