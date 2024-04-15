package Constructor;

class Person {
    String name;
    long phNo;

    public Person(String name, long phNo) {
        this(phNo);
        this.name = name;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(long phNo) {
        this.phNo = phNo;
    }
}

public class BasicConstructor {
    public static void main(String[] args) {

        Person person = new Person("vasanth",123546864);
    }
}
