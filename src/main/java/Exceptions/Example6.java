package Exceptions;

public class Example6 {
    //nested try
    public static void  main(String[] args){
        try{
            try{
                int a[]={1,2,3};
                System.out.println(a[5]);
            }catch (ArrayIndexOutOfBoundsException e){
                e.printStackTrace();
                System.out.println("handled ArrayIndexOutOfBoundsException");
            }
            try{
               String b=null;
                System.out.println(b.length());
            }catch (ArithmeticException e){
                System.out.println(e);
                System.out.println("Arithmetic exception");

            }

        }catch(ArithmeticException e){
            e.printStackTrace();

        }catch (Exception e){
            e.printStackTrace();
            System.out.println("handled parent exception");
        }
        int c=10;
        System.out.println(c);

    }
}
