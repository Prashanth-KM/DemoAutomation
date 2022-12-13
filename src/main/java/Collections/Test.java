package Collections;


import java.util.*;

public class Test {
    public static void main(String[] args) {
        List<String> list= new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println("List size :"+list.size());
        System.out.println("List :"+list);
        System.out.println("***************");

        Set<String> set= new HashSet<>(list);
        System.out.println("Set :"+set);





    }



}
