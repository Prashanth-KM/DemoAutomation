package Strings;

public class StringBuilderDemo {
    public static void main(String[] args){
        append();
        insert();
        replace();
        delete();
        reverse();
    }
    static void append(){
        StringBuilder S=new StringBuilder("java");
        StringBuilder S1=new StringBuilder(S);
        S.append("Program");
        System.out.println(S1);
    }
    static void insert(){
        StringBuilder S=new StringBuilder("java");
        S.insert(4,"Program");
        System.out.println(S);
    }
    static void replace(){
        StringBuilder S=new StringBuilder("java");
        S.replace(0,4,"Program");
        System.out.println(S);
    }
    static void delete(){
        StringBuilder S=new StringBuilder("java");
        S.delete(0,3);
        System.out.println(S);
    }
    static void reverse(){
        StringBuilder S=new StringBuilder("java");
        S.reverse();
        System.out.println(S);
    }
}
