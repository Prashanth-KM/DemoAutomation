package Collections;

import java.util.*;

public class SetEx1 {

    void values(){
        Set<Integer> set= new HashSet<>();
        set.add(12);
        set.add(24);
        set.add(20);
        set.add(36);
        set.add(12);
        set.add(24);
        System.out.println("From hashSet"+set);
    }
   Set<Integer> getValues(){
       Set<Integer> set= new TreeSet<>();
       set.add(12);
       set.add(24);
       set.add(20);
       set.add(36);
       set.add(20);
       set.add(36);
       return set;
   }

    public static void main(String[] args){
        SetEx1 obj= new SetEx1();
        System.out.println("From TreeSet"+obj.getValues());
        obj.values();
        Set<Integer> values=obj.getValues();
    }
}
