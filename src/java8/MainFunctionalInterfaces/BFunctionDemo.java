package java8.MainFunctionalInterfaces;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class BFunctionDemo {
    public static final String HDFC = "HDFC";
    public static final String SBI = "SBI";

    public static void main(String[] args) {
        List<Person> hdfcPersons = new ArrayList<>();
        List<Person> sbiPersons = new ArrayList<>();

        Function<Person,String> hdfcFunction = new Function<Person, String>() {
            @Override
            public String apply(Person person) {
                return person.firstName+person.lastName+HDFC;
            }
        };
        hdfcPersons.add(new Person("vasanth","kumar",23,Arrays.asList("1230","456"),HDFC,hdfcFunction));
        hdfcPersons.add(new Person("wert","kumar",23,Arrays.asList("1230","456"),HDFC,(person)->person.firstName+person.lastName+HDFC));
        sbiPersons.add(new Person("asdf","kumar",23,Arrays.asList("1230","456"),HDFC,(person)->SBI+person.firstName));
        sbiPersons.add(new Person("dfgh","kumar",23,Arrays.asList("1230","456"),HDFC,(person)->SBI+person.firstName));

        Stream<Person> personStream = hdfcPersons.stream().map(person -> {
            person.age *= 2;
            return person;
        });
    }
}
