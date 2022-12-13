package Superkeyword;
//super can be used to refer immediate parent class instance variable.
class college{
   String city="Mysore";
}
class student extends college{
    String city="Bengaluru";

    void display(){
        System.out.println("Student city from sub class :" +city);
        System.out.println("Student city from super class :"+super.city);
    }
}
public class SuperEx {
    public static void main(String[] args) {
        student obj = new student();
        obj.display();
    }


}
