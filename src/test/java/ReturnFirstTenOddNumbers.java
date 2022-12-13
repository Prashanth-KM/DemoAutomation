public class ReturnFirstTenOddNumbers {
    int[] odd() {
        int a[]=new int [10];
        int k=0;


        for (int i=0;i<=20;i++) {
            if((i%2)!=0) {
                a[k]=i;
                //a[0]=1;
                //a[1]=3;
                //a[2]=5;

                //a[9]=19;
                k++;
            }
        }
        return a;
    }

    void oddNumbers(){
        for(int i=0;i<=20;i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }

    }

    public static void main(String[] args) {
        ReturnFirstTenOddNumbers obj=new ReturnFirstTenOddNumbers();
        int b[]=obj.odd();
        for (int i=0;i<b.length;i++) {
            System.out.println(b[i]);
        }
        System.out.println("****************");
        obj.oddNumbers();

    }

}
