package oops.play;

class Anj{
    public void doSomeCal(){
        System.out.println("in Anj class");
    }
}
class AnjC extends Anj{
    public void doSomeCal(){
        System.out.println("in AnjC class");
    }
}

class Calculator{
    public int add(int a, int b){
        System.out.println("int int executed");
        return a+b;
    }
    public long add(int a, long b){
        System.out.println("int long executed");
        return a+b;
    }
    public void doSomeCalByAnj(Anj anj){
        anj.doSomeCal();
    }

}

public class Q2 {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.add(2,3));
        System.out.println(c.add(2,3L));
        // dynamic binding eg;
        Anj anj = new Anj();
        Anj anj2 = new AnjC();
        c.doSomeCalByAnj(anj2);
     }
}
