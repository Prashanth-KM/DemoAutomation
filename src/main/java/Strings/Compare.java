package Strings;

public class Compare {
    public static void main(String[] args){
        equal();
        operator();
    }
    static void equal(){
        String s1="java";
        String s2="java";
        String s3=new String("java");
        String s4="JAVA";

        System.out.println(s1.equals(s2));//T
        System.out.println(s1.equals(s3));//T
        System.out.println(s1.equals(s4));//F
        System.out.println(s1.equalsIgnoreCase(s4));//T
        System.out.println();

    }
    static void operator(){
        String s1="java";
        String s2="java";
        String s3=new String("java");
        System.out.println(s1==s2);//T
        System.out.println(s1==s3);//F
    }
}

//equals
//==