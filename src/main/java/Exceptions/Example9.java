package Exceptions;

import java.io.File;
import java.io.IOException;
//throw and throws
public class Example9 {
    void check() throws IOException {
       int a=10/0;
       System.out.println(a);
        throw new ArithmeticException("handled exception");
    }
    public static void main(String[] args) throws IOException {
        Example9 obj= new Example9();
        obj.check();
    }
}
