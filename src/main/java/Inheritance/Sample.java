package Inheritance;

public class Sample extends TestInheritance{
    void sub(){
        int a=20;
        int b=10;
        int dif=a-b;
        System.out.println("Difference :"+dif);
    }

    public static void main(String[] args){
        Sample obj= new Sample();
        obj.sub();
        obj.add();
    }
}
