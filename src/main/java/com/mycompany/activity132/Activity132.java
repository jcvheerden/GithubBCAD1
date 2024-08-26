
package com.mycompany.activity132;
import java.util.ArrayList;
import java.util.Scanner;

public class Activity132 {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<String> names = new ArrayList<>();

    while (true) {
      System.out.print("Enter a name (or 'done' to finish): ");
      String name = scanner.next();

      if (name.equalsIgnoreCase("done")) {
        break;
      }

      names.add(name);
    }

    System.out.println("You have entered the following names:");
    for (String name : names) {
      System.out.println(name);
    }

    System.out.println("Would you like to add more names? (yes/no)");
    String response = scanner.next();

    if (response.equalsIgnoreCase("yes")) {
      while (true) {
        System.out.print("Enter a name (or 'done' to finish): ");
        String name = scanner.next();

        if (name.equalsIgnoreCase("done")) {
          break;
        }

        names.add(name);
      }
    }

    System.out.println("The updated list of names is:");
    for (String name : names) {
      System.out.println(name);
    }
  }
}
