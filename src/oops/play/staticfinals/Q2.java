package oops.play.staticfinals;

class Block2{
    public static String v;
    static {
        v = " no name";
        System.out.println(v);
    }
    {   v= "vasanth";
        System.out.println("vasanth is loaded in instance block");
    }
    public Block2(){
        System.out.println("parent construtor executed");
    }
}
class ChildBlock2 extends Block2{
    public static String k;
    static {
        k = "kumar";
        System.out.println("kumar is loaded in 1st instance block");
    }

    {
        k = "kumar rathode";
        System.out.println("kumar rathode is ...");
    }
    public ChildBlock2(){
        System.out.println("child construct execed");
    }
}

public class Q2 {
    static {
        System.out.println("class in main method");
    }
    public static void main(String[] args) {
        Block2 b = new ChildBlock2();
    }
}
