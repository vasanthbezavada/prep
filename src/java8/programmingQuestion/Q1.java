package java8.programmingQuestion;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Q1 {

  public static void main(String[] args) {

    List<Student> list =
        Stream.of(
                new Student("vasanth", "kumar", 1, "bhimavaram", 23, List.of("98745", "12030")),
                new Student("abhi", "kumar", 11, "kkr", 23, List.of("98745", "12030")),
                new Student("rathode", "kumar", 31, "bhimavaram", 23, List.of("98745", "12030")),
                new Student("sai", "kumar", 32, "chennai", 23, List.of("98745", "12030")),
                new Student("prudhvi", "kumar", 81, "blr", 23, List.of("98745", "12030")),
                new Student("prudhvi", "kumar", 80, "blr", 23, List.of("98745", "12030")),
                new Student("sai", "kumar", 80, "blr", 23, List.of("98745", "12030")),
                new Student("vasanth", "kumar", 80, "blr", 23, List.of("98745", "12030")),
                new Student("katta", "kumar", 10, "delhi", 23, List.of("98745", "12030")))
            .toList();

    // Q1 student firstnames whose rank b/w 30-40 and sort by firstname
    list.stream()
        .filter(s -> s.getRank() >= 30 && s.getRank() <= 40)
        .sorted((o1, o2) -> o1.getFirstName().compareTo(o2.getFirstName()))
        .forEach(s -> System.out.println(s.firstName));

    list.stream()
        .filter(s -> s.getRank() >= 30 && s.getRank() <= 40)
        .map(Student::getFirstName)
        .sorted()
        .forEach(System.out::println);
    System.out.println("Distict cities");
    // find distinct cities

    list.stream().map(s -> s.getCity()).distinct().forEach(System.out::println);

    // find distinct mobile numbers
    System.out.println("Distict mobilenubmer");
    list.stream()
        .flatMap(s -> s.getPhoneNumbers().stream())
        .distinct()
        .forEach(System.out::println);

    // find students from same city
    System.out.println("city vs students");

    Map<String, List<Student>> cityVsStudents =
        list.stream().collect(Collectors.groupingBy(student -> student.getCity()));
    System.out.println(cityVsStudents);
    System.out.println("city vs count");

    Map<String, Long> cityVsCount =
        list.stream().collect(Collectors.groupingBy(Student::getCity, Collectors.counting()));
    System.out.println(cityVsCount);

    System.out.println("city with max no of students");
    list.stream()
        .collect(Collectors.groupingBy(Student::getCity, Collectors.counting()))
        .entrySet()
        .stream()
        .sorted(
            (e1, e2) -> {
              if (e1.getValue() > e2.getValue()) return -1;
              else if (e1.getValue() < e2.getValue()) return 1;
              return 0;
            })
        .limit(1)
        .forEach(System.out::println);

    // avg rank per city
    System.out.println("avg rank per city");

    Map<String, Double> avgRankPerCity =
        list.stream()
            .collect(
                Collectors.groupingBy(Student::getCity, Collectors.averagingInt(Student::getRank)));

    System.out.println(avgRankPerCity);

    // best rank in each city
    System.out.println("best rank per city");

    Map<String, Optional<Student>> bestRankPerCity =
        list.stream()
            .collect(
                Collectors.groupingBy(
                    Student::getCity, Collectors.minBy(Comparator.comparing(Student::getRank))));

    System.out.println(bestRankPerCity);

    // list of students firstname with second highest rank

    List<String> listOfStudentsWith2ndHighestrank =
        list.stream()
            .collect(
                Collectors.groupingBy(
                    Student::getRank, Collectors.mapping(s -> s.firstName, Collectors.toList())))
            .entrySet()
            .stream()
            .sorted(
                (e1, e2) -> {
                  if (e1.getKey() > e2.getKey()) return -1;
                  else if (e1.getKey() < e2.getKey()) return 1;
                  return 0;
                })
            .skip(1)
            .findFirst()
            .get()
            .getValue();

    System.out.println(listOfStudentsWith2ndHighestrank);

    // remove duplicates in paragraph
    String s = "Hi how hello hello how are you how about you";
    // output = "Hi hello how are you about";

    String result = Arrays.stream(s.split(" ")).distinct().collect(Collectors.joining(" "));
    String result2 =
        Arrays.stream(s.split(" ")).collect(Collectors.toCollection(LinkedHashSet::new)).stream()
            .reduce("", (a, b) -> a + b + " ");
    System.out.println(result);
    System.out.println(result2);
  }
}
