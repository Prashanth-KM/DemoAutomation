package Methods;

public class Maths {

    int add(int a, int b){
        int sum=a+b;
        return sum;
    }

    int sub(int x, int y){
        int sub=x-y;
       return sub;
    }

    void multiply(){
        int p = add(10,10);
        int q = sub(20,10);
        int mult= p*q;
        System.out.println("Multiply :"+mult);
    }
    boolean checkEligibilityForVoting(){
        int a=11;
        if(a>18){
            return  true;
        }else {
            return false;
        }

    }

    void findDuplicateNumbers(){
        System.out.println("Finding the duplicate numbers");
        int a[]={1,2,3,2,3,4};
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    System.out.println(a[i]);
                }
            }
        }
    }

    public static void main(String[] args){
        Maths obj= new Maths();
        obj.multiply();
        obj.findDuplicateNumbers();
        System.out.println("Boolean statement :" +obj.checkEligibilityForVoting());


    }
}
