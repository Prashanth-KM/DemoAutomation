public class Factorial {
    void factorial(int n){
        int fact=1;
        for(int i=n;i>=1;i--){
            fact= fact*i;
            //fact=1*5=5
            //fact=5*4=20
            //fact=20*3=60
            //fact=60*2=120
            //fact=120*1=120

        }
        System.out.println(fact);
    }
    int factorialNo(int n){
        int fact=1;
        for(int i=n;i>=1;i--) {
            fact = fact * i;
        }
        return fact;
    }
   public static void main(String[] args) {
       Factorial obj = new Factorial();
       obj.factorial(3);
       int result=obj.factorialNo(4);
       System.out.println(result);

   }
}
//6*5*4*3*2*1= 6!