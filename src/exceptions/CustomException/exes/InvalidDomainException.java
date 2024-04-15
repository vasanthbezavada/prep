package exceptions.CustomException.exes;

public class InvalidDomainException extends RuntimeException {

    public InvalidDomainException() {
        super("Domain of the email is not valid");
    }

    public InvalidDomainException(String domain) {
        super("Domain - "+domain+ " is not valid");
    }
}
