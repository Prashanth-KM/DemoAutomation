package Arrays;

public class ArrayMethod {

    void display(String[] a){
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]+" ");
        }
    }

    public static void main(String[] args){
        ArrayMethod obj= new ArrayMethod();
        String a[]={"10","20","30","40"};
        obj.display(a);
    }
}
