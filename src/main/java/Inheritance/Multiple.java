package Inheritance;
class A{
    void msg(){System.out.println("Hello");}
}
interface B{
//    void msg(){System.out.println("Welcome");}
}
class C extends A implements B{

}
public class Multiple {
    C obj= new C();

}
