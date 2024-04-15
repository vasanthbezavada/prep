package oops.play;
class ParentLite{
    public long reternSomeValue(){
        int a = 10;
        return  a;
    }
}
class ChildLite extends ParentLite{
    /* the below will not compile if the return type is int */
    public long reternSomeValue(){
        int b = 20;
        return  b;
    }
}
public class Q3Lite {
    public static void main(String[] args) {
        // returntype change - override possible
        ParentLite parentLite = new ParentLite();
        ChildLite childLite = new ChildLite();
        System.out.println(parentLite.reternSomeValue()); //10
        System.out.println(childLite.reternSomeValue()); //20
    }
}
