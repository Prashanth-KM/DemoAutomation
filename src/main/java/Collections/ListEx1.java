package Collections;

import java.util.ArrayList;
import java.util.List;

public class ListEx1 {

    List<String> getNames(){
        List<String> list= new ArrayList<String>();
        list.add("apple");
        list.add("ball");
        list.add("cat");
        list.add("dog");
        list.add("apple");
        list.add("cat");
        return list;
    }
    void getNumbers(){
        ArrayList<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
    }
    ArrayList<Integer> ReturnNumbers(){
        ArrayList<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        return list;
    }

    String name(){
        String name="hsbvns";
        return name;
    }
    public static void main(String[] args){
        ListEx1 obj= new ListEx1();
        System.out.println(obj.getNames());
        List<String> S=obj.getNames();
        String name=obj.name();
        ArrayList<Integer> numbers=obj.ReturnNumbers();
        System.out.println(numbers);


    }
}
