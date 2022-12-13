package Exceptions;

public class Example5 {
    //if dont specify the exception it will catch parent exception
    public static void main(String[] args){
        try{
           String S= null;
            System.out.println(S.length());
        }catch (ArithmeticException e){
            System.out.println("ArithmeticException");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        }catch (Exception e){
            System.out.println("Parent Exception");
        }
        int b=10;
        System.out.println(b);
    }
}
