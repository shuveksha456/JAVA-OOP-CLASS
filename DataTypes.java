import java.util.Arrays;//Package

public class DataTypes {

  public static void main(String[] args) {
    // variables -> variables are like containers where values can store.
    // Syntax
    // DataTypes variable _ name
    // Datatypes -> the type of data that variable can hold.
    // JAVA is a statically typed language, which means every variable must have
    // specific datatype before use.

    // Types of Datatype

    // a. Primitive Data Type : It specifies the type and kind of value ,it can
    // hold.
    // The different types of primitive datatypes are given as below:

    // 1. byte : (Size: 1 byte), (Range: -127 to 128)
    byte byteExample = 100;
    System.out.println(byteExample);

    // 2. short: (Size: 2 bytes),(Range: -32,768 to 32,767)
    short shortExample = 32767;
    System.out.println(shortExample);

    // 3. int: (Size: 4 bytes),(Range: -2^31 to 2^31-1)
    int intExample = 327679887;
    System.out.println(intExample);

    // 4. long: (Size: 8 bytes)
    long longExample = 1234567890L;
    System.out.println(longExample);

    // 5. float: (Store values for decimal points. Sufficient for storing 6 to 7
    // decimal)
    float floatExample = 12.455f;
    System.out.println(floatExample);

    // 6. double: (Stores values for decimal points. Sufficient for storing 15 to 16
    // decimal)
    double doubleExample = 12.1122d;
    System.out.println(doubleExample);

    // 7. boolean: (Stores boolean values either true or false)
    boolean booleanExample = true;
    System.out.println(booleanExample);

    // 8. char: (Stores a single character or ASCII values)
    char charExample = 'A';
    System.out.println(charExample);

    // Non-primitive datatypes: These datatypes refers to subjects or arrays

    // 1. String: Sequence of characters
    String collegeName = "Nepathya college";
    System.out.println(collegeName);

    // 2. Array: Collection of elements with same datatype
    int[] array0fNumbers = { 1, 2, 43, 675 };
    System.out.println(Arrays.toString(array0fNumbers));

    // 3. Class: Instance of an object

    // 4. Enum: Constant value in object [e.g: dropdown in Gender
    // field(male,female)]

  }
}
