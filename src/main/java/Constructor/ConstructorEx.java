package Constructor;

public class ConstructorEx {

    String name="Kiran";
    int age;

    //Signature should be different
    //1.number of parameters
    //2.datatype of each parameter
    //3.sequence of datatype

    ConstructorEx(int a, String city){
        System.out.println("Name:" +name);
    }

    ConstructorEx(String city, int a){
        age=a;
        System.out.println("Age:"+age);
        System.out.println("City :"+city);
    }

    ConstructorEx(String name){
        System.out.println("name :" +name);
    }

    ConstructorEx(int city){
    System.out.println("City :" +city);
    }

    ConstructorEx(){
        System.out.println("Default Construcotr");
    }


    public static void main(String[] args) {
        ConstructorEx obj1= new ConstructorEx(23,"agdb");
        ConstructorEx obj2= new ConstructorEx("Banglore",33);
        ConstructorEx obj3= new ConstructorEx("nbg");
        ConstructorEx obj4= new ConstructorEx(3);
        ConstructorEx obj5= new ConstructorEx();

    }

}
