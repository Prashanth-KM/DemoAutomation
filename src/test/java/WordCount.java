import java.util.HashMap;

public class WordCount {
    public static void main(String[] args){
        String S="I like manual testing along with Automation  manual manual testing";
        String[] S1= S.split(" ");

        HashMap<String, Integer> count= new HashMap<>();
        for(String S2:S1){
            if(count.containsKey(S2)){
                count.put(S2,count.get(S2)+1);
            }else{
                count.put(S2,1);
            }
        }
        System.out.println("Word count: "+count);
    }
}
