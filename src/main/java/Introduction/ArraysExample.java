package Introduction;

public class ArraysExample {
    public static void main(String[] args) {
       int[] a={1,2,3,4,5};

       int[] b= new int[4];
       b[0]=10;
       b[1]=20;
       b[2]=30;
       b[3]=40;

       for(int i=0;i<a.length;i++){
           System.out.println(a[i]);
       }

        for(int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }

        System.out.println("***************");
        for(int i=a.length-1;i>=0;i--){
            System.out.println(a[i]);
        }

        String[] S={"A","B","C","D","E"};
        System.out.println(S.length);
        for(int i=0;i<S.length;i++){
            System.out.print(S[i]+" ");
        }
        System.out.println("***************");
        char[] C={'a','b','c','d'};
        int i=0;
        while (i<C.length){
            System.out.println(C[i]);
            i++;
        }

        System.out.println("***************");
        String[] S1={"Java","manual","Selenium","Appium"};
        //for each loop
        for (String S2:S1){
            System.out.println(S2);
        }
        System.out.println("***************");
        for(int k=0;k<S1.length;k++){
            System.out.println(S1[k]);
        }
        System.out.println("***************");
        int c[]={1,2,3,4};
        for (int k=0;k<c.length;k++){
            System.out.println(c[k]);
        }
        System.out.println("***************");
        //for each loop
        for(int d:c){
            System.out.println(d);
        }


    }
}
