package java8.FunctionalInterfacesIntro;

public class Student implements Comparable<Student> {

    public Student(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    public Integer age;
    public String name;

    // name comparision
    @Override
    public int compareTo(Student o) {
        return name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
