package Introduction;

public class departMent {

    static String name="java";
    protected void display(){
        System.out.println("Method");
    }

    public static void main(String[] args) {
        departMent obj= new departMent();
        obj.display();
        System.out.println(name);
        AccessModifiers obj1= new AccessModifiers();
        obj1.display();
    }

}
