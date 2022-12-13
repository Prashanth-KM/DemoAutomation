package Introduction;

public class DoWhileLoop {
    public static void main(String[] args) {
        int i=1;
        while (i<=10){
            System.out.println(i);
            i++;
        }

        System.out.println("**************");

        int j=1;
        do {
            System.out.println(j);
            j++;
        }while (j<=10);
        System.out.println("**************");

        int k=1;
        do {
            if(k%2==0){
                System.out.println(k);
            }
            k++;
        }while (k<=10);

        System.out.println("**************");
        for (int l=1;l<=20;l++){
            if(l==6){
                break;
            }
            System.out.println(l);
        }

        System.out.println("**************");
        for (int l=1;l<=20;l++){
            System.out.println(l);
            if(l==5){
                continue;
            }

        }
    }
}
