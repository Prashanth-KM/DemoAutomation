package Introduction;

public class Condition {
    public static void main(String[] args) {
        int marks=52;
        /*
        * FCD-70 to 100
        * FC- 60 to 70
        * SC- 50 to 60
        * PASS
        * FAIL
        * */

        if((marks>=70) && (marks<=100)){
            System.out.println("FCD");
        }else if(((marks>=60) && (marks<70))){
            System.out.println("FC");
        }else  if((marks>=50)&& (marks<60)){
            System.out.println("SC");
        }
    }
}
