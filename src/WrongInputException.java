public class WrongInputException extends IllegalArgumentException {

    public WrongInputException() {
    }

    public WrongInputException(String message) {
        super(message);
    }

    public WrongInputException(Throwable cause) {
        super(cause);
    }

    public WrongInputException(String message, Throwable cause)
    {
        super(message, cause);
    }
}
