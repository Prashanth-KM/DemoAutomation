package Introduction;
class Example{
    void add(){
        System.out.println("From Super class");
    }
}
public class MethodOverRiding extends Example {
    void add(){
        System.out.println("From Subclass");
        super.add();
    }

    public static void main(String[] args) {
        MethodOverRiding obj= new MethodOverRiding();
        obj.add();
    }

}

//method name should be same and in different class
//same signature(no of parameters, datatype of each parameter, sequence of data types)


//Constructor- types, overloading, this
// methods- types, overloading, overriding