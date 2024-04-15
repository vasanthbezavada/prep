package java8.FunctionalInterfacesIntro;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

class AgeComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.age.compareTo(o2.age);
    }
}

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(26,"vasanth"));
        studentList.add(new Student(24,"kumarh"));
        studentList.add(new Student(25,"lax"));
        studentList.add(new Student(25,"anj"));

        // c,c1,c2 -- all are same
        Comparator<Student> c = new Comparator<>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.age.compareTo(o2.age);
            }
        };
        Comparator<Student> c1 = (o1,o2)->o1.age.compareTo(o2.age);
        Comparator<Student> c2 = (o1,o2)-> {
            if(o1.age > o2.age){
                return 1;
            }else if(o1.age<o2.age){
                return -1;
            } return 0;
        };
        studentList.sort(c);
        studentList.sort(c1);
        studentList.sort(c2);
        studentList.sort((o1,o2)->o1.age.compareTo(o2.age));
        studentList.stream().forEach(s->System.out.println(s));

        // stream explanation
        Stream<Student> stream = studentList.stream(); // 4(x+y) space on memory
        Stream<Integer> ageStream = stream.map(s -> s.age ); // 4x space
        ageStream.forEach(s->System.out.println(s)); //4x space

        Stream<String> nameStream = stream.map(s -> s.name);
        nameStream.forEach(s->System.out.println(s));

    }

}
