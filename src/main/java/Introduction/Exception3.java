package Introduction;

public class Exception3 {
    public static void main(String[] args) {
        int a=10;
        System.out.println(a);

        int b=20;
        System.out.println(b);

        System.out.println(a+b);

        try {
            System.out.println(a/0);
        }catch (ArithmeticException e){
            System.out.println("handled exception");
            e.printStackTrace();
        }


        System.out.println(b-a);

        System.out.println(b/a);

    }


}

