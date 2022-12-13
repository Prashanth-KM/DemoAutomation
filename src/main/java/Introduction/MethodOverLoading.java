package Introduction;

public class MethodOverLoading {
   public void add(){
        int a=10;
        int b=20;
        int sum=a+b;
        System.out.println(sum);
    }
   public void add(int a, int b){
        int result=a+b;
        System.out.println(result);
    }
   public int add(int a){
        int b=200;
        int output=a+b;
        return output;
    }

    public static void main(String[] args) {
        MethodOverLoading obj= new MethodOverLoading();
        obj.add();
        obj.add(1,2);
        obj.add(100);
        System.out.println( obj.add(100));

        obj.login("","");
    }

    void login(String mobileNo){

    }

    void login(String userName, String password){

    }

    void login(String email, int password){

    }

}
//constructor over loading:
//name should be same
//signature should be different(no of parameters, datatype of each parameter, sequence of the datatypes)


//method names should be same and in the same class
//signature should be different(no of parameters, datatype of each parameter, sequence of the datatypes)