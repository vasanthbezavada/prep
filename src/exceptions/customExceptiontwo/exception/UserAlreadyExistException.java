package exceptions.customExceptiontwo.exception;

public class UserAlreadyExistException extends RuntimeException {
    public UserAlreadyExistException(){
        super("User already registered with email");
    }
    public UserAlreadyExistException(String customMessage){
        super(customMessage);
    }
}
