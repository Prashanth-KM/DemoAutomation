package Basics;

public class NestedIfElse {

    public static void main(String[] args) {
        int marks= 12;
        if((marks>=70) && (marks<=100)){ //FCD-- 70 to 100
            System.out.println("Distinction");
        } else if((marks>=60) && (marks<70)){ //FC -- 60 to 70
            System.out.println("First class");
        } else if((marks>=50) && (marks<60)){ //SC -- 50 to 60
            System.out.println("Second class");
        } else if((marks>=35) && (marks<50)){ //PASS -- 35 to 50
            System.out.println("Pass");
        } else  if((marks>=0) && (marks<35)){ //fail -- 0 to 35
            System.out.println("Fail");
        }
    }

}
