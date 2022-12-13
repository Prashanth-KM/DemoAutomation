package AccessModifiers;

public class Test {
    public static void main(String[] args) {
        Branch obj= new Branch();
        obj.sub();//default
        obj.display();//protected
        obj.show();//public
    }
}
