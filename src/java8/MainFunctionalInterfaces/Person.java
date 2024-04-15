package java8.MainFunctionalInterfaces;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Person {
    public String firstName;
    public String lastName;
    public Integer age;
    public List<String> phoneNumbers;
    public String uniqueId;
    public String bankName;
    public boolean isMajor;

    public Person(String firstName, String lastName, Integer age, List<String> phoneNumbers) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.phoneNumbers = phoneNumbers;
    }

    public Person(String firstName, String lastName, Integer age, List<String> phoneNumbers, Predicate<Person> predicate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.phoneNumbers = phoneNumbers;
        this.isMajor = predicate.test(this);
    }

    public Person(String firstName, String lastName, Integer age, List<String> phoneNumbers,String bankName, Function<Person,String> function) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.phoneNumbers = phoneNumbers;
        this.setIdAndBank(bankName,function);
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", phoneNumbers=" + phoneNumbers +
                '}';
    }

    private void setIdAndBank(String bankName, Function<Person,String> function){
        this.bankName = bankName;
        this.uniqueId=function.apply(this);

        //OLD LOGIC
        // if sbi
        //      so so
        // if hdfc
        //      so so

    }

}
