package Strings;

public class StringDemo {
    public static void main(String[] args){
        uppercase();
        lowercase();
        length();
        compare();
        replace();
        split();
        splitBy();
        trim();
        startsAndEndsWith();
        valueOf();

    }
    static void uppercase(){
        String S=new String("java");
        System.out.println("Uppercase: " +S.toUpperCase());

    }
    static void lowercase(){
        String S=new String("JAVA");
        System.out.println("lowercase: " +S.toLowerCase());
    }
    static void length(){
        String S= new String("JavaProgramming");
        System.out.println("length: " +S.length());
    }
    static void compare(){
        String S1="javaProgram";
        String S2="java";
        System.out.println("Compare: "+S1.compareTo(S2));
        //S1>S2-->positive value
        //S1==S2-->0
        //S1<S2-->negative value
    }
    static void replace(){
        String S="I am from karnataka";
        System.out.println(S);
        System.out.println(S.replace("karnataka","India"));

    }
    static void split(){
        //N$5,500,009
        String S1="N$5,500,009";
        String S[]= S1.split("\\$");
        for(String S2:S){
            System.out.println(S2 +" ");
        }
        System.out.println();
    }
    static void splitBy(){
        String S1="AA BB CC DD";
        String S[]= S1.split(" ");
        for(int i=0;i<S.length;i++){
            System.out.println(S[i]);
        }
        System.out.println();
    }
    static void trim(){
        String S="  Java  ";
        System.out.println(S);
        System.out.println("Trim :" +S.trim());
    }

    static void startsAndEndsWith(){
        String S="JavaProgram";
        System.out.println("Start with: " +S.startsWith("Py"));
        System.out.println("Ends with :" +S.endsWith("Ja"));
    }

    static void valueOf(){
        int a=10;
        String S= String.valueOf(a);
        System.out.println("a :"+a);
        System.out.println("S :"+S);
        char b='C';
        String S1=String.valueOf(b);
        System.out.println("b :"+b);
        System.out.println("S1 :" +S1);

    }

}
