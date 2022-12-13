package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;


public class ArrayListEx4 {
    public static void main(String [] args){
        ArrayList<String> list=new ArrayList<String>();
        list.add("apple");
        list.add("ball");
        list.add("cat");
        list.add("dog");

        System.out.println("Traversing list by Iterator Interface:");
        Iterator<String> itr1= list.iterator();
        while(itr1.hasNext()){
            System.out.println(itr1.next());
        }
        System.out.println("Traversing list by for each loop:");
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("Traversing list through List Iterator:");
        //Here, element iterates in reverse order
        ListIterator<String> list1=list.listIterator(list.size());
        while(list1.hasPrevious()) {
            String str=list1.previous();
            System.out.println(str);
        }
        System.out.println("Traversing list through for loop:");
        for(int i=0;i<list.size();i++) {
            System.out.println(list.get(i));
        }

    }
}
