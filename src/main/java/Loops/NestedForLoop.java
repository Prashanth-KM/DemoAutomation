package Loops;

public class NestedForLoop {
    public static void main(String[] args) {
        for(int i=1;i<=4;i++){//no of rows

            for(int j=1;j<=i;j++){//no of columns
                System.out.print(j);
            }

            System.out.println();
        }

        System.out.println("******************");
        int i=1;
        while (i<=10){
            if(i%2!=0){
                System.out.println(i);
            }
            i++;
        }


        System.out.println("******************");
        int j=1;
        int sum=0;
        do {
            if(j%2==0) {
                 sum=sum+j;
            System.out.println(j);
            }
            j++;

        }while (j<=10);
        System.out.println(sum);
    }

    int a[]={10,20,30,40};
    String[] S= {"apple","ball","cat"};
    char[] C={'a','b'};
}
/*
*
* B
* B B
* B B B
* B B B B
*
* */


