package com.mycompany.activity131;
import java.util.Arrays;
import java.util.Scanner;

public class Activity131 {

   public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Prompt user to enter marks for 20 students
    int[][] marks = new int[20][5];
    for (int i = 0; i < 20; i++) {
      System.out.println("Enter marks for student " + (i + 1) + ":");
      for (int j = 0; j < 5; j++) {
        System.out.print("Mark " + (j + 1) + ": ");
        marks[i][j] = scanner.nextInt();
      }
    }

    // Sort marks for each student in ascending order
    for (int i = 0; i < 20; i++) {
      Arrays.sort(marks[i]);
    }

    // Allow user to search for a specific student
    System.out.println("Enter the student number to search for (1-20): ");
    int studentNumber = scanner.nextInt() - 1; // subtract 1 to get 0-based index

    if (studentNumber >= 0 && studentNumber < 20) {
      System.out.println("Marks for student " + (studentNumber + 1) + ":");
      for (int i = 0; i < 5; i++) {
        System.out.print(marks[studentNumber][i] + " ");
      }
    } else {
      System.out.println("Invalid student number");
    }
  }
}