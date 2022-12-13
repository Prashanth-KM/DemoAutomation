package Basics;

public class EvenOrOdd {

    public static void main(String[] args) {
        //check whether number is odd or even
        int number =21;
        if(number%2==0){
            System.out.println("Even number");
        }else {
            System.out.println("Odd number");
        }

        if(number%2==1){
            System.out.println("odd number");
        }else {
            System.out.println("Even number");
        }

        if(number%2!=1){
            System.out.println("Even number");
        }else {
            System.out.println("Odd number");
        }

        if(number%2!=0){
            System.out.println("odd number");
        }else {
            System.out.println("Even number");
        }

    }
}
