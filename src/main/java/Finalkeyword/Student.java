package Finalkeyword;
  class College{
     final int age=12;
     void add(){
        int a=10;
        int b=10;
        System.out.println((a+b));
    }
}
class campus extends College{

    void add(){
       final String name="Kiran";
        int a=20;
        int b=20;
        System.out.println((a+b));
        System.out.println(name);
    }

}
public class Student {

    public static void main(String[] args){
        campus obj= new campus();
        obj.add();

        System.out.println();

    }

    //final variable cannot be change
    //final method cannot be overridden
    //final class cannot be inherited

}
