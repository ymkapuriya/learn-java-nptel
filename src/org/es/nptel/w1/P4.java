package org.es.nptel.w1;

import java.util.Scanner;

/**
 * Progamming Assignment 4
 */
public class P4 {
  /**
   * Main function
   * 
   * @param args Command line args
   */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int result = 0;

    // Use while loop check the number is Armstrong or not.
    // store the output(1 or 0) in result variable.
    if (n < 0) {
      System.out.println("please enter positive number");
      sc.close();
      return;
    }
    double sum = 0;
    int n2 = n;
    int d;
    while (n2 > 0) {
      d = n2 % 10;
      sum = sum + Math.pow(d, 3);
      n2 = n2 / 10;
    }
    if (sum == n) {
      result = 1;
    }
    System.out.print(result);
    sc.close();
  }
}
