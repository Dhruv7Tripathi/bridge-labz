package javaClassAndObject.level2;

public class movieTicketBookingSystem {
  private String movieName;
  private int seatNumber;
  private double price;

  // Constructor
  public movieTicketBookingSystem(String movieName) {
    this.movieName = movieName;
    this.seatNumber = -1; // -1 means not booked
    this.price = 0.0;
  }

  // Method to book a ticket
  public void bookTicket(int seatNumber, double price) {
    this.seatNumber = seatNumber;
    this.price = price;
    System.out.println("Ticket booked successfully!");
  }

  // Method to display ticket details
  public void displayTicketDetails() {
    System.out.println("Movie Name: " + movieName);
    if (seatNumber != -1) {
      System.out.println("Seat Number: " + seatNumber);
      System.out.println("Price: $" + price);
    } else {
      System.out.println("Ticket not booked yet.");
    }
  }
}
