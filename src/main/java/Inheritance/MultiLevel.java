package Inheritance;

class MathsAdd{
    void addition(int a,int b){
        int res=a+b;
        System.out.println("Addition Result: "+res);
    }
}
class MathsSub extends MathsAdd {
    void subtraction(int a, int b) {
        int res = a - b;
        System.out.println("subtraction Result: " + res);
    }
}
class MathsMult extends MathsSub{
    void multiplication(int a, int b){
        int res=a*b;
        System.out.println("Multiplication result :"+res);
    }
}

public class MultiLevel {
    public static void main(String[] args){
        MathsMult obj= new MathsMult();
        obj.multiplication(10,10);
        obj.subtraction(20,10);
        obj.addition(10,10);
    }
}
