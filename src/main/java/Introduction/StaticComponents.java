package Introduction;

public class StaticComponents {
    int age=21;
    static String name="Java";

    static void displayName(){
        name="Python";
        System.out.println(name);
    }
    void displayAge(){
        System.out.println(age);

    }
    public static void main(String[] args) {
        StaticComponents obj= new StaticComponents();
        obj.displayAge();
        displayName();
        System.out.println("Name from main :"+name);
    }
    static {
        String city="Mysore";
        System.out.println(city);
        System.out.println("Name from static block: "+name);
    }

}
//static variable
//static method
//static block

//instance members cannot accessed inside the static members
//instance members can be accessed inside the instance members
//static members acn be accessed inside the static members
//static members acn be accessed inside the instance members