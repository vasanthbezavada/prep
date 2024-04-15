package exceptions.customExceptiontwo.service;

import exceptions.customExceptiontwo.exception.InvalidEmailDomainException;
import exceptions.customExceptiontwo.exception.UserAlreadyExistException;
import exceptions.customExceptiontwo.repository.UserRepo;

import java.util.List;

public class UserService {

    UserRepo userRepo = new UserRepo();

    public boolean createUser(String vasanth, String kumar, String mail, int mobileNumber){
        validateEmail(mail);
        System.out.println("user successfully saved in database");
        return true;
    }

    private void validateEmail(String mail) {
        // check whether domain is valid
        List<String> existingUserEmails = userRepo.getRegisteredEmails();
        if(existingUserEmails.contains(mail)){
            throw new UserAlreadyExistException();
        }
        // check whether mail already exists in the database.
        String domain = mail.split("@")[1];
        if(!userRepo.getValidDomains().contains(domain)){
            throw new InvalidEmailDomainException(domain);
        }
    }
}
