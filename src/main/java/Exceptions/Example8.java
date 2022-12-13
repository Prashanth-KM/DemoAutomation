package Exceptions;

public class Example8 {
    //finally
    public static void main(String[] args){
        try{
            int a=10/0;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArithmeticException handled");
        }finally {
            System.out.println("finally block is always executed");
        }
        int b=10;
        System.out.println(b);
    }
}
