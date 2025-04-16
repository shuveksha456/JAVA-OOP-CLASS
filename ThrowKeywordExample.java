package CustomException;

public class ThrowKeywordExample {
    public static void main(String[] args) {
        int number = 10;
        try {
            if (number < 0) {
                throw new CustomErrorException("Number cannot be negative");
            }
            System.out.println("Valid Number: " + number);
        } catch (Exception e) {
            System.out.println("Custom Error: " + e.getMessage());
        }finally 
    }
}
