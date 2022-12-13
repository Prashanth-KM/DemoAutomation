package Methods;

public class MethodOverloading {
    void add(){
        int a=10;
        int b=20;
        int sum=a+b;
        System.out.println("Sum :" +sum);
    }
    void add(int c){
        int a=10;
        System.out.println(a+c);
    }
     void add(String s){
        System.out.println("Add :"+s);
    }

    int add(int d,int e){
        int res=d+e;
        return res;
    }

   public static void main(String[] args){
       MethodOverloading obj= new MethodOverloading();
       obj.add();
       obj.add(20);
       obj.add("Method");
       int sun=obj.add(10,20);
       System.out.println("Sum :"+sun);

   }
}
