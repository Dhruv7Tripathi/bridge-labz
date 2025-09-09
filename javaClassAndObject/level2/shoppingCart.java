package javaClassAndObject.level2;

import java.util.ArrayList;
import java.util.Iterator;

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
}

public class shoppingCart {
  private ArrayList<CartItem> items;

  public shoppingCart() {
    items = new ArrayList<>();
  }

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
      total += item.getPrice() * item.getQuantity();
    }
    return total;
  }

  public void displayCart() {
    System.out.println("Items in Cart:");
    for (CartItem item : items) {
      System.out.println(item.getItemName() + " - $" + item.getPrice() + " x " + item.getQuantity());
    }
    System.out.println("Total Cost: $" + getTotalCost());
  }

  // Example usage
  public static void main(String[] args) {
    shoppingCart cart = new shoppingCart();
    cart.addItem("Apple", 0.99, 5);
    cart.addItem("Bread", 2.49, 2);
    cart.displayCart();
    cart.removeItem("Apple");
    cart.displayCart();
  }
}
