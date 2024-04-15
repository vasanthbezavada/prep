package exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

class Exec2{
    public void doSomething() throws FileNotFoundException{

    }
}
// if super method throws exec , then child cannot throw the corresponding Exceptions parent i.e, eg: IO exec (parent of filenotFound)
// child throws is not needed
// child can throw same exception
// child can throw sub exception
public class Q2 extends Exec2{
    @Override
    public void doSomething() throws FileNotFoundException {
        super.doSomething();
    }
}
