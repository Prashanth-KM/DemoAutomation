package Constructor;

public class Student {
//instance and local variables are same
    int age;
    String name;
    String city;
    String college;

    Student(String name,int age, String city,String collName){
        this.age=age;
        this.name=name;
        this.city=city;
        college=collName;
        System.out.println("Age :" +this.age);
        System.out.println("College name :"+college);

    }

    void showResult(){
        System.out.println("Name :"+name +",City :" +city);
    }

    public static void main(String[] args){
        Student obj1= new Student("Praveen",21,"Bangalore","BMS");
        obj1.showResult();
        Student obj2= new Student("Kiran",25,"Mysore","RV");
        obj2.showResult();

    }
}
