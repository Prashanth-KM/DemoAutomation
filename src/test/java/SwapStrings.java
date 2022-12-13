public class SwapStrings {
    public static void main(String[] args){
        String a="java";
        String b="python";//b.length()=6
        System.out.println("Before swap");
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        a=a+b;//javapython a.length=10-6=4

        b=a.substring(0,a.length()-b.length());//java
        a=a.substring(b.length());//python
        System.out.println("After swap");
        System.out.println("a: "+a);
        System.out.println("b: "+b);

    }
}
