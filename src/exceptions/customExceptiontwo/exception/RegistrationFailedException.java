package exceptions.customExceptiontwo.exception;

public class RegistrationFailedException extends Exception {
    public static final String USER_REGISTRATION_FAILED = "User registration failed";

    public RegistrationFailedException() {
        super(USER_REGISTRATION_FAILED);
    }


    public RegistrationFailedException(Throwable throwable) {
        super(USER_REGISTRATION_FAILED,throwable);
    }
    public RegistrationFailedException(String message,Throwable throwable) {
        super(message,throwable);
    }

    public RegistrationFailedException(String customMessage) {
        super(customMessage);
    }
}
