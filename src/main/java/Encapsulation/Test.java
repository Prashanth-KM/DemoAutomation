package Encapsulation;

public class Test {

    public static void main(String[] args){
        Student obj= new Student();
        obj.setName("Kiran");
//        String name= obj.getName();
        System.out.println("Name :" +obj.getName());
        obj.setAge(21);
        System.out.println("Age:" +obj.getAge());
    }
}
