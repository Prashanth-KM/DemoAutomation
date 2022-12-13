package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx3 {
    public static void main(String[] args){
        //get and set
            ArrayList<String> list= new ArrayList<String>();
            list.add("dog");
            list.add("ball");
            list.add("apple");
            list.add("cat");
            System.out.println("Before : " +list);
            System.out.println(list.get(0));
            list.set(1,"Animal");
            list.add(2,"fish");
            System.out.println("After : " +list);
            for (String s : list) {
                System.out.println(s);
            }

        }
}
