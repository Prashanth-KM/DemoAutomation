package Arrays;

public class ArrayExample {

    public static void main(String [] args){

        String[] a= new String[4];
        a[0]="10";
        a[1]="20";
        a[2]="30";
        a[3]="40";

        System.out.println("Size of the array:" +a.length);
        for(int i=0;i<a.length;i++){
            // 0, 1, 2, 3,
//            System.out.println(a[i]);
            //a[0]
            //a[1]
            //a[2]
            //a[3]
        }

        String[] S={"Apple","Ball","cat","Dog","Egg"};
        for (int j=S.length-1;j>=0;j--){
//            System.out.println(S[j]);
            //a[4]=Egg
            //a[3]=Dog
            //a[2]=cat
            //a[1]=Ball
            //a[0]=Apple
        }


        for(int k=10;k>=1;k--){
            System.out.println(k);
        }


    }
}
