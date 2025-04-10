public class ExceptionExample {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        try{
        int result = a/b;
        System.out.println("result:" + result);
        }
        catch(ArithmeticException e){
        System.out.println("cannot divide by zero");
        }
        System.out.println("After....");
    }
}
