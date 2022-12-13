package Introduction;

public class Variables {
    //instance/ non static
    String city="Bangalore";
    int age=32;
    //static
    static String name="Dhoni";

    public static void main(String[] args) {
        Variables obj= new Variables();
        obj.displayName();
        obj.displayCity();
        System.out.println(name);
    }

    void displayName(){
        //local
        int pinCode=562101;
        String name="Kohli";
        System.out.println(city);
        System.out.println(age);
    }

    void displayCity(){
        //local
        String town="hebbal";
        System.out.println(city);
        System.out.println(age);
        System.out.println(name);
    }
}
