package oops.play;

class Transformer {
    public void doTransform(){
        System.out.println("transformed in basic");
    }
}

class AnjTrasnformer extends Transformer {
    public void doTransform(){
        System.out.println("transformed in Anj");
    }
}
class VasTrasnformer extends Transformer {
    public void doTransform(){
        System.out.println("transformed in Vas");
    }

    public void postTransform(){
        System.out.println("some additional oper performed ");
    }
}

public class E1 {
    public static void main(String[] args) {
        AnjTrasnformer anjTrasnformer = new AnjTrasnformer();
        Transformer transformer = new VasTrasnformer();

        letsTransform(transformer);
    }

    private static void letsTransform(Transformer transformer) {
        if(transformer instanceof VasTrasnformer){
            VasTrasnformer vasTrans =(VasTrasnformer) transformer;
            vasTrans.doTransform();
            vasTrans.postTransform();
        } else if(transformer instanceof AnjTrasnformer){
            AnjTrasnformer anjTrasnformer =(AnjTrasnformer) transformer;
            anjTrasnformer.doTransform();
        }
    }
}
