package Exceptions;

public class Example7 {
    //nested try
    public static void main(String[] args){

        try{
            try{
                try{
                    String s="hbcnd";
                    System.out.println(s.length());
                    int a[]={1,2,3};
                    System.out.println(a[6]);
                }catch (ArithmeticException e){
                    System.out.println("ArithmeticException: inner catch block 2");
                }
            }catch (ArithmeticException e){
                System.out.println("ArithmeticException: inner catch block 1");
            }
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
            System.out.println("ArrayIndexOutOfBoundsException: outer catch block ");
        }catch (Exception e){
            System.out.println("parent exception :outer try block ");
        }
    }


}
//NoSuchElement
//ElementnotFound
//StaleElement
//WebDriver
//TimeOut
