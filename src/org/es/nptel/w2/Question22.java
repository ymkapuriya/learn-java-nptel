package org.es.nptel.w2;

// This is the class named Printer
class Printer {
  // This are the methods in class Printer
  public void print() {
    System.out.println("Hi! I class SCHOOL.");
  }

  public void print(String s) {
    System.out.println(s);
  }
}

/**
 * Week 2, Assignment 1
 */
public class Question22 {
  /**
   * Main funciton
   * 
   * @param args Command line args
   */
  public static void main(String[] args) {
    // Create an object of class Printer
    Printer printer = new Printer();

    // Call 'print()' methods for desired output
    printer.print();
    printer.print("Hi! I am class STUDENT");
  }
}