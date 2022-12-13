package Basics;

public class SwitchStatement {

    public static void main(String[] args) {
        int marks=20;
        switch (marks){
            case 70:
                System.out.println("Distinction");
                break;
            case 60:
                System.out.println("First class");
                break;
            case 50:
                System.out.println("Second Class");
                break;
            case 35:
                System.out.println("Pass");
                break;
            default:
                System.out.println("invalid");
                break;
        }
    }
}
