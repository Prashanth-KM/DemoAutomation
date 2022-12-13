package Exceptions;
public class Example2 {
    void add(){
        try{
            int[] a={1,2,3,4};
            System.out.println(a[4]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception is handled");
            e.printStackTrace();
        }
    }
    void display(){
        try{
            String S=null;
            System.out.println(S.length());
        }catch (NullPointerException e){
            System.out.println("Exception handled");
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        Example2 obj= new Example2();
        obj.add();
        obj.display();
    }
}
