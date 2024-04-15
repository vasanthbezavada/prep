package exceptions.CustomException;

import exceptions.CustomException.exes.EmailAlreadyExistsException;

public class Main {
    public static void main(String[] args) {
        EmailValidatorService emailValidatorService = new EmailValidatorService();
        try {
            emailValidatorService.isEmailUnique("vasantha@gmail.com");
        } catch (EmailAlreadyExistsException e) {
            throw new RuntimeException(e);
        }
        emailValidatorService.isValidDomain("vasanth@dummy.com");
        System.out.printf("Program executed successfully");
    }
}
