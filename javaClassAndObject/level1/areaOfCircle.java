package javaClassAndObject.level1;

public class areaOfCircle {
  private double radius;

  public areaOfCircle(double radius) {
    this.radius = radius;
  }

  public double getArea() {
    return Math.PI * radius * radius;
  }

  public double getCircumference() {
    return 2 * Math.PI * radius;
  }

  public void display() {
    System.out.println("Radius: " + radius);
    System.out.println("Area: " + getArea());
    System.out.println("Circumference: " + getCircumference());
  }

  public static void main(String[] args) {
    areaOfCircle circle = new areaOfCircle(5.0);
    circle.display();
  }
}
