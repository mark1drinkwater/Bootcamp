package ch6.overriden;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Reptile {
    protected void sleep() throws IOException {}
    protected void hide() {}
    protected void exitShell() throws FileNotFoundException {}
}

//class GalapagosTortoise extends Reptile {
//    // FileNotFoundException is a sub-type of IOException
//    public void sleep() throws FileNotFoundException {}
//    // The parent method does not throw a exception
//    public void hide() throws FileNotFoundException {} // DOES NOT COMPILE
//    // IOException is not a sub-type exception of FileNotFoundException.
//    // FileNotFoundException is a subtype of IOException
//    public void exitShell() throws IOException {} // DOES NOT COMPILE
//}
