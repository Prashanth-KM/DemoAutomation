package Introduction;

public class Exception1 {
    public static void main(String[] args) {
        try{
            int[] a= {1,2,3};
            System.out.println(a[5]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("handled exception");
            e.printStackTrace();
        }

       try {
           String name=null;
           System.out.println(name.length());
       }catch (NullPointerException e){
           e.printStackTrace();
       }

        String S="java";
        System.out.println(S);
    }
}
