package Constructor.play;


class SampleConstructor{

    public SampleConstructor(Object anyObj){
        System.out.println("any obj constr executed");
    }

    public SampleConstructor(Integer integer){
        System.out.println("Integer constr executed");
    }


}

public class  PassNullToConstructor {
    public static void main(String[] args) {

        SampleConstructor sampleConstructor = new SampleConstructor(null);
    }
}
