package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LikedListEx1 {
    public static void main(String[] args){
        LinkedList<String> list= new LinkedList<String>();
        list.add("apple");
        list.add("ball");
        list.add("cat");
        list.add("dog");
        System.out.println(list);
        for (String s : list) {
            System.out.println(s);
        }
        Iterator<String> itr= list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
