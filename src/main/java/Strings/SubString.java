package Strings;

public class SubString {
    public static void main(String args[]){
        String s="javaprogramming";
        System.out.println("Original String: " + s);
        System.out.println("Substring starting from index 4: " +s.substring(4));
        System.out.println("Substring starting from index 0 to 4: "+s.substring(0,4));
        System.out.println(s.substring(7,11));

       String p="JavaSeleniumAppiumManual";
       String se= p.substring(4,12);
       System.out.println(se);
       System.out.println(p.substring(12,18));
       System.out.println(p.substring(18));


    }
}
