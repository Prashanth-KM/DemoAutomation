package Introduction;

public class Exception2 {
    public static void main(String[] args) {
        try {
            int[] a= {1,2,3};
            System.out.println(a[1]);


        }catch (NullPointerException e){
            e.printStackTrace();
        }finally {
            System.out.println("Execute always");
        }

        try {

        }catch (Exception e){

        }


        try {

        }finally {

        }

    }
}
// try catch and finally
// try and catch
// try and finally