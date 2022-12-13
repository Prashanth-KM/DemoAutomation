package StaticComponents;

public class StaticMethod {
    int rollNo;
    String name;
    static String college="BMS";

    static void changeStaticVariable(){
        college="RV";
        System.out.println("Static method");

    }

    StaticMethod(int r, String n){
        rollNo=r;
        name=n;
    }
    void display(){
        System.out.println("RollNo :" +rollNo+", Name :" +name+", College :" +college);
    }

    public static void main(String[] args){
        changeStaticVariable();
        StaticMethod obj=new StaticMethod(12,"Kiran");
        obj.display();
    }
}

//instance variables cannot be accessed in static method
//instance variables can be accessed in non static methods/instance methods
//static variables can be accessed in static method
//static variables can be accessed in non static method