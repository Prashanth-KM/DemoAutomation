public class ReturnFebonaciNumbers {
    int[] returnFebonacciNos() {
        int z[]=new int[10];
        int a=0;
        int b=1;
        z[0]=a;
        z[1]=b;
        for (int i=2;i<10;i++) {
            int c=a+b;
            a=b;
            b=c;
            z[i]=c;
            //z[2]=1
            //z[3]=2
            //z[4]=3
        }
        return z;
    }
    public static void main(String[] args) {
        ReturnFebonaciNumbers obj=new ReturnFebonaciNumbers();
        int q[]=obj.returnFebonacciNos();
        for (int kk:q) {
            System.out.print(kk+" ");
        }
    }

}
