package java8.MainFunctionalInterfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class DSupplierDemo {
    public static void main(String[] args) {
        List<Person> personsList = new ArrayList<>();
        personsList.add(new Person("vasanth","kumar",24, Arrays.asList("1230","456")));
        personsList.add(new Person("rathode","asdf",24, Arrays.asList("645","456")));
        personsList.add(new Person("vijay","kor",6, Arrays.asList("6841","456")));
        personsList.add(new Person("anj","lax",16, Arrays.asList("78954","456")));

        Supplier<RuntimeException> personNotFound = () -> new RuntimeException("person not found");
        personsList.stream().filter(person -> person.age<2).findAny().orElseThrow(personNotFound);
    }
}
