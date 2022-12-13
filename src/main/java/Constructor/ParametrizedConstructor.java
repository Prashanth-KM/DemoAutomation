package Constructor;

public class ParametrizedConstructor {
    int age;
    String name;
    String city;

     ParametrizedConstructor(String n,int a, String c){
         age=a;
         name=n;
         city=c;

    }

    void showResult(){
        System.out.println("Age :"+age +",Name :"+name +",City :" +city);
    }

    public static void main(String[] args){
        ParametrizedConstructor obj1= new ParametrizedConstructor("Praveen",21,"Bangalore");
        ParametrizedConstructor obj2= new ParametrizedConstructor("Kiran",25,"Mysore");
        obj1.showResult();
        obj2.showResult();

    }
}
