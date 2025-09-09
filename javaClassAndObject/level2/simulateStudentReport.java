package javaClassAndObject.level2;

public class simulateStudentReport {
  private String name;
  private int rollNumber;
  private int marks;

  public simulateStudentReport(String name, int rollNumber, int marks) {
    this.name = name;
    this.rollNumber = rollNumber;
    this.marks = marks;
  }

  // Method to calculate grade based on marks
  public String calculateGrade() {
    if (marks >= 90) {
      return "A";
    } else if (marks >= 80) {
      return "B";
    } else if (marks >= 70) {
      return "C";
    } else if (marks >= 60) {
      return "D";
    } else {
      return "F";
    }
  }

  // Method to display student details and grade
  public void displayDetails() {
    System.out.println("Name: " + name);
    System.out.println("Roll Number: " + rollNumber);
    System.out.println("Marks: " + marks);
    System.out.println("Grade: " + calculateGrade());
  }
}
