package Constructor;

public class StudentA {
    //to invoke current class method
    void add(){
        int a=10;
        int b=20;
        int sum=a+b;
        System.out.println(sum);
//        multiply();//this.multiply();
    }

    void multiply(){
        int a=10;
        int b=20;
        int mult=a*b;
        System.out.println(mult);
        add();

    }


    public static void main(String[] args){
        StudentA obj= new StudentA();
        obj.multiply();
        obj.multiply();
        obj.multiply();

    }
}
