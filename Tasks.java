public class Tasks {
  public static void main(String[] args) {
    int a = 3;
    int b = 4;
    int addNum = a + b;
    System.out.println("ADD:" + addNum);

    float c = 2.2f;
    float d = 3.5f;
    float subNum = c + d;
    System.out.println("SUBusingFloat:" + subNum);

    System.out.println("Java is a programming language.");

    char ASCIIvalue = 67;
    System.out.println("the ASCII value of 67 is:" + ASCIIvalue);

    // ASSIGNMENT = 1 :
    System.out.println("----------------------------------");
    // Example of Logical operator
    boolean m = true;
    boolean n = false;
    System.out.println("AND:" + (m && n));
    System.out.println("OR:" + (m || n));

    System.out.println("----------------------------------");
    // Example of Bitwise Operator
    int v = 5;
    System.out.println("The bitwise NOT is :" + (~v));

    System.out.println("----------------------------------");
    // Example of Arithmetic Operator
    int num1 = 6;
    int num2 = 7;
    System.out.println("plus:" + (num1 + num2));
    float num3 = 30;
    float num4 = 20;
    System.out.println("divide:" + (num3 / num4));

    System.out.println("----------------------------------");
    // Example of ternaty operator: check for eligible to vote or not
    int age = 18;
    String result = (age >= 18) ? "Eligible to vote" : "Not eligible to vote";
    System.out.println(result);

    System.out.println("----------------------------------");
    // EXample of Pre Increment and Post Decrement (number = 8)
    int k = 8;
    System.out.println("The pre increment:" + ++k);
    System.out.println("The post decrement:" + k--);

    System.out.println("----------------------------------");
    // Example of right shift (number = 7)
    int num5 = 7;
    int rightShiftResult = num5 >> 3;
    System.out.println("The right shift result of 9 is:" + rightShiftResult);
  }
}
