package Strings;

class StringBufferDemo {
    public static void main(String[] args){
//        append();
//        insert();
//        replace();
//        delete();
        reverse();
    }
    static void append(){
        StringBuffer S=new StringBuffer("java");
        S.append("Program");
        System.out.println(S);
    }
    static void insert(){
        StringBuffer S=new StringBuffer("java");
        S.insert(4,"Program");
        System.out.println(S);//JavaProgram
        System.out.println(S.insert(11,12));
    }
    static void replace(){
        StringBuffer S=new StringBuffer("java");
        S.replace(0,4,"Program");
        System.out.println(S);
        System.out.println(S.replace(3,7,"gamer"));
    }
    static void delete(){
        StringBuffer S=new StringBuffer("javaProgram");
        S.delete(4,10);
        System.out.println(S);
    }
    static void reverse(){
        StringBuffer S=new StringBuffer("java");
        S.reverse();
        System.out.println(S);
    }
}
