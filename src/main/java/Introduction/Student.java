package Introduction;


public class Student {

    Student(){
        String name="Kiran";
        String city="Mysore";
        System.out.println("Name :"+ name);
        System.out.println("City :"+city);
    }

    Student(String name, String city, int age){
        System.out.println("Name :"+ name);
        System.out.println("City :"+city);
        System.out.println("Age :"+age);
    }

    Student(String branch){

    }


    void display(){

    }

    void addition(int a, int b){
        int sum= a+b;
        System.out.println("Sum :"+sum);
    }

    void login(String userName, String password){

    }


    public static void main(String[] args) {
        System.out.println("Main method");
        Student obj= new Student();
        Student obj1= new Student("Mechanical");
        obj.display();
        obj.addition(10,10);
        obj.addition(10,10);
        obj.addition(30,30);

        Student obj2= new Student("Kiran","Kolar",23);

    }

}
//default
//parameterized