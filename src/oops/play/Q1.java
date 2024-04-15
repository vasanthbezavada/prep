package oops.play;

class Parent {
    public int a = 10;
    public int b = 20;

    public int getB() {
        return b;
    }
    public void printer() {
        System.out.println("values : " + this.a + " " + this.b);
    }
    public void bPrinter(){
        System.out.println("value of b is : "+ b);
    }
}
class Child extends Parent {
    public int b = 30;
    public int c = 40;

    public int getB() {
        return b;
    }
    public void printer() {
        System.out.println("values : " + this.a + " " + this.b + " " + this.c);
    }

}

public class Q1 {
    public static void main(String[] args) {
        Parent p = new Parent(); // 10 20
        Parent p1 = new Child(); // 10 20 40 // error
        Child c = new Child(); // error

        // direct access
        System.out.println(p.b); // 20
        System.out.println(p1.b); // 20
        System.out.println(c.b); // 30
        // using getters
        System.out.println(p.getB()); // 20
        System.out.println(p1.getB()); // 30
        System.out.println(c.getB()); // 30
        //
        p.printer(); // 10 20
        p1.printer(); // 10 30 40
        c.printer(); // 10 30 40

        p.bPrinter(); //20
        p1.bPrinter(); //20
        c.bPrinter(); //20
    }
}
