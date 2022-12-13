package Methods;

public class MethodReturn {
    public static void main(String[] args) {
        MethodReturn obj= new MethodReturn();
        obj.name();
        System.out.println(obj.name());
        obj.returnAge();
        System.out.println(obj.returnAge());

    }

    String name(){
        String studentName="Kiran";
        return studentName;
    }

    int returnAge(){
        int age=12;
        return age;
    }

}
