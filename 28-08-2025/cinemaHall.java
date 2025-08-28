
public class cinemaHall {
  private boolean[][] seats = new boolean[5][10];

  public boolean bookFamilyOfThree() {
    for (int row = 0; row < seats.length; row++) {
      for (int col = 0; col <= seats[row].length - 3; col++) {
        if (!seats[row][col] && !seats[row][col + 1] && !seats[row][col + 2]) {
          seats[row][col] = true;
          seats[row][col + 1] = true;
          seats[row][col + 2] = true;
          System.out.println("Booked seats at row " + row + ", seats " + col + "-" + (col + 2));
          return true;
        }
      }
    }
    System.out.println("Not available");
    return false;
  }
}
