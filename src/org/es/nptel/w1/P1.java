package org.es.nptel.w1;

import java.util.Scanner;

/**
 * Programing Assignment 1
 */
public class P1 {

  /**
   * Main funciton
   * 
   * @param args Command line args
   */
  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      double mark_avg;
      int result;
      int i;
      int s;
      // define size of array
      s = input.nextInt();
      // The array is defined "arr" and inserted marks into it.
      int[] arr = new int[s];
      for (i = 0; i < arr.length; i++) {
        arr[i] = input.nextInt();
      }

      result = arr[0];
      s = 0;
      for (int j = 0; j < arr.length; j++) {
        if (result <= arr[j]) {
          result = arr[j];
        }
        s += arr[j];
      }
      mark_avg = s / arr.length;
      System.out.println(result);
      System.out.print(mark_avg);
      input.close();
    }
  }
}
