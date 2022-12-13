package Strings;


public class Example1 {

    public static void main(String[] args){
        literal(); //immutable
//        literal1();
        stringBufferEx(); //mutable
        stringBuilderEx();//mutable
    }
    static void literal(){
        String S="java";
        S.concat("JAVA");//javaJAVA
        System.out.println("String object :"+S);//java

    }

    static void stringBufferEx(){
        StringBuffer S=new StringBuffer("Selenium");
        StringBuffer S1= new StringBuffer(S);
        S1.append("JAVA");//SeleniumJAVA
        System.out.println("StringBuffer object :"+S1);

    }
    static void stringBuilderEx(){
        StringBuilder S1= new StringBuilder("java");
        S1.append("JAVA");//javaJAVA
        System.out.println("StringBuilder object :"+S1);
    }
    static void literal1(){
        String S="java";
        S=S.concat("JAVA");//javaJAVA
        System.out.println(S);
    }
}
