package org.es.nptel.w2;

/**
 * Week 2, Assignment 1
 */
public class Question24 {
  /**
   * Main funciton
   * 
   * @param args Command line args
   */
  public static void main(String[] args) {
    new Answer(10, "MCQ");
  }
}

class Answer {
  Answer() {
    System.out.println("You got nothing.");
  }

  Answer(int marks, String type) {
    this();
    System.out.println("You got " + marks + " for an " + type);
  }
}
