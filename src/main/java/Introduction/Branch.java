package Introduction;

public class Branch {
int age;
String name;
String city;


    Branch(int age,String name, String c){
       this.age=age;
       this.name=name;
       city=c;
       System.out.println(this.age +" "+this.name+" "+city);
    }
    void displayName(){
//        System.out.println("Name:" +name);
    }


    public static void main(String[] args) {
    Branch obj= new Branch(12,"Kiran","bangalore");
    obj.displayName();


    }
}
//constructor overloading- same constructor name and signature should be different
//Signature: 1. no of parameters, 2. datatype of each parameter, 3. sequence of datatype
