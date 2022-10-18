package Exception;

public class DivisionByZeroException extends IllegalArgumentsException {

    public DivisionByZeroException(String s, Throwable cause) {
        super(s, cause);
    }

    public DivisionByZeroException() {
    }
}
