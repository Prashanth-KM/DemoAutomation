package Superkeyword;
//super can be used to invoke immediate parent class method.
class collegeName{
    String college="BMS";
    void displayCollege(){
        System.out.println("College name in super class:" +college);
    }
}
class studentName extends collegeName{
    String college="RV";
    void displayCollege(){
        System.out.println("College name in sub class:" +college);
    }
    void displayName(){
        String name="Kiran";
        System.out.println("Student name :" +name);
    }
    void displayAge(){
        int age=21;
        System.out.println("Student age :" +age);
        displayName();
        super.displayCollege();//to call method present in super class
    }
}
public class SuperExample {
    public static void main(String[] args){
        studentName obj= new studentName();
        obj.displayAge();
        obj.displayCollege();//to call method in sub class
    }

}
