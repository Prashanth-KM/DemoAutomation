package Exceptions;

public class Example {
    public static void main(String [] args){
        int a=10; int b=20;
        System.out.println(a+b);
        int c=20;int d=10;
        System.out.println(c-d);
        int g=10;int f=10;
        System.out.println(g*f);
        try{
            int x=10;int y=0;
            System.out.println(x/y);
        }catch (ArithmeticException e){
            e.printStackTrace();
            System.out.println("Exception is handled");
        }
        int i=100; int j=200;
        System.out.println(i+j);
        int k=200;int l=100;
        System.out.println(k-l);
    }
}

