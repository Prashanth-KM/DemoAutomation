package Exceptions;

public class Example4 {
    public static void main(String[] args){
        try{
            int a[]={1,2,3,4,5};
            System.out.println(a[5]);
            int i=10/0;
            System.out.println(i);
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
