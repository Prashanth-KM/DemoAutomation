package Introduction;

public class methodEX {
    int sum(int a, int b){
        int add= a+b;
        return add;
    }

    int sub(int c, int d){
        int diff= c-d;
        return diff;
    }

    void multiply(int a, int b){
        int result= a*b;
        System.out.println("Result :"+result);
    }

    int division(int a, int b){
        int div=a/b;
        return div;
    }


    public static void main(String[] args) {
        methodEX obj= new methodEX();
        int input1=obj.sum(10,20);//30
        int input2=obj.sub(20,10);//10
        obj.multiply(input1,input2);//300

        int result=obj.division(input1,input2);
        System.out.println(result);

    }
}
