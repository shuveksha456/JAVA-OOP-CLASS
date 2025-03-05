public class RecursionFibonacci {
    static int fibonacci(int n) { // Fixed method name
        if (n == 0) {
            return 0; // Base case: F(0) = 0
        } else if (n == 1) {
            return 1; // Base case: F(1) = 1
        }
        return fibonacci(n - 1) + fibonacci(n - 2); // Corrected recursion
    }

    static void printFibonacciSeries(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static void main(String[] args) {
        int n = 5; // Number of terms
        System.out.println("Fibonacci series up to " + n + " terms:");
        printFibonacciSeries(n);
    }
}
 