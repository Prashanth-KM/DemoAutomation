package StaticComponents;

public class StaticBlock {
    static {
        String name="Praveen";
        int age=21;
        System.out.println("Name :" +name+", Age :" +age);
    }

    public static void main(String[] args){
        System.out.println("Main method");

    }
}
