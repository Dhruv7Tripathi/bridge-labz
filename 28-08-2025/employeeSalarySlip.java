
public class employeeSalarySlip {
  public static void main(String[] args) {
    String[] names = { "Alice", "Bob", "Charlie" };
    int[] basicSalaries = { 40000, 55000, 60000 };

    for (int i = 0; i < names.length; i++) {
      int basic = basicSalaries[i];
      double hra = basic * 0.20;
      double da = basic * 0.10;
      double gross = basic + hra + da;
      double tax = 0;
      if (gross > 50000) {
        tax = gross * 0.10;
      }
      double netSalary = gross - tax;

      System.out.println("Salary Slip for: " + names[i]);
      System.out.println("Basic Salary: " + basic);
      System.out.println("HRA (20%): " + hra);
      System.out.println("DA (10%): " + da);
      System.out.println("Gross Salary: " + gross);
      System.out.println("Tax: " + tax);
      System.out.println("Net Salary: " + netSalary);
    }
  }
}
