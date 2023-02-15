package org.es.nptel.w2;

// This is the class named School
class School {
  // This is a method in class School
  public void print() {
    System.out.println("Hi! I class SCHOOL.");
  }
}

// This is the class named Student
class Student {
  // This is a method in class Student
  public void print() {
    System.out.println("Hi! I am class STUDENT");
  }
}

/**
 * Week 2, Assignment 1
 */
public class Question21 {
  /**
   * Main funciton
   * 
   * @param args Command line args
   */
  public static void main(String[] args) {
    // Create an object of class School
    School school = new School();

    // Call 'print()' method of class School
    school.print();

    // Create an object of class Student
    Student student = new Student();

    // Call 'print()' method of class Student
    student.print();
  }
}