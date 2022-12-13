package Strings;
class Student{
    String name;
    String city;
    Student(String name,String city){
        this.name=name;
        this.city=city;
    }
    public String toString(){
        return "Name :"+name+" City: "+city;
    }
}
public class ToStringExample {
    public static void main(String[] args){
        Student obj= new Student("Kiran","Mysore");
        System.out.println(obj);//.toString
    }
}
