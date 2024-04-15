package exceptions.customExceptiontwo.repository;

import java.util.Arrays;
import java.util.List;

public class UserRepo {

    private List<String> registeredEmails = Arrays.asList("kumar@gmail.com","vasanth@gmail.com","dummy@gmail.com");
    private List<String> validDomains = Arrays.asList("gmail.com","yahoo.com");
    public List<String> getRegisteredEmails() {
        return registeredEmails;
    }
    public List<String> getValidDomains() {
        return validDomains;
    }

}
