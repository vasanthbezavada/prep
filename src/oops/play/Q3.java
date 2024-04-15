package oops.play;

class ParentRank{
    public int rank = 10;
}
class ChildRank extends ParentRank{
    public int rank = 5;
}
class Parent1{
    String name = "subbarao";
    ParentRank parentRank = new ParentRank();
    public ParentRank returnRank(){
        System.out.println("we are in parent method");
        return parentRank;
    }
}
class Child1 extends Parent1{
    String name = "venkatRao";
    ChildRank childRank = new ChildRank();
    @Override
    public ParentRank returnRank(){
        System.out.println("returning something");
        return childRank;
    }
}
public class Q3 {
    public static void main(String[] args) {
        Parent1 parent1 = new Child1();
        System.out.println("Rank of child is = " +parent1.returnRank().rank);
    }
}
