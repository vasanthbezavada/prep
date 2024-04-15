package oops.play.passByValue;


public class E1 {
    int a = 10;
    Double ad = 20d;

    public void incrementByX(int x){
        a = a+x;
    }
    public void incrementByX(Double x){
        ad = ad+x;
    }

    public static void main(String[] args) {
        E1 obj = new E1();
        obj.incrementByX(5);
        obj.incrementByX(5d);

        System.out.println(obj);
    }
}
