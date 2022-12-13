package Arrays;

public class ReturnArray {

    String[] getFruits(){
        String[] f={"Apple","Mango","Orange"};
        return f;
    }

    public static void main(String[] args){
        ReturnArray obj= new ReturnArray();
        String[] S= obj.getFruits();
        for(String P:S){
            System.out.println(P);
        }
    }
}
