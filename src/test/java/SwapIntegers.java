public class SwapIntegers {
    public static void main(String[] args){
        int x=10;//x=20;
        int y=20;//y=10;
        System.out.println("Before swap, x:"+x);
        System.out.println("Before swap, y:"+y);
        x=x+y;//30 =10+20
        //x=30,y=20
        y=x-y;//10= 30-20
        //x=30, y=10
        x=x-y;//20=30-10
        System.out.println("After swap, x:"+x);
        System.out.println("After swap, y:"+y);

    }
}
