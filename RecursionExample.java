   //Recursiom:- calling itself , consists of 
   // i. recursive:- calling itself until condition 
   //ii.  base case:- stopping condition 

public class RecursionExample {
    //Recursive method to calculate factorial

    static int factorial (int n ){
        if(n == 0){
            return 1; //Base case
        }
    
    return n * factorial(n -1); //Recursive case 
    }
     
    public static void main (String[]args){
        int num = 5;
        System.out.println("The factorial of " + num + " is: "+ factorial(num));
    }
}
