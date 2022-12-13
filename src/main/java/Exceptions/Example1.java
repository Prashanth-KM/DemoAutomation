package Exceptions;

public class Example1 {
    public static void main(String[] args){
       try{
           int a=10/0;
       }catch (Exception e){
            System.out.println("catch block is executed");
            e.printStackTrace();
       }
       int b=10;
       System.out.println(b);
    }
}
