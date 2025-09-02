package oops.level2;

public class studentReport {
  private String name;
  private int rollNumber;
  private double marks;

  public studentReport(String name, int rollNumber, double marks) {
    this.name = name;
    this.rollNumber = rollNumber;
    this.marks = marks;
  }

  public char calculateGrade() {
    if (marks >= 90)
      return 'A';
    else if (marks >= 80)
      return 'B';
    else if (marks >= 70)
      return 'C';
    else if (marks >= 60)
      return 'D';
    else
      return 'F';
  }

  public void displayDetails() {
    System.out.println("Name: " + name);
    System.out.println("Roll Number: " + rollNumber);
    System.out.println("Marks: " + marks);
    System.out.println("Grade: " + calculateGrade());
  }
}
