package exceptions.CustomException.exes;

public class EmailAlreadyExistsException extends Exception {

    public EmailAlreadyExistsException() {
        super("Email already exists in the databased");

    }

    public EmailAlreadyExistsException(String message) {
        super(message);
    }
}
