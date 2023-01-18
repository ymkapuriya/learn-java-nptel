package org.es.nptel.w1;

import java.util.Scanner;
import java.lang.Math;

/**
 * Progamming Assignment 3
 */
public class P3 {
  /**
   * Main function
   * 
   * @param args Command line args
   */
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    double radius = s.nextDouble();
    double perimeter;
    double area;
    // validation
    if (radius <= 0) {
      System.out.println("please enter non zero positive number");
      s.close();
      return;
    }
    // calculate the perimeter
    perimeter = 2 * Math.PI * radius;
    System.out.println(perimeter);
    // calcualte the area
    area = Math.PI * radius * radius;
    System.out.print(area);
    s.close();
  }
}
