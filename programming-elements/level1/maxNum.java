
public class maxNum {
  public static void main(String[] args) {
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    System.out.print("Enter number of students: ");
    int numberOfStudents = scanner.nextInt();
    int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
    System.out.println("Maximum number of handshakes: " + handshakes);
    scanner.close();
  }
}
