package Constructor;

public class StudentC {
    //to invoke current class constructor
    //1.Calling default constructor from parameterized constructor:
    StudentC(){
        int age=21;
        String name="Praveen";
        System.out.println("Age: "+age+", Name :"+name);

    }

    StudentC(String city){
        this();
        System.out.println("City :"+city);
    }

    public static void main(String[] args){
        StudentC obj= new StudentC("Mysore");
    }
}
