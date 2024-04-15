package exceptions;

import java.io.IOException;

class Exec{
    public void doSomething(){

    }
}
// if super method has no exec , then the child method can throw runtimeException or no exception
public class Q1 extends Exec{

    @Override
    public void doSomething() throws NullPointerException  {
        throw new NullPointerException();
    }

    public static void main(String[] args) {

    }
}
