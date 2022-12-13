import java.util.HashMap;

public class CharCount {
    public static void main(String[] args){
        characterCount("church");//c=2, h=2, u=1, r=1
        stringCount("I am working on Java with selenium and also working on python with appium");
    }

    static void characterCount(String S){
        HashMap<Character, Integer> map= new HashMap<>();
        char[] cha= S.toCharArray();//{'c','h','u','r','c','h'}
        for(char ch:cha){
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
                //c,2
                //h,2

            }else{
                map.put(ch,1);
                //c,1
                //h,1
                //u,1
                //r,1
            }
        }
        System.out.println("Character count: "+map);
    }

    static void stringCount(String S){
        HashMap<String, Integer> map= new HashMap<>();
        String[] cha= S.split( " ");//{'c','h','u','r','c','h'}
        for(String ch:cha){
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
                //c,2
                //h,2

            }else{
                map.put(ch,1);
                //c,1
                //h,1
                //u,1
                //r,1
            }
        }
        System.out.println("String count: "+map);
    }

}
