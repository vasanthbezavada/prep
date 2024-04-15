package oops.play.passByValue;

class Pass{
    String a = "vasanth";
}

public class Q2 {
    public static void main(String[] args) {
        Pass pass = new Pass();
        update(pass);
        System.out.println(pass.a);
    }

    public static void update(Pass pass){
        System.out.println(pass.a);
        pass = new Pass();
        pass.a = "Vasanth Kumar";
    }
}
