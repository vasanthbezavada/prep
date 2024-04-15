package java8.MainFunctionalInterfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class E1 {
    public static void main(String[] args) {
        List<Person> personsList = new ArrayList<>();
        personsList.add(new Person("vasanth","kumar",18, Arrays.asList("1230","456")));
        personsList.add(new Person("rathode","asdf",16, Arrays.asList("645","456")));
        personsList.add(new Person("vijay","kor",12, Arrays.asList("6841","456")));
        personsList.add(new Person("anj","lax",24, Arrays.asList("78954","456")));
        personsList.add(new Person("asdf","nagi",20, Arrays.asList("78954","456")));
        personsList.add(new Person("asdre","dallas",19, Arrays.asList("78954","456")));

        // print all first names of the majors
        personsList.stream().filter(a->a.age>18).map(person -> person.firstName).forEach(name-> System.out.println(name));
        personsList.stream().filter(a->a.age>18).forEach(person-> System.out.println(person.firstName));

    }
}
