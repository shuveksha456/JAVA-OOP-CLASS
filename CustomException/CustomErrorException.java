

//i. Arithmethic-> ArithmeticException
//ii. Null -> NullPointerException
//iii. Array -> ArrayOutOfBoundsException

package CustomException;

public class CustomErrorException extends Exception {
    public CustomErrorException(String message) {
        super(message);
    }
}

