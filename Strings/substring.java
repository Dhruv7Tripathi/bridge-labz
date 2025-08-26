package Strings;

import java.util.Scanner;

public class substring {

  public static String substringWithCharAt(String str, int start, int end) {
    StringBuilder sb = new StringBuilder();
    for (int i = start; i < end && i < str.length(); i++) {
      sb.append(str.charAt(i));
    }
    return sb.toString();
  }

  public static boolean compareWithCharAt(String s1, String s2) {
    if (s1.length() != s2.length())
      return false;
    for (int i = 0; i < s1.length(); i++) {
      if (s1.charAt(i) != s2.charAt(i))
        return false;
    }
    return true;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Take user input
    System.out.print("Enter the main string: ");
    String text = sc.next();
    System.out.print("Enter the start index: ");
    int start = sc.nextInt();
    System.out.print("Enter the end index: ");
    int end = sc.nextInt();

    String sub1 = substringWithCharAt(text, start, end);

    String sub2 = "";
    if (start >= 0 && end <= text.length() && start < end) {
      sub2 = text.substring(start, end);
    }

    boolean areEqualCharAt = compareWithCharAt(sub1, sub2);

    boolean areEqualBuiltIn = sub1.equals(sub2);

    System.out.println("Substring using charAt(): " + sub1);
    System.out.println("Substring using substring(): " + sub2);
    System.out.println("Are the two substrings equal (charAt comparison)? " + areEqualCharAt);
    System.out.println("Are the two substrings equal (built-in equals)? " + areEqualBuiltIn);

    sc.close();
  }
}
