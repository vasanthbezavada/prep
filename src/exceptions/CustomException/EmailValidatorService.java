package exceptions.CustomException;

import exceptions.CustomException.exes.EmailAlreadyExistsException;
import exceptions.CustomException.exes.InvalidDomainException;

import java.util.Arrays;
import java.util.List;

public class EmailValidatorService {

    List<String> emailsInDb = Arrays.asList("vasanth@gmail.com", "kumar@gmail.com");
    List<String> validDomains = Arrays.asList("gmail.com", "yahoo.in");

    public void isEmailUnique(String email) throws EmailAlreadyExistsException {
        if (email != null && emailsInDb.contains(email)) {
            throw new EmailAlreadyExistsException();
        }
    }

    public void isValidDomain(String email) throws InvalidDomainException {
        String domain = email.split("@")[1];

        if (!validDomains.contains(domain)) {
            throw new InvalidDomainException(domain);
        }
    }
}
