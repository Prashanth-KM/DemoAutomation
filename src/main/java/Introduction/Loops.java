package Introduction;

public class Loops {
    public static void main(String[] args) {
       for(int i=1;i<=5;i++){
           System.out.println("Java");
           //i=1,1<=5
           //i=2,2<=5
           //i=3,3<=5
           //i=4,4<=5
           //i=5,5<=5
           //6<=5-- fail
       }

       System.out.println("*************");
       for(int i=1;i<=10;i++){
           System.out.println(i);
       }

        System.out.println("*************");
       for(int i=10;i>=1;i--){
           System.out.println(i);
       }
        System.out.println("*************");
       //odd numbers from 1 to 10
        for(int i=1;i<=10;i++){
            if (i%2==1){
                System.out.println(i);
            }

        }
        System.out.println("*************");
        //even numbers from 10 to 1
        for(int i=10;i>=1;i--){
            if (i%2==0) {
                System.out.println(i);
                //10
                //8
            }
        }
        System.out.println("*************");
        //Sum of first 10 numbers
        int sum=0;
        for(int i=1;i<=10;i++){
            sum= sum+i;
        }
        System.out.println(sum);


    }

}
//for loop
//while
//do-while
//for each