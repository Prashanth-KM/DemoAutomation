package Collections;

import java.util.ArrayList;

public class ArrayListEx5 {
    public static void main(String[] args){
        //one list can be added to another list
        ArrayList<String> list1= new ArrayList<String>();
        list1.add("apple");
        list1.add("ball");
        list1.add("cat");
        list1.add("dog");
        System.out.println("list1: " +list1);

        ArrayList<String> list2= new ArrayList<String>();
        list2.add("fish");
        list2.add("bat");
        System.out.println("list2 " +list2);

        list1.addAll(list2);
        list2.addAll(list1);
        System.out.println("adding list2 elements to list1 :"+list1);
        System.out.println("adding list1 elements to list2 :"+list2);


    }
}
