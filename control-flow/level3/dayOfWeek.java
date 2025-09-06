public class dayOfWeek {
  public static void main(String[] args) {
    // Check if 3 arguments are passed
    if (args.length != 3) {
      System.out.println("Usage: java DayOfWeek <month> <day> <year>");
      return;
    }

    // Take inputs from command line
    int m = Integer.parseInt(args[0]); // Month
    int d = Integer.parseInt(args[1]); // Day
    int y = Integer.parseInt(args[2]); // Year

    // Apply formulas
    int y0 = y - (14 - m) / 12;
    int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
    int m0 = m + 12 * ((14 - m) / 12) - 2;
    int d0 = (d + x + (31 * m0) / 12) % 7;

    // Print result
    System.out.println("Day of Week (0=Sunday, 1=Monday, ... 6=Saturday): " + d0);
  }
}
