package org.es.nptel.w1;

public class Quiz {
  /**
   * Main program
   * 
   * @param args command line argumetns
   */
  public static void main(String[] args) {
    // /*** boolean b = false; */ // n1
    // String b = "false";
    // switch (b) {
    // case "False":
    // System.out.println("a");
    // break;
    // }

    // int a = 5;
    // a += 6;
    // switch (a - 1) {
    // case 5:
    // System.out.print("10");
    // break;
    // case 10:
    // System.out.print("15");
    // System.out.print(((a % 2 == 0) ? "-even-" : "-odd-"));
    // default:
    // System.out.print(a % 2);
    // }

    // char nptel[] = { '1', '2', '3', '4', '5', '6' };
    // System.out.println(nptel[nptel.length - 2] + nptel[0]);
    // System.out.println(nptel[0] + nptel[nptel.length - 2]);
    // System.out.println("" + nptel[nptel.length - 2] + nptel[0]);
    // System.out.println("" + nptel[0] + nptel[nptel.length - 2]);

    int mark = 5;
    int grace = 2;
    int total = mark + (mark > 6 ? ++grace : --grace);
    System.out.println(total);
  }
}
