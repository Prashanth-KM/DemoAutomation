package Strings;

public class Example {
    public static void main(String[] args){
        //by String literal
        String s1="java";//-->Constant pool


        //by passing char array
        char ch[]={'s','t','r','i','n','g','s'};
        String s2=new String(ch);

        String P="Java";
        String P1= new String(P);

        //by new keyword
        String s3=new String("example");//-->Heap

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        String S2="jaa";
//
//        StringBuffer SB= new StringBuffer("Java");
//        StringBuilder SB1= new StringBuilder("Java");
    }
}
