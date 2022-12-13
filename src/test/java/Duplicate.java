import java.util.*;

public class Duplicate {
    // duplicate values
    void duplicate(){
        int a[]={2,3,4,5,2,3,4};//a.length=7
        //a[0]=2
        //a[1]=3
       // a[2]=4
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                //a[0]==a[1],a[0]==a[2],a[0]==a[3],a[0]==a[4],a[0]==a[5],a[0]==a[6]-->i=0
                //a[1]==a[2],a[1]==a[3],a[1]==a[4],a[1]==a[5]-,a[1]==a[6]->i=1
                //a[2]==a[3],a[2]==a[4],a[2]==a[5],a[2]==a[6]-->i=2
                if(a[i]==a[j]){
                    System.out.println(a[i]);
                    //2
                    //3
                    //4
                }
            }
        }
    }

    void removeDuplicate(){
        Integer a[]={2,3,4,5,2,3,4};
        List<Integer> list= Arrays.asList(a);
        System.out.println(list);
        Set<Integer> set= new HashSet<>();
        set.addAll(list);
        System.out.println(set);
    }
    public static void main(String[] args){
        Duplicate obj= new Duplicate();
        obj.duplicate();
        obj.removeDuplicate();
    }

}
