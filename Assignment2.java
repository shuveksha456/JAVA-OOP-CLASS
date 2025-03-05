public class Assignment2 {

    public static void main(String[] args) {
        // to check whether the person is eligible to vote or not

        int age = 21;
        if (age >= 18) {
            System.out.println("you are eligible for voting");
        } else {
            System.out.println("you are not eligible for voting");
        }

        System.out.println("----------------------------------");

        // print the greater number among 3 numbers

        int largest;
        int a = 5;
        int b = 10;
        int c = 3;
        if (a > b && a > c) {
            largest = a;
        } else if (b > a && b > c) {
            largest = b;
        } else {
            largest = c;
        }
        System.out.println("largest number is " + largest);

        System.out.println("----------------------------------");

        // make a simple calculator with operation ( +, -, / ,*) using switch case

        float num1 = 10;
        float num2 = 20;
        char op = '/';
        switch (op) {
            case '+':
                System.out.println("addition " + (num1 + num2));
                break;

            case '-':
                System.out.println("subtraction " + (num1 - num2));
                break;

            case '/':
                System.out.println("division " + (num1 / num2));
                break;

            case '*':
                System.out.println("multiplication" + (num1 * num2));
                break;

            default:
                System.out.println("invalid operation");
        }

        System.out.println("----------------------------------");

        int dayNumber = 1;
        switch (dayNumber) {
            case 1:
                System.out.println("Sunday");
                break;

            case 2:
                System.out.println("Monday");
                break;

            case 3:
                System.out.println("Tuesday");
                break;

            case 4:
                System.out.println("Wednesday");
                break;

            default:
                System.out.println("invalid operation");

        }
    }
}
