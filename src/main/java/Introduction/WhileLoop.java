package Introduction;

public class WhileLoop {

    void printNoFromOneToTen(){
        int i=1;
        while (i<=10){
            System.out.println(i);
            i++;
        }
    }
    void printNoFromTenToOne(){
        int j=10;
        while (j>=1){
            System.out.println(j);
            j--;
        }
    }
    void printOddNoFromOneToTen(){
        int k=1;
        while (k<=10){
            if(k%2==1){
                System.out.println(k);
            }
            k++;
        }
    }
    public static void main(String[] args) {
        WhileLoop obj= new WhileLoop();
        obj.printNoFromOneToTen();
        obj.printNoFromTenToOne();
        obj.printOddNoFromOneToTen();

    }
}
