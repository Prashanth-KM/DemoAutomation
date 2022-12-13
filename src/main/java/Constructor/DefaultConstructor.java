package Constructor;

public class DefaultConstructor {

    int age;
    String name;

    DefaultConstructor(){
        age=21;
        name="Praveen";
        System.out.println("Age :"+age +",Name :"+name);

    }


    public static void main(String[] args){
        DefaultConstructor obj=new DefaultConstructor();

    }
}
