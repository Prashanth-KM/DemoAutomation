
public class ReturnEvenOrNot {
    boolean even(int i) {
        if ((i%2)==0) {
            return true;
        }else {
            return false;
        }
    }
    public static void main(String[] args) {
        ReturnEvenOrNot obj=new ReturnEvenOrNot();
        boolean a=obj.even(133);
        System.out.println(a);
    }





}
