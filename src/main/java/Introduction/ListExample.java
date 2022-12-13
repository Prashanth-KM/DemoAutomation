package Introduction;

import java.util.*;

public class ListExample {
    public static void main(String[] args) {

        List<String> list= new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("B");
        System.out.println("List :"+list);
        System.out.println("Size :"+list.size());

        Iterator<String> itr= list.iterator();

        System.out.println("************");
        Set<String> set= new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        set.add("B");
        System.out.println("Set :"+set);

        System.out.println("************");
        Map<String,Integer> map= new HashMap<>();
        map.put("Age",21);
        map.put("Number", 252);
        map.put("pincode", 24252);
        System.out.println("Map :"+map);

        Iterator<String> iterator= map.keySet().iterator();
        while (iterator.hasNext()){
           String key= iterator.next();
           System.out.println(key+ " "+map.get(key));
        }







    }

}
