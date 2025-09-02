package oops.level2;

class ticketBooking {
  private String movieName;
  private int seatNumber;
  private double price;

  public ticketBooking(String movieName) {
    this.movieName = movieName;
    this.seatNumber = -1;
    this.price = 0.0;
  }

  public void bookTicket(int seatNumber, double price) {
    this.seatNumber = seatNumber;
    this.price = price;
    System.out.println("Ticket booked successfully!");
  }

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