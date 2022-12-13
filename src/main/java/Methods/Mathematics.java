package Methods;

public class Mathematics {

    void add(int i, int j){
        int sum=i+j;
        System.out.println("Sum of two numbers :" +sum);
    }

    public static void main(String[] args){
        Mathematics obj= new Mathematics();
        obj.add(10,20);
        obj.add(30,30);
        Maths obj1= new Maths();
        obj1.findDuplicateNumbers();


    }
}
