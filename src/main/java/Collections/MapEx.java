package Collections;

import java.util.*;

public class MapEx {
    public static void main(String[] args){
        Map<Integer,String> map=new HashMap<Integer,String>();
        HashMap<String, Integer> map1= new HashMap<>();
        TreeMap<String, Integer> map2= new TreeMap<>();
        Map<Integer,String> map3=new TreeMap<Integer,String>();

        map.put(100,"Kohli");
        map.put(101,"Dhoni");
        map.put(102,"Rahul");

        System.out.println(map);
        //Elements can traverse in any order
        for(Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());

        }
        System.out.println(" by Iterator");

        Iterator <Integer> itr = map.keySet().iterator();       //keyset is a method
        while(itr.hasNext()) {
            int key=itr.next();
            System.out.println(key+" "+map.get(key));
        }

        int[] a={1,2,3,3};
        for(int b:a){
            System.out.println(b);
        }
        System.out.println(" by Key set and value");
        for (int key : map.keySet())   {
            System.out.println(key);
        }
        for (String value : map.values()) {
            System.out.println(value);
        }

    }
}
