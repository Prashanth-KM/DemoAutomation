package Introduction;

public class AccessModifiers {
    public static void main(String[] args) {
        departMent obj= new departMent();
        System.out.println(departMent.name);
        obj.display();
    }

    protected void display(){
        System.out.println("Method");
    }
}
