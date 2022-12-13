package Introduction;

public class StaticMethod {
    public static void main(String[] args) {
        StaticComponents obj= new StaticComponents();
        obj.displayAge();
        StaticComponents.displayName();
        //classname.methodname
    }
}
