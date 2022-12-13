public class Febonacci {
    //first 10 febonaci numbers
    //0, 1,a=0, b=1-->c=0+1=1
    // 1, 2, 3, 5, 8, 13

    //a=0, b=1,  c=1
    //0(a),1(b),1(c)-- a=b, b=c
    //0, 1, 1, 2--


//    0,1,1,2,3,5,8,13,21,34
    public static void main(String[] args){
        int a=0;
        int b=1;
        System.out.println(a);
        System.out.println(b);
        for(int i=2;i<10;i++){
            int c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
        //a=0 b=1 c=0+1=1,  0,1,1
        //a=1 b=1 c=1+1 0,1,1,2 a=1, b=2, c=3
        //a=1 b=2 c=1+2 0,1,1,2,3 a=2,b=3, c=5
        //a=2,b=3 c=5   0,1,1,2,3,5
        //a=3,b=5 c=8   0,1,1,2,3,5,8
        //a=5,b=8
    }

}
