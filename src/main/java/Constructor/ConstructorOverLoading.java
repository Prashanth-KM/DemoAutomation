package Constructor;

public class ConstructorOverLoading {


    String name;
    int age;
    String city;

    ConstructorOverLoading(){
        int age=10;
    }
    ConstructorOverLoading(int a,String n){
        age = a;
        name = n;

    }

    ConstructorOverLoading(int a,String n,String c){
        name = n;
        age=a;
        city=c;
    }

    void show(){
        System.out.println("Name :" +name +", Age :" +age+ ", City :" +city);
    }

    public static void main(String[] args){

        ConstructorOverLoading obj1= new ConstructorOverLoading(21,"Praveen");
        ConstructorOverLoading obj2=new ConstructorOverLoading(22,"Kiran","Mysore");
        ConstructorOverLoading obj3= new ConstructorOverLoading();
        obj1.show();
        obj2.show();
    }
}
