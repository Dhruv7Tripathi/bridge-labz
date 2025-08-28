import java.util.Scanner;

public class musicPlaylist {
  public static void main(String[] args) {
    String[] songs = { "Song1", "Song2", "Song3" };
    Scanner scanner = new Scanner(System.in);
    boolean running = true;

    while (running) {
      System.out.println("\nMusic Playlist Manager:");
      System.out.println("1. Play all songs");
      System.out.println("2. Play a song by index");
      System.out.println("3. Search for a song by name");
      System.out.println("4. Exit");
      System.out.print("Choose an option: ");
      int choice = scanner.nextInt();
      scanner.nextLine();

      switch (choice) {
        case 1:
          System.out.println("Playing all songs:");
          for (String song : songs) {
            System.out.println("Playing: " + song);
          }
          break;
        case 2:
          System.out.print("Enter song index (0-" + (songs.length - 1) + "): ");
          int idx = scanner.nextInt();
          scanner.nextLine();
          if (idx >= 0 && idx < songs.length) {
            System.out.println("Playing: " + songs[idx]);
          } else {
            System.out.println("Invalid index.");
          }
          break;
        case 3:
          System.out.print("Enter song name to search: ");
          String name = scanner.nextLine();
          boolean found = false;
          for (String song : songs) {
            if (song.equalsIgnoreCase(name)) {
              System.out.println("Found and playing: " + song);
              found = true;
              break;
            }
          }
          if (!found) {
            System.out.println("Song not found.");
          }
          break;
        case 4:
          running = false;
          System.out.println("Exiting...");
          break;
        default:
          System.out.println("Invalid option. Try again.");
      }
    }
    scanner.close();
  }
}
