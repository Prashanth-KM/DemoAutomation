package StaticComponents;

public class StaticVariable {
    int rollNo;
    String name;
    static String college="BMS";

    StaticVariable(int rollNo, String name){
        this.rollNo=rollNo;
        this.name=name;
    }

    void display(){
        System.out.println("RollNo :" +rollNo+", Name :" +name+", College :" +college);
    }

    public static void main(String[] args){
        StaticVariable obj=new StaticVariable(12,"Kiran");
        obj.display();
    }
}
