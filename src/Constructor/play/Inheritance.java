package Constructor.play;


class Animal{
//    public Animal(){
//        System.out.println("Animal con init");
//    }
    public Animal(String Type){
        System.out.println("Animal type");
    }
}
class Dog extends Animal{

    public Dog(String type){
        super(type);
        System.out.println("Dog con init");
    }
}
public class Inheritance {

    public static void main(String[] args) {
        Dog dog = new Dog("pug");
    }
}
