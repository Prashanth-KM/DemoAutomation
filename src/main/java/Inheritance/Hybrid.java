package Inheritance;

class MatAdd{
    void addition(int a,int b){
        int res=a+b;
        System.out.println("Addition Result: "+res);
    }
}
class MatSub extends MatAdd {
    void subtraction(int a, int b) {
        int res = a - b;
        System.out.println("subtraction Result: " + res);
    }
}
class MatMult extends MatSub{
    void multiplication(int a, int b){
        int res=a*b;
        System.out.println("Multiplication result :"+res);
    }
}

class MatDiv extends MatAdd{
    void division(int a, int b){
        int res=a/b;
        System.out.println("division result :"+res);
    }
}
public class Hybrid {
    public static void main(String[] args){
        MatDiv obj1= new MatDiv();
        obj1.division(20,10);
        obj1.addition(10,10);

        MatMult obj2= new MatMult();
        obj2.multiplication(10,10);
        obj2.subtraction(20,10);
        obj2.addition(20,10);
    }
}
