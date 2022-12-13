package Strings;

public class Example3 {
    public static void main(String[] args){

        String S1= "Java";
        String S3= "Java";

        String S2= new String("Java");
        String S4= new String("Java");
        System.out.println(S1.equalsIgnoreCase(S3));//T
        System.out.println( S1.equals(S2));//T
        System.out.println( S1.equals(S3));//T
        System.out.println( S2.equals(S4));//T
        System.out.println();
        System.out.println(S1==S2);//F
        System.out.println(S1==S3);//T
        System.out.println(S2==S4);//F




    }
}
