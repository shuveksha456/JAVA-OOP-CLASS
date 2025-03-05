import java.util.Scanner;

public class FunctionExample {
    static int addition (int a, int b){
        return a + b ;
    }
    static int multiply ( int num1, int num2, int num3){
    return num1 * num2 * num3;
}
    public static void main(String[] args) {
        int firstResult = addition(10,20);
        int secondResult = addition(60, 40);
        System.out.println(firstResult);
        System.out.println(secondResult);

        System.out.println("----------------------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any three number");
        int intNumber1 = scanner.nextInt(); 
        int intNumber2 = scanner.nextInt();
        int intNumber3 = scanner.nextInt();
        int firstResult1 = multiply(intNumber1,intNumber2,intNumber3);
        System.out.println(firstResult1);
       
      scanner.close();
    }
}
