package Loops;

public class NestedForLoopEx {
    public static void main(String[] args) {

        for(int i=0;i<2;i++){//rows
            for (int j=0;j<3;j++){//column
                System.out.print("A");
                //AAA
                //AAA
            }
            System.out.println();
        }

        System.out.println("***************");
        for(int x=1;x<=4;x++){
            for(int y=1;y<=4;y++){
                System.out.print(y);
            }
            System.out.println();

        }
    }
}
