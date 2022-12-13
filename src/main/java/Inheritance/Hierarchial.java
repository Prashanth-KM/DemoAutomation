package Inheritance;

class MathAdd{
    void addition(int a,int b){
        int res=a+b;
        System.out.println("Addition Result: "+res);
    }
}
class MathSub extends MathAdd {
    void subtraction(int a, int b) {
        int res = a - b;
        System.out.println("subtraction Result: " + res);
    }
}
class MathMult extends MathAdd{
    void multiplication(int a, int b){
        int res=a*b;
        System.out.println("Multiplication result :"+res);
    }

}
public class Hierarchial {
    public static void main(String[] args){
        MathMult obj= new MathMult();
        obj.multiplication(10,10);
        obj.addition(10,10);

        MathSub obj1= new MathSub();
        obj1.subtraction(20,10);
        obj1.addition(20,20);
    }
}
