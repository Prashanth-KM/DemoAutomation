package Superkeyword;
//super() can be used to invoke immediate parent class constructor.
class collName{

    collName(){
        String college="BMS";
        System.out.println("College name  :"+college);
    }
}
class stuName extends collName{
    stuName(){
        super();
        String name="kiran";
        System.out.println("Student name  :"+name);
    }
}
public class SuperKeywordEx {
    public static void main(String[] args){
        stuName obj= new stuName();
    }
}
