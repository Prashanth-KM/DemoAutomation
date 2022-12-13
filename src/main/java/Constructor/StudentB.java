package Constructor;

public class StudentB {
//to invoke current class constructor
    //2.Calling parameterized constructor from default constructor:

    StudentB(){
        this("Mysore");
        int age=21;
        String name="Praveen";
        System.out.println("Age: "+age+", Name :"+name);

    }

    StudentB(String city){
        System.out.println("City :"+city);
    }

    public static void main(String[] args){
        StudentB obj= new StudentB();
    }
}
