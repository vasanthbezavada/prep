package oops.play.abstraction;

interface AnjI{
    void add(int a, int b);
    default void sub(int a, int b){
        System.out.println(a-b);
    }
}
interface VasI{
    void mul (int a, int b);
    default void sub(int a, int b){
        System.out.println(b-a);
    }
}

class Cal implements AnjI,VasI{
    @Override
    public void add(int a, int b) {
        System.out.println(a+b);
    }

    @Override
    public void sub(int a, int b) {
        AnjI.super.sub(a, b);
    }

    @Override
    public void mul(int a, int b) {
        System.out.println(a*b);
    }
}

public class E1 {
    public static void main(String[] args) {
        Cal cal = new Cal();
        cal.sub(4,2);
    }
}
