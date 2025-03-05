import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 1. for loop io calculate summ of n number
        // Input from user
        System.out.print("Enter a positive integer n: ");
        int num = scanner.nextInt();
        int sum = 0; // Variable to store sum
        // Loop to calculate sum of first n natural numbers
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        System.out.println("Sum of the first " + num + " natural numbers is: " + sum);

        System.out.println("----------------------------------");
        // 2. print all even number between 1 to 50 using while loop
        System.out.println("Even numbers from 1 to 50:");
        // Loop from 1 to 50
        for (int i = 2; i <= 50; i += 2) {
            System.out.print(i + " ");
        }

        System.out.println("----------------------------------");
        // 3. print number from 100 to 1 in reverse using while loop
        int num1 = 100; // Start from 100
        System.out.println("Numbers from 100 to 1 in reverse order:");
        // While loop to print numbers in reverse
        while (num1 >= 1) {
            System.out.print(num1 + " ");
            num1--; // Decrement i
        }

        System.out.println("----------------------------------");
        // 4. print a factorial of n using for loop
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int factorial = 1; // Variable to store factorial result
        // Loop to calculate factorial
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + n + " is: " + factorial);

        System.out.println("----------------------------------");
        // 5. fibonacci using for loop
        System.out.print("Enter the number of Fibonacci terms: ");
        int num3 = scanner.nextInt();
        int first = 0, second = 1;
        System.out.println("First " + num3 + " Fibonacci numbers:");
        // Loop to print Fibonacci series
        for (int i = 1; i <= num3; i++) {
            System.out.print(first + " ");
            // Compute next term
            int next = first + second;
            first = second;
            second = next;
        }

        System.out.println("----------------------------------");
        // 6. reverse the digits of a number
        System.out.print("Enter a number: ");
        int num4 = scanner.nextInt(); 
        int reversed = 0; // Variable to store the reversed number
        // Loop to reverse the digits
        while (num4 != 0) {
            int digit = num4 % 10; // Extract the last digit
            reversed = reversed * 10 + digit; // Append it to reversed number
            num4 /= 10; // Remove the last digit
        }
        System.out.println("Reversed number: " + reversed);

        System.out.println("----------------------------------");
        // 7. Find the largest digits in a number(e.g: 987 -> 9) using while loop
        System.out.print("Enter a number: ");
        int num5 = scanner.nextInt();
        int largest = 0; // Variable to store the largest digit
        // Loop to find the largest digit
        while (num5 != 0) {
            int digit = num5 % 10; // Extract the last digit
            if (digit > largest) {
                largest = digit; // Update largest if current digit is greater
            }
            num5 /= 10; // Remove the last digit
        }
        // Display result
        System.out.println("Largest digit: " + largest);
        scanner.close();
    }
}
