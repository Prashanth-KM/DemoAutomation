package Arrays;

public class StringArray {
    public static void main(String[] args) {
        String[] S={"A","B","C","D","E","F"};
        for(int i=0;i<S.length;i++){
            System.out.println(S[i]);
        }
        System.out.println("*************");
        for(int j=S.length-1;j>=0;j--){
            System.out.println(S[j]);
        }
    }
}
