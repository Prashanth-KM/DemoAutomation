package Introduction;

public class Factorial {
    public static void main(String[] args) {
        int fact=1;
        int n=6;
        for(int i=n;i>=1;i--){
            fact= fact*i;
            //fact=1*6=6
            //fact=6*5=30
            //fact=30*4=120
            //fact=120*3=360
            //fact=360*2=720
            //fact=720*1=720
        }
        System.out.println(fact);
    }
}
//6!=6x5x4x3x2x1