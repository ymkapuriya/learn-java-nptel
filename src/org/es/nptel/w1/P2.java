package org.es.nptel.w1;

import java.util.Scanner;

/**
 * Programming Assignment
 */
public class P2 {
  /**
   * Main function
   * 
   * @param args Command line args
   */
  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int sum = 0;
      int index = 0;
      int no = 0;
      while (index < n) {
        if (no % 3 == 0) {
          sum += no;
        }
        no += 2;
        index += 1;
      }
      sc.close();
      System.out.println(sum);
    }
  }
}
