package Arrays;

public class Test {

    int returnOdd(int number){
        return number;
    }

    int[] returnNumbers(){
        int a[]= new int[10];
        int j=0;

        for(int i=1;i<=10;i++){
            a[j]=i;
            j++;
        }
        return a;
    }

    public static void main(String[] args) {
        Test obj= new Test();
       int n= obj.returnOdd(22);
       System.out.println("Numberv :"+n);
       System.out.println("###########");

       int[] b=obj.returnNumbers();
       for(int c: b){
           System.out.println(c);
       }

    }
}
