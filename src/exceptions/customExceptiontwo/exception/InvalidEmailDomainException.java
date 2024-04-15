package exceptions.customExceptiontwo.exception;

public class InvalidEmailDomainException extends RuntimeException {
    public InvalidEmailDomainException() {
        super("Not a valid domain, Please use standard domains like google.com , yahoo.com etc");
    }
    public InvalidEmailDomainException(String domain) {
        super(domain + " -is not a valid domain");
    }
}
