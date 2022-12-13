package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {
    public static void main(String[] args){
        HashSet<String> set= new HashSet<String>();
        set.add("apple");
        set.add("ball");
        set.add("apple");
        set.add("dog");
        set.add("cat");
        set.add("dog");
        System.out.println(set);
        Iterator<String> itr=set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
