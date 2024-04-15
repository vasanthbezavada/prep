package exceptions.customExceptiontwo;

import exceptions.customExceptiontwo.exception.RegistrationFailedException;
import exceptions.customExceptiontwo.service.UserService;

public class Rest {
    //user registration rest
    static UserService userService = new UserService();

    public static void main(String[] args) throws RegistrationFailedException {
        try {
            boolean result = userService.createUser("vasanth", "kumar", "kumar@gmail.com", 1234567890);
        }catch (RuntimeException runtimeException){
            System.out.println("logging");
            throw new RegistrationFailedException(runtimeException);
        }
    }
}
