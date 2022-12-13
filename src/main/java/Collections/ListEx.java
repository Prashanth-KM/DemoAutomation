package Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListEx {
    public static void main(String[] args){

      List<String> list= new ArrayList<>();
       list.add("Apple");
       list.add("Ball");
       list.add("cat");
       list.add("dog");
        System.out.println("Size: "+list.size());
        list.add(2,"1222");
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        list.add(3,"camel");
        System.out.println("Size :" +list.size());
        System.out.println(list);
        list.remove(4);
        System.out.println(list);

        List<Integer> list2= new ArrayList<>();
        list2.add(9);
        list2.add(2);
        list2.add(7);
        list2.add(18);
        System.out.println(list2);
        list2.remove(0);
        System.out.println("Array list:"+list);
        System.out.println("Linked list:" +list2);


    }
}
