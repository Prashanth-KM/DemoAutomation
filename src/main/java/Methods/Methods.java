package Methods;

public class Methods {

    void addition(){
        int a=10;
        int b=20;
        int sum=a+b;
        System.out.println("Sum :"+sum);
    }
    int add(){
        int a=10;
        int b=20;
        int sum=a+b;
        return sum;
    }
    String display(){
        String name="Kiran";
        return name;
    }

    public static void main(String[] args) {
        Methods obj= new Methods();
        obj.addition();
        int sum=obj.add();
        System.out.println("Sum from return type :" +sum);
        System.out.println(obj.add());
        String name=obj.display();
        System.out.println(obj.display());
    }

}
