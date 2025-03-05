import java.util.Scanner;

public class LoopingStatement {
    public static void main(String[] args) {

        // For Loop
        // no.of iteration thaha hunxa
        // multiplication
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number");
        int intNumber = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            int multiply = intNumber * i;
            System.out.println(multiply);
        }
        System.out.println("----------------------------------");
        // odd or even
        int intNumber1 = scanner.nextInt();
        if (intNumber1 % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }
        System.out.println("----------------------------------");
        // While Loop
        // no.of iteration thaha hunna
        int enteredNumber;
        while (true) {
            System.out.println("Enter any number");
            enteredNumber = scanner.nextInt();
            if (enteredNumber == 5) {           //Keeps looping until the user enters 5
                System.out.println("Existing");
                break;
            }
        }
        // Do-while Loop
        int enteredNumber1; 
        do {
            System.out.println("Enter any number");
            enteredNumber1 = scanner.nextInt();  
            if (enteredNumber1 == 5) {           //Keeps looping until the user enters 5
                break;
        }
    }
        while (enteredNumber1 != 5) ;
        System.out.println("FOUND");      
                scanner.close();
                
            
        
   
}
}
