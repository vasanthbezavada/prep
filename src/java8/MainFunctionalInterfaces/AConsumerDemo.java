package java8.MainFunctionalInterfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class AConsumerDemo {

    public static void main(String[] args) {
        List<Person> personsList = new ArrayList<>();
        personsList.add(new Person("vasanth","kumar",24, Arrays.asList("1230","456")));
        personsList.add(new Person("rathode","asdf",24, Arrays.asList("645","456")));
        personsList.add(new Person("vijay","kor",24, Arrays.asList("6841","456")));
        personsList.add(new Person("anj","lax",24, Arrays.asList("78954","456")));
        Predicate<Person> personPredicate = person -> person.age > 18;
        personsList.add(new Person("anj","lax",24, Arrays.asList("78954","456"), personPredicate));

        Consumer<Person> personConsumer = new Consumer<Person>() {
            @Override
            public void accept(Person person) {

                System.out.println(person);
            }
        };

        personsList.stream().forEach(p-> System.out.println(p));
    }
}
