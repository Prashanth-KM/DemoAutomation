package Introduction;

public class LargestNo {
    public static void main(String[] args) {
        int max=0;
        int a[]= {9000,20,30,60,50000,600};
        for (int i=0; i<a.length; i++) {
            //a[0]>0-->9000>0
            //a[1]>9000-->20>9000
            //a[2]>9000-->30>9000
            //a[3]>9000-->60>9000
            //a[4]>9000-->50000>9000
            //a[5]>50000-->600>50000
            if (a[i] > max) {
                //max=9000--1st
                //max=50000
                max = a[i];
            }
        }
        System.out.println("largest number is:" + max);
    }
}
