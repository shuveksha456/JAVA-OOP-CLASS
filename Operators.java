public class Operators {

  public static void main(String[] args) {
    // Operators: Operators are the symbol used perform operations[ +, -, <, >, !=,
    // ==]

    // Operands: Operands are the variables
    // (a + b) a and b are opearnds , + is operators

    // 1. Arithmetic Operator: Performs Mathematical calculation. +, -, *, /
    int a = 20;
    int b = 30;
    int addResult = a + b;
    System.out.println("Addition:" + addResult);

    int x = 70;
    int y = 50;
    int subResult = x - y;
    System.out.println("Subtraction:" + subResult);

    int c = 25;
    int d = 5;
    int mulResult = c * d;
    System.out.println("Multiply:" + mulResult);

    float w = 30;
    float z = 20;
    float divResult = w / z;
    System.out.println("Divide:" + divResult);

    System.out.println("----------------------------------");

    // 2. Relational Operator: compare between two or more than two variable. <, >,
    // <=, >=, ==, !=
    int g = 30;
    int h = 40;
    System.out.println("g > h:" + (g > h));
    System.out.println("g < h:" + (g < h));
    System.out.println("g == h:" + (g == h));
    System.out.println("g != h:" + (g != h));
    System.out.println("g <= h:" + (g <= h));
    System.out.println("g >= h:" + (g >= h));

    System.out.println("----------------------------------");

    // Logical Operator: Operation on boolean value.
    // e.g: AND(&&), OR(||)(PIPE), NOT(!)
    boolean m = true;
    boolean n = false;
    System.out.println("AND:" + (m && n));
    System.out.println("OR:" + (m || n));
    System.out.println("NOT:" + (!m));

    System.out.println("----------------------------------");
    // 4. Assignment Operator: used to assign the values.
    // Operators: (+=, -=, *=, /=, %=, =)
    int o = 2;
    int p = 3;
    System.out.println("plusequal:" + (o += p));
    System.out.println("minusequal:" + (o -= p));
    System.out.println("mulequal:" + (o *= p));
    System.out.println("divequal:" + (o /= p));
    System.out.println("modulusequal:" + (o %= p));
    System.out.println("equal:" + (o = p));

    System.out.println("----------------------------------");
    // 5. Ternary Operator
    // condition ? value_if_true : value_if_false;
    int k = 10;
    int l = 20;
    String status = (k >= l) ? "true" : "false";
    System.out.println(status);

    System.out.println("----------------------------------");
    // 6. Bitwise Operator: Operation on bits
    // & AND Sets each bit to 1 if both bits are 1.
    // | | OR
    // ^ XOR (Exclusive OR) Sets each bit to 1 if only one of the bits is 1.
    // ~ NOT (Bitwise Complement) Inverts all bits (flips 0 to 1 and 1 to 0).
    // (8421)
    int v = 9; // 1001
    int s = 10; // 1010
                // 1000 (8)
    System.out.println("The bitwise AND is :" + (v & s));
    System.out.println("The bitwise XOR is :" + (v ^ s));
    System.out.println("The bitwise OR is :" + (v | s));
    System.out.println("The bitwise NOT is :" + (~v));

    System.out.println("----------------------------------");

    // Post Increment and Pre Increment: are used to increase the value of a
    // variable by
    // 1. However, they behave differently in expressions.

    // Post Increment: Uses the current value of x in the expression first, then
    // increments it.
    int num1 = 5;
    System.out.println("Post Increment;" + num1++);
    System.out.println("The re-initialized;" + num1);

    // Pre-Increment (++x):Increments the value of x before using it in an
    // expression.
    System.out.println("Pre Increment;" + ++num1);

    System.out.println("----------------------------------");
    int num2 = 6;
    // Post Decrement: Uses the current value of x in the expression first, then
    // decrements it.
    System.out.println("Post Decrement;" + num2--);
    // Pre Decrement: Decrements the value of x before using it in an expression.
    System.out.println("Pre Decrement;" + --num2);

    System.out.println("----------------------------------");
    // Left Shift : Shifts the bits to the left and fills to 0 to right.
    int i = 5;
    int leftShiftResult = i << 3;
    System.out.println("The left shift by 1;" + leftShiftResult);

    // Right Shift : Shifts the bits to the right and fills to 0 to left.
    int j = 5;
    int rightShiftResult = j >> 1;
    System.out.println("The right shift by 1;" + rightShiftResult);

  }
}