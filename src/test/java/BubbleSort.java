import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args){
        int a[]={1,0,2,0,3,0};//0,0,0,1,2,3
        for(int j=0;j<a.length;j++){
            System.out.print(a[j]+ " ");
        }
        bubbleSort(a);
//        sort();
    }

    static void bubbleSort(int a[]){
        //1,0,2,0,3,0-->0,0,0,1,2,3
        int n = a.length;//6
        int i, j, b;
        for (i = 0; i<n; i++) {
            for (j = i+1; j<n; j++) {//0,0,2,1,3,0
             //i=1, j=2

                if (a[j] < a[i]) {
                    //a[2]<a[1]-->2<1
                    //a[3]<a[1]-->0<1
                    //a[4]<a[1]-->3<0
                    //a[5]<a[1]-->0<0

                    //b=a[1]=1
                    //a[1]=0
                    //a[3]=1
                    b = a[i];
                    a[i] = a[j];
                    a[j] = b;

                }
            }
        }
        System.out.println();
        for(int k=0;k<a.length;k++){
            System.out.print(a[k] +" ");
        }
    }

    static void sort(){
        System.out.println();
        System.out.println("***********");
        int a[]={2,0,1,0,4,0,3,0};//0,0,0,0,1,2,3,4
        Arrays.sort(a);
        for(int j:a){
            System.out.print(j + " ");
        }
    }
}
