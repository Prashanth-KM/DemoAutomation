package Exceptions;

import com.sun.codemodel.internal.JTryBlock;

public class Example3 {
    public static void main(String[] args){
       try{
           int i=10/1;
           System.out.println(i);
           int a[]={1,2,3,4,5};
           System.out.println(a[2]);
           String S=null;
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
