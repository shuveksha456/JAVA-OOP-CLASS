import java.util.Scanner;

public class AskInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number");
        int intNumber = scanner.nextInt();
        float floatNumber = scanner.nextFloat();
        double doubleNumber = scanner.nextDouble();
        System.out.println("The entered integer  number:" + intNumber);
        System.out.println("The entered float  number:" + floatNumber);
        System.out.println("The entered double  number:" + doubleNumber);

        scanner.close();
    }
}
