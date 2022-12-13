package Methods;

public class ReturnNumbers {
    int[] printNumbers() {
        int a[] = new int[11];
        int j = 0;
        for (int i = 20; i <= 30; i++) {
            //20,21,22,23,24,25,26,27,28,29,30
            a[j] = i;
            //a[0]=20
            //a[1]=21
            //a[2]=22
            //a[3]=29
            j++;
        }
        return a;
    }
    int[] returnOdd(){
        int c[]= new int[5];
        int k=0;
        for(int i=0;i<=10;i++){
            if(i%2==1){
               c[k]=i;
               k++;
            }
        }
        return c;
    }
    public static void main(String[] args){
        ReturnNumbers obj= new ReturnNumbers();
        int b[]=obj.printNumbers();
        for(int k:b){
            System.out.println(k);
        }

        System.out.println("************");

        int[] l=obj.returnOdd();//{1,3,5,7,9}
        for (int m:l){
            System.out.println(m);
        }



    }
}
