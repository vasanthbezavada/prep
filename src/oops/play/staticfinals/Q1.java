package oops.play.staticfinals;

class Block{
    public final String v;
    {
        v = "vasanth";
        System.out.println("vasanth is loaded in instance block");
    }
    public Block(){
        System.out.println("parent construtor executed");
    }
}
class ChildBlock extends Block{
    public String k;
    {
        k = "kumar";
        System.out.println("kumar is loaded in 1st instance block");
    }

    {
        k = "kumar rathode";
        System.out.println("kumar rathode is ...");
    }
    public ChildBlock(){
        System.out.println("child construct execed");
    }
}

public class Q1 {
    {
        System.out.println("class in main method");
    }
    public static void main(String[] args) {
        Block b = new ChildBlock();
    }
}
