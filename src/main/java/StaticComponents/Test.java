package StaticComponents;

public class Test {
    static String name="Praveen";
    static int age;//0
    static String city;//null

    static {
        city="Mysore";
        displayName();
        displayAge();
    }
    static void displayName(){
        System.out.println("Name: "+name);
    }
    static void displayAge(){
        displayName();
        System.out.println("Age: "+age);
    }
    static void displayCity(){
        System.out.println("City: "+city);
    }

    public static void main(String[] args){
        age=21;
        System.out.println("Age in main method :" +age);
        displayCity();

    }
}
