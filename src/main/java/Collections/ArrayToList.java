package Collections;

import java.util.Arrays;
import java.util.List;

public class ArrayToList {
    public static void main(String[] args){
        String S[]={"AA","BB","CC","DD"};
        List<String> list= Arrays.asList(S);
        System.out.println("From List :" +list);
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }


    }
}
