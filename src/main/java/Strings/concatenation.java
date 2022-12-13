package Strings;

public class concatenation {
    public static void main(String[] args){
        concatenation1();
        concatenation2();
        concatenation3();
    }
    static void concatenation1(){
        String s="Java"+" Program";
        System.out.println(s);
    }
    static void concatenation2(){
        String s=50+30+"Java"+40+40;
        System.out.println(s);
    }

    static void concatenation3(){
        String s1="java ";
        String s2="Program";
        String s3=s1.concat(s2);
        System.out.println(s3);
    }
}
