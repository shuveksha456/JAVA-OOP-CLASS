//Control Statements: Conditional Statements, Looping Statements.

// Conditional Statements
//1. if, if-else, if-elseif-else, switch

// Looping Statements
//2. for, while, do-while

//Jump Statements
//3. break, continue, return, pass
public class ControlStatements {
  /**
   * @param args
   */
  public static void main(String[] args) {
    // IF-ELSE
    // Syntax:
    // if(condition) {
    // block
    // }
    // else{
    // block
    // }
    int age = 20;
    if (age >= 18) {
      System.out.println("eligible to vote");
    } else {
      System.out.println("not eligible to vote");
    }

    System.out.println("----------------------------------");
    int num = 9;
    if (num < 0) {
      System.out.println("Negative");
    } else if (num > 0) {
      System.out.println("Positive");
    } else {
      System.out.println("Zero");
    }

    System.out.println("----------------------------------");

    // //Switch
    // switch (expression) {
    // case value1:
    // // Code for value1
    // break;
    // case value2:
    // // Code for value2
    // break;
    // default:
    // // Code if no cases match
  }
}
