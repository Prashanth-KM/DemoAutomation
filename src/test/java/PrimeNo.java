public class PrimeNo {
    public static void main(String[] args){
        for(int n=0;n<=100;n++) {
            int temp=0;
            for(int i=2;i<=n/2;i++) {
                if(n%i==0) {
                    temp=temp+1;
                }
            }
            if(temp==0) {
                System.out.print(n+" ");
            }
        }
    }
}
