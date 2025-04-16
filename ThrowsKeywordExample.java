   //throws Keyword
public class ThrowsKeywordExample{

    //Developer A
    public static int divide (int a , int b ) throws ArithmeticException{
        return a / b ;
    }
    public static void main(String[] args) {
        //Developer B 
        try {
        int result = divide(1,0);
        System.out.println(result);
        }catch(Exception e){
            System.out.println("Cannot divide by zero.");
        }
    }
}

//Throw Keyword