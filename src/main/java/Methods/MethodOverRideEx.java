package Methods;
class addition{
    void add(){
        int a=10;
        int b=20;
        int sum= a+b;
        System.out.println("Addition :"+sum);
    }

}
class subtraction extends addition{
    void add(){
        int a=20;
        int b=15;
        int sum=a+b;
        System.out.println("Addition from sub class :" +sum);
//        super.add();

    }
}
public class MethodOverRideEx {
    public static void main(String[] args){
        subtraction obj= new subtraction();
        obj.add();
    }


}
